package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.retrofit2.mime.TypedOutput;
import webcast.api.interaction.pictionary.PictionaryRankResponse;
import webcast.api.interaction.pictionary.ReviewWordResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface DrawGuessApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/pictionary/end/")
    C11NZ<C470590Icr<DrawGuessEndResponse>> endDrawGuessGameRound(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("pictionary_id") long j2, @InterfaceC1501050pAF("draw_uri") String str, @InterfaceC1501050pAF("end_type") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/pictionary/exit/")
    C11NZ<C470590Icr<DrawGuessSummaryResponse>> exitDrawGuessGame(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("session_id") long j2, @InterfaceC1501050pAF("pictionary_id") long j3, @InterfaceC1501050pAF("draw_uri") String str);

    @InterfaceC1501160pAQ("/webcast/room/pictionary/wordlist/")
    C11NZ<C470590Icr<DrawGuessWordlistResponse>> getMockWordList(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("mock_room_id") long j2);

    @InterfaceC1501160pAQ("/webcast/room/pictionary/rank/")
    C11NZ<C470590Icr<PictionaryRankResponse.ResponseData>> getRoundSummaryData(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("pictionary_id") long j2, @InterfaceC1501070pAH("page_offset") long j3, @InterfaceC1501070pAH("page_size") long j4);

    @InterfaceC1501160pAQ("/webcast/room/pictionary/summary/")
    C11NZ<C470590Icr<DrawGuessSummaryResponse>> getSummaryData(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("session_id") long j2);

    @InterfaceC1501160pAQ("/webcast/room/pictionary/wordlist/")
    C11NZ<C470590Icr<DrawGuessWordlistResponse>> getWordList(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/pictionary/guess/")
    C11NZ<C470590Icr<GuessResponse>> guessWord(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("pictionary_id") long j2, @InterfaceC1501050pAF("content") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/pictionary/review_word/")
    C11NZ<C470590Icr<ReviewWordResponse.ResponseData>> reviewWord(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("word") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/pictionary/start/")
    C11NZ<C470590Icr<StartDrawGuessResponse>> startDrawGuess(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("session_id") long j2, @InterfaceC1501050pAF("word_id") long j3, @InterfaceC1501050pAF("word") String str, @InterfaceC1501050pAF("pictionary_type") int i);

    @InterfaceC1501170pAR("/webcast/room/upload/image/")
    AbstractC19484711Kz<C470590Icr<CoverImageModel>> uploadImage(@InterfaceC1485405rg TypedOutput typedOutput);
}
