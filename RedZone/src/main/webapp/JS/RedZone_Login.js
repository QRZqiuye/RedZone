// 기본 입력값 검증
document.addEventListener('DOMContentLoaded', function () {
  const form = document.getElementById('login-form');

  form.addEventListener('submit', function (e) {
    const username = document.getElementById('username').value.trim();
    const password = document.getElementById('password').value.trim();

    if (username === '') {
      alert('아이디를 입력하세요.');
      e.preventDefault(); // 서버 전송 막기
      return;
    }

    if (password === '') {
      alert('비밀번호를 입력하세요.');
      e.preventDefault();
      return;
    }

    // 모든 검증 통과 시 form 전송
    // e.preventDefault(); 제거하면 자동 전송됨
  });
});

// 비밀번호 보기 토글
function togglePassword(fieldId) {
  const field = document.getElementById(fieldId);
  field.type = field.type === 'password' ? 'text' : 'password';
}
