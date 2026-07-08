package com.ss.android.ugc.gamora.editor.music.mutestrip;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C09CT;
import X.C11S5;
import X.C1701940uOG;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import Y.AfS138S0200000_2;
import Y.AfS171S0100000_2;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.services.edit.IMuteStripApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MuteStripApiServiceImpl implements IMuteStripApiService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(726));
    public boolean LIZIZ;

    public interface MuteStripApi {
        @InterfaceC1501240pAY("/tiktok/v1/creator/music/strip_mute_video/")
        @InterfaceC1501300pAe
        AbstractC19484711Kz<MuteStripResponse> startMuteStrip(@InterfaceC1501050pAF("item_id") String str);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IMuteStripApiService
    public final void setFlag() {
        this.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IMuteStripApiService
    public final boolean checkAndResetFlag() {
        if (!this.LIZIZ) {
            return false;
        }
        this.LIZIZ = false;
        return true;
    }

    public static final class MusicStripMuteVideoData {

        @C09CT("can_enter_preview")
        public final Boolean canEnterPreview;

        public MusicStripMuteVideoData() {
            this(null);
        }

        public MusicStripMuteVideoData(Boolean bool) {
            this.canEnterPreview = bool;
        }
    }

    public static final class MuteStripResponse extends BaseResponse {

        @C09CT("data")
        public final MusicStripMuteVideoData data;

        public MuteStripResponse() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MuteStripResponse) && Intrinsics.LJFF(this.data, ((MuteStripResponse) obj).data);
        }

        public final int hashCode() {
            MusicStripMuteVideoData musicStripMuteVideoData = this.data;
            if (musicStripMuteVideoData == null) {
                return 0;
            }
            return musicStripMuteVideoData.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MuteStripResponse(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public MuteStripResponse(MusicStripMuteVideoData musicStripMuteVideoData) {
            this.data = musicStripMuteVideoData;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IMuteStripApiService
    public final void startMuteStrip(String str, Function1<? super Boolean, Unit> function1, Function1<? super String, Unit> function12) {
        if (str == null) {
            return;
        }
        ((MuteStripApi) this.LIZ.getValue()).startMuteStrip(str).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS138S0200000_2(function12, function1, 1), new AfS171S0100000_2(function12, 22));
    }
}
