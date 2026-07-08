package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector;

import X.AbstractC1122920fKM;
import X.C09GK;
import X.C09JN;
import X.C0K6H;
import X.C0K6I;
import X.C0UO0;
import X.C1161920gLG;
import X.C11NJ;
import X.C1387310mCn;
import X.C1808280x9m;
import X.C20441214yg;
import X.C206200qq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C480460Ism;
import X.InterfaceC1106030et7;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.DmGuidanceMaxShowCountPerDaySetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.DmGuidanceMaxShowPerRoomSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LivePcsIdentifyCommentMethodSetting;
import com.bytedance.android.livesdk.model.DateFrequencyModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.smb.CommentIdentificationReq;
import webcast.api.smb.CommentIdentificationResp;

/* JADX INFO: loaded from: classes18.dex */
public final class HighIntentCommentDetectorViewModel extends ViewModel {
    public final PcsApi LL;
    public final IHostPCS LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public Room LLILZIL;
    public final C11NJ LLILZLL;
    public final boolean LLIZ;
    public AbstractC1122920fKM LLIZLLLIL;

    public HighIntentCommentDetectorViewModel() {
        this(0);
    }

    public final boolean vQ2() {
        DateFrequencyModel dateFrequencyModelLIZIZ = InterfaceC1106030et7.W7.LIZIZ();
        if (dateFrequencyModelLIZIZ == null) {
            dateFrequencyModelLIZIZ = new DateFrequencyModel(0L, 0);
        }
        if (!C1387310mCn.LJII(dateFrequencyModelLIZIZ.timestamp)) {
            dateFrequencyModelLIZIZ.timestamp = System.currentTimeMillis();
            dateFrequencyModelLIZIZ.frequencyCount = 0;
        }
        int i = dateFrequencyModelLIZIZ.frequencyCount;
        int iWQ2 = wQ2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("frequencyControlCheck: roomShowCount=");
        sbLIZ.append(iWQ2);
        sbLIZ.append(" dailyShownCount=");
        sbLIZ.append(i);
        sbLIZ.append(" maxShownCountPerRoom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" maxShownCountPerDay=");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LIZIZ("DM_guidance", C2188811AlT.LIZIZ(sbLIZ));
        if (iWQ2 >= this.LLILLL || i >= this.LLILZ) {
            C20441214yg.LIZIZ("DM_guidance", "hit frequency control");
            return false;
        }
        C20441214yg.LIZIZ("DM_guidance", "pass frequency control");
        return true;
    }

    public final int wQ2() {
        Long l;
        Map<String, Long> mapLIZIZ = InterfaceC1106030et7.X7.LIZIZ();
        Room room = this.LLILZIL;
        String string = (room != null ? Long.valueOf(room.getId()) : "").toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roomShownCount: LivePluginProperties.HIGH_INTENT_DM_TOOLTIP_SHOW_ROOM_RECORD.value, roomId=");
        Room room2 = this.LLILZIL;
        sbLIZ.append(room2 != null ? Long.valueOf(room2.getId()) : null);
        sbLIZ.append(", roomIdKey=");
        sbLIZ.append(string);
        sbLIZ.append(", map=");
        sbLIZ.append(mapLIZIZ);
        C20441214yg.LIZIZ("DM_guidance", C2188811AlT.LIZIZ(sbLIZ));
        if (mapLIZIZ == null || !mapLIZIZ.containsKey(string) || (l = mapLIZIZ.get(string)) == null) {
            return 0;
        }
        return (int) l.longValue();
    }

    public HighIntentCommentDetectorViewModel(int i) {
        boolean z;
        C480460Ism.LIZ().getClass();
        PcsApi pcsApi = (PcsApi) C480460Ism.LIZIZ(PcsApi.class);
        IHostPCS iHostPCS = (IHostPCS) C1161920gLG.LIZJ(IHostPCS.class);
        this.LL = pcsApi;
        this.LLILLJJLI = iHostPCS;
        this.LLILLL = DmGuidanceMaxShowPerRoomSetting.INSTANCE.getValue();
        this.LLILZ = DmGuidanceMaxShowCountPerDaySetting.INSTANCE.getValue();
        this.LLILZLL = new C11NJ();
        if (LivePcsIdentifyCommentMethodSetting.INSTANCE.getValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZ = z;
    }

    public final void yQ2(String str, final Function1<? super Float, Unit> function1) {
        PcsApi pcsApi;
        String secUid;
        long id;
        User owner;
        if (this.LLILZIL != null && (pcsApi = this.LL) != null) {
            CommentIdentificationReq commentIdentificationReq = new CommentIdentificationReq();
            Room room = this.LLILZIL;
            if (room == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                secUid = "";
            }
            commentIdentificationReq.secAnchorId = secUid;
            Room room2 = this.LLILZIL;
            if (room2 != null) {
                id = room2.getId();
            } else {
                id = 0;
            }
            commentIdentificationReq.roomId = id;
            commentIdentificationReq.commentText = str;
            this.LLILZLL.LIZ(C1808280x9m.LJFF(pcsApi.getHighIntentCommentIdentification(commentIdentificationReq).LJIILIIL(new C0UO0()), null, "/smb/efficiency/comment_identification/", null, 13).LJJLL(new C09JN() { // from class: X.0fJO
                @Override // X.C09JN
                public final void accept(Object obj) {
                    boolean z;
                    CommentIdentificationResp.ResponseData responseData;
                    C1C7U.LIZ("HighIntentCommentDetectorViewModel@877.useHighIntentServerModel$disposable$2");
                    BaseResponse baseResponse = (BaseResponse) obj;
                    int i = 1;
                    if (baseResponse != null && (responseData = (CommentIdentificationResp.ResponseData) baseResponse.data) != null && responseData.commentIdentifyType == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Room room3 = this.LL.LLILZIL;
                    if (!z) {
                        i = 0;
                    }
                    C206200qq.LIZ(room3, i, 0);
                    if (z) {
                        function1.invoke(Float.valueOf(1.0f));
                    }
                    C1C7U.LIZIZ("HighIntentCommentDetectorViewModel@877.useHighIntentServerModel$disposable$2");
                }
            }, new C09JN() { // from class: X.0fJP
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("HighIntentCommentDetectorViewModel@877.useHighIntentServerModel$disposable$3");
                    C206200qq.LIZ(this.LL.LLILZIL, -1, 0);
                    C1C7U.LIZIZ("HighIntentCommentDetectorViewModel@877.useHighIntentServerModel$disposable$3");
                }
            }));
        }
    }

    public static void xQ2(HighIntentCommentDetectorViewModel highIntentCommentDetectorViewModel, int i, double d, float f, String str, int i2) {
        if ((i2 & 2) != 0) {
            d = 0.0d;
        }
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        if ((i2 & 16) != 0) {
            str = null;
        }
        highIntentCommentDetectorViewModel.getClass();
        C206200qq.LIZ(highIntentCommentDetectorViewModel.LLILZIL, i, 1);
        C0K6I.LIZ("livesdk_pcs_comment_identify_perf", C2097608Jq.LJIIIIZZ(new Pair("duration_ms", Double.valueOf(d)), new Pair("result", Integer.valueOf(i)), new Pair("score", Float.valueOf(f)), new Pair("error_log", str), new Pair("scene_name", C09GK.LIZJ)), C2097608Jq.LJ(), C2097608Jq.LJ(), C0K6H.EVENT_TYPE_TEA_LOG);
    }
}
