package kotlin.jvm.internal;

import X.C09AY;
import X.C0CNO;
import X.C0I0B;
import X.C0Y01;
import X.C0Y8T;
import X.C0ZL0;
import X.C0ZQI;
import X.C0ZRA;
import X.C1397620mTQ;
import X.C20642515q3;
import X.C20684815ws;
import X.C2188811AlT;
import X.C458650Hyh;
import X.C830490Whz;
import X.C865530XxP;
import X.C869590Y9l;
import X.C877320YbK;
import X.C893930Z5b;
import X.EnumC885270Yo9;
import X.InterfaceC863600XuI;
import X.InterfaceC867020Xzo;
import X.InterfaceC879010Ye3;
import android.app.Activity;
import android.content.Context;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingPersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingTransientExt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS54S1300000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS54S1300000_14 awS54S1300000_14, Object obj) {
        ((C865530XxP) awS54S1300000_14.l1).LIZIZ.invoke(awS54S1300000_14.s0).LJJL((List) awS54S1300000_14.l2, (Map) awS54S1300000_14.l3, (InterfaceC867020Xzo) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS54S1300000_14 awS54S1300000_14, Object obj) {
        ((C0Y01) awS54S1300000_14.l1).LIZIZ.invoke(awS54S1300000_14.s0).LJJZ((BizConvSettingPersistentExt) awS54S1300000_14.l2, (BizConvSettingTransientExt) awS54S1300000_14.l3, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS54S1300000_14 r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS54S1300000_14.invoke$2(kotlin.jvm.internal.AwS54S1300000_14, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS54S1300000_14 awS54S1300000_14, Object obj) {
        C830490Whz c830490WhzLIZ = C458650Hyh.LIZ(new Pair("enter_from", "chat"), new Pair("conversation_id", ((SessionInfo) awS54S1300000_14.l1).getConversationId()), new Pair("chat_type", awS54S1300000_14.s0), new Pair("message_id", String.valueOf(((C869590Y9l) awS54S1300000_14.l2).getMsgId())));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_chat_hidetranscript_btn_click", c830490WhzLIZ);
        boolean z = C0ZRA.LIZ;
        long msgId = ((C869590Y9l) awS54S1300000_14.l2).getMsgId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideTranscript ");
        sbLIZ.append(msgId);
        C2188811AlT.LIZIZ(sbLIZ);
        C0ZRA.LIZJ();
        C0ZRA.LJ(msgId, "Voice Message Transcript: hide transcript", AFwS248S0000000_14.get$arr$(387));
        ((C0ZQI) awS54S1300000_14.l3).LJ(C0ZL0.VOICE_TRANSCRIBE_HIDE, null);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS54S1300000_14 awS54S1300000_14, Object obj) {
        List list = (List) obj;
        Activity activity = (Activity) awS54S1300000_14.l1;
        if (activity != null) {
            C877320YbK c877320YbK = C877320YbK.LIZ;
            String strLJ = C20642515q3.LJ(2131755206, list.size(), Integer.valueOf(list.size()));
            AwS36S1400000_14 awS36S1400000_14 = new AwS36S1400000_14((Activity) awS54S1300000_14.l1, (Activity) awS54S1300000_14.s0, (String) list, (List<SetConversationSettingInfoResponseBody>) awS54S1300000_14.l2, (InterfaceC879010Ye3) awS54S1300000_14.l3, (EnumC885270Yo9) 1);
            c877320YbK.getClass();
            C0CNO.LIZLLL(0L, new AwS121S1200000_4(awS36S1400000_14, activity, strLJ, 2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS54S1300000_14 awS54S1300000_14, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131828486, new AwS128S1100000_14(awS54S1300000_14.s0, (Context) awS54S1300000_14.l1, 11));
        c1397620mTQ.LJ(2131835218, new AwS98S1200000_14((C0Y8T) awS54S1300000_14.l2, awS54S1300000_14.s0, (Activity) awS54S1300000_14.l3, 14));
        c1397620mTQ.LJII(R.string.f1_, AFwS248S0000000_14.get$arr$(461));
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS54S1300000_14 awS54S1300000_14, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        ((C893930Z5b) awS54S1300000_14.l1).getClass();
        c1397620mTQ.LJ(2131835218, new AwS98S1200000_14((C0Y8T) awS54S1300000_14.l2, awS54S1300000_14.s0, (Activity) awS54S1300000_14.l3, 15));
        c1397620mTQ.LJII(R.string.f1_, AFwS248S0000000_14.get$arr$(462));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS54S1300000_14(C865530XxP c865530XxP, C865530XxP c865530XxP2, String str, List<Long> list, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l1 = c865530XxP;
        this.s0 = c865530XxP2;
        this.l2 = str;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S1300000_14(C0Y01 c0y01, String str, BizConvSettingPersistentExt bizConvSettingPersistentExt, BizConvSettingTransientExt bizConvSettingTransientExt, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0y01;
        this.s0 = str;
        this.l2 = bizConvSettingPersistentExt;
        this.l3 = bizConvSettingTransientExt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S1300000_14(C893930Z5b c893930Z5b, C0Y8T c0y8t, String str, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.l1 = c893930Z5b;
        this.l2 = c0y8t;
        this.s0 = str;
        this.l3 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S1300000_14(Activity activity, Context context, C0Y8T c0y8t, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
        this.l2 = c0y8t;
        this.l3 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S1300000_14(Activity activity, String str, InterfaceC879010Ye3 interfaceC879010Ye3, EnumC885270Yo9 enumC885270Yo9, int i) {
        super(1);
        this.$t = i;
        this.l1 = activity;
        this.s0 = str;
        this.l2 = interfaceC879010Ye3;
        this.l3 = enumC885270Yo9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S1300000_14(SessionInfo sessionInfo, String str, C869590Y9l c869590Y9l, C0ZQI c0zqi, int i) {
        super(1);
        this.$t = i;
        this.l1 = sessionInfo;
        this.s0 = str;
        this.l2 = c869590Y9l;
        this.l3 = c0zqi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS54S1300000_14(MediaGridViewModel mediaGridViewModel, MediaGridViewModel mediaGridViewModel2, C869590Y9l c869590Y9l, List<? extends C869590Y9l> list, String str) {
        super(1);
        this.$t = str;
        this.l1 = mediaGridViewModel;
        this.l2 = mediaGridViewModel2;
        this.l3 = c869590Y9l;
        this.s0 = list;
    }
}
