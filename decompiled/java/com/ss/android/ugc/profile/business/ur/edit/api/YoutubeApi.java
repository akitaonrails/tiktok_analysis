package com.ss.android.ugc.profile.business.ur.edit.api;

import X.C09CT;
import X.C0CQT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC2193881Ate;
import android.content.Context;
import android.util.Log;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes35.dex */
public final class YoutubeApi {
    public static final YoutubeApi LIZ = new YoutubeApi();
    public static final InterfaceC2193881Ate LIZIZ = (InterfaceC2193881Ate) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InterfaceC2193881Ate.class);

    public static final boolean LIZIZ() {
        Integer num;
        try {
            YouTubeResponse youTubeResponse = LIZIZ.unlink().get();
            if (youTubeResponse == null || (num = youTubeResponse.statusCode) == null) {
                return false;
            }
            return num.intValue() == 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final class YouTubeResponse {

        @C09CT("error_msg")
        public final String errorMessage;

        @C09CT("fail_reason")
        public final YouTubeErrorStruct errorStruct;

        @C09CT("status_code")
        public final Integer statusCode;

        @C09CT("bind_info")
        public final YoutubeChannelStruct youtubeData;

        public YouTubeResponse() {
            this(0, "", null, null);
        }

        public static final class YouTubeErrorStruct {

            @C09CT("code")
            public final Integer code;

            @C09CT("message")
            public final String message;

            public YouTubeErrorStruct() {
                this(0, "");
            }

            public YouTubeErrorStruct(Integer num, String str) {
                this.code = num;
                this.message = str;
            }
        }

        public static final class YoutubeChannelStruct {

            @C09CT("channel_id")
            public final String channelId;

            @C09CT("channel_title")
            public final String channelTitle;

            @C09CT("google_account")
            public final String googleAccount;

            public YoutubeChannelStruct() {
                this(null, null, null);
            }

            public YoutubeChannelStruct(String str, String str2, String str3) {
                this.googleAccount = str;
                this.channelId = str2;
                this.channelTitle = str3;
            }
        }

        public YouTubeResponse(Integer num, String str, YouTubeErrorStruct youTubeErrorStruct, YoutubeChannelStruct youtubeChannelStruct) {
            this.statusCode = num;
            this.errorMessage = str;
            this.errorStruct = youTubeErrorStruct;
            this.youtubeData = youtubeChannelStruct;
        }
    }

    public static String LIZ(Context context, Exception exc, Integer num, YouTubeResponse youTubeResponse) {
        String stackTraceString;
        int iB4;
        Integer num2;
        String str;
        Integer num3;
        YouTubeResponse.YouTubeErrorStruct youTubeErrorStruct;
        YouTubeResponse.YouTubeErrorStruct youTubeErrorStruct2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Exception: ");
        if (exc == null || (stackTraceString = exc.getMessage()) == null) {
            stackTraceString = Log.getStackTraceString(exc);
        }
        sbLIZ2.append(stackTraceString);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(", gms_code: ");
        try {
            iB4 = C786410Ut5.b4(GoogleApiAvailability.getInstance(), context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iB4 = 1;
        }
        sbLIZ.append(iB4);
        sbLIZ.append(", oauth_code: ");
        sbLIZ.append(num);
        sbLIZ.append(", resp_code: ");
        String str2 = null;
        if (youTubeResponse != null) {
            num2 = youTubeResponse.statusCode;
        } else {
            num2 = null;
        }
        sbLIZ.append(num2);
        sbLIZ.append(", resp_msg: ");
        if (youTubeResponse != null) {
            str = youTubeResponse.errorMessage;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", yt_code: ");
        if (youTubeResponse != null && (youTubeErrorStruct2 = youTubeResponse.errorStruct) != null) {
            num3 = youTubeErrorStruct2.code;
        } else {
            num3 = null;
        }
        sbLIZ.append(num3);
        sbLIZ.append(", yt_msg: ");
        if (youTubeResponse != null && (youTubeErrorStruct = youTubeResponse.errorStruct) != null) {
            str2 = youTubeErrorStruct.message;
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
