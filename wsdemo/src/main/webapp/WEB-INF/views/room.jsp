<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>채팅방</title>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

  <script>
    function submitChatMessageForm(form) {
      form.writer.value = form.writer.value.trim();

      if (form.writer.value.length == 0) {
        alert("작성자를 입력해주세요.");
        form.writer.focus();

        return false;
      }

      if (form.writer.value.length == 0) {
        alert("내용을 입력해주세요.");
        form.body.focus();

        return false;
      }

      var writer = form.writer.value;
      var body = form.body.value;

      form.body.value = '';
      form.body.focus();

      $.post(
        './addMessage',
          {
            roomId : 1,
            writer : writer,
            body : body
          },
          function (data){
          console.log(data.msg);
          },
          'json'
      );
    }
  </script>
</head>
<body>
<h1>1번방</h1>

<form onsubmit="submitChatMessageForm(this); return false;">
  <div>
    <input type="text" name="writer" placeholder="작성자" autocomplete="off">
  </div>
  <div>
    <input type="text" name="writer" placeholder="내용" autocomplete="off">
  </div>
  <div>
    <input type="submit" value="작성">
  </div>
</form>
</body>
</html>