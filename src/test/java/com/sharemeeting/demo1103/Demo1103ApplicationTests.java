package com.sharemeeting.demo1103;

import com.sharemeeting.demo1103.beans.MeetingRoom;
import com.sharemeeting.demo1103.mapper.MeetingRoomMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo1103ApplicationTests {
	@Test
	void contextLoads() {
	}
	@Autowired
	MeetingRoomMapper meetingRoomMapper;

	@Test
	void insertMR(){
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.setAddress("北京邮电大学");
		meetingRoom.setName("3-234");
		meetingRoom.setCapacity(2);
		meetingRoom.setUsername("NULL");
		meetingRoomMapper.insertMeetingRoom(meetingRoom);
	}
}
