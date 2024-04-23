package vn.phh235.bookstorebackend;

import org.junit.jupiter.api.Test;
import org.mockito.internal.stubbing.answers.AnswersWithDelay;
import org.springframework.boot.test.context.SpringBootTest;
import vn.phh235.bookstorebackend.entity.TheLoai;

@SpringBootTest
class BookStoreBackendApplicationTests {

	@Test
	void contextLoads() {
		TheLoai theLoai = new TheLoai();
		theLoai.setMaTheLoai(1);
		theLoai.setTenTheLoai("Java OOP");
	}

}
