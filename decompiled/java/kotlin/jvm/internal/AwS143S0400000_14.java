package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C0Y8T;
import X.C0Y8W;
import X.C0Y8Y;
import X.C0YAE;
import X.C0Z1R;
import X.C0ZLS;
import X.C0ZXC;
import X.C1061730djf;
import X.C1360890lWB;
import X.C1383370m6R;
import X.C1389910mGz;
import X.C14KQ;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1710306mr;
import X.C2097608Jq;
import X.C397901gf;
import X.C418440Gaw;
import X.C724240Sb0;
import X.C814420VxA;
import X.C870400YCo;
import X.C899820ZRs;
import X.C899830ZRt;
import X.C909290Zln;
import X.InterfaceC904700ZeO;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.components.EventCenterComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public class AwS143S0400000_14 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS143S0400000_14 awS143S0400000_14) {
        ChatLinearLayoutManager chatLinearLayoutManager;
        IMSelectTextAbility iMSelectTextAbility;
        Fragment fragmentLJI = C724240Sb0.LJI((UIContentAssem) awS143S0400000_14.l0);
        if (fragmentLJI != null && (iMSelectTextAbility = (IMSelectTextAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IMSelectTextAbility.class, null)) != null && iMSelectTextAbility.VU()) {
            iMSelectTextAbility.dl0(C0ZLS.TAP_SCROLL_BOTTOM);
        } else if (!((InterfaceC904700ZeO) ((C01GW) awS143S0400000_14.l2).getValue()).LIZIZ()) {
            ((ChatroomEventAbility) ((C01GW) awS143S0400000_14.l3).getValue()).refresh();
        } else {
            RecyclerView.LayoutManager layoutManager = ((ViewOnAttachStateChangeListenerC20604515jv) awS143S0400000_14.l1).getLayoutManager();
            if ((layoutManager instanceof ChatLinearLayoutManager) && (chatLinearLayoutManager = (ChatLinearLayoutManager) layoutManager) != null) {
                chatLinearLayoutManager.LJIILLIIL((ViewOnAttachStateChangeListenerC20604515jv) awS143S0400000_14.l1);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS143S0400000_14 r10) {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS143S0400000_14.invoke$1(kotlin.jvm.internal.AwS143S0400000_14):java.lang.Object");
    }

    public static final Object invoke$2(AwS143S0400000_14 awS143S0400000_14) {
        String strLIZIZ = C1710306mr.LIZIZ(2131830214, C1383370m6R.LJIIJ(((NoticeFeature) awS143S0400000_14.l0).LJI()));
        C1389910mGz c1389910mGz = new C1389910mGz((Activity) awS143S0400000_14.l1);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LJIIJ(strLIZIZ);
        c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C14KQ.LIZLLL((Activity) awS143S0400000_14.l1));
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 0;
        c1360890lWB.LIZLLL = 3;
        c1389910mGz.LIZ.LJ = new AwS48S0500000_14((Activity) awS143S0400000_14.l1, c1389910mGz, (C909290Zln) awS143S0400000_14.l2, (NoticeFeature) awS143S0400000_14.l0, (C0Z1R) awS143S0400000_14.l3, 1);
        c1389910mGz.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS143S0400000_14 awS143S0400000_14) {
        String name;
        String string;
        String secOwner;
        Long lValueOf;
        String desc;
        Map<String, String> ext;
        String icon;
        String notice;
        Map<String, String> ext2;
        Long lValueOf2;
        String strUtf8;
        Map<String, String> ext3;
        String str;
        Map<String, String> ext4;
        String str2;
        String string2;
        EventCenterComponent eventCenterComponent = (EventCenterComponent) awS143S0400000_14.l0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        new C1061730djf();
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("conversationId", ((EventCenterComponent) awS143S0400000_14.l0).LLILLJJLI.getConversationId());
        pairArr[1] = new Pair("shortId", String.valueOf(((C0Y8T) awS143S0400000_14.l1).getConversationShortId()));
        pairArr[2] = new Pair("conversationType", Integer.valueOf(((C0Y8T) awS143S0400000_14.l1).getConversationType()));
        List<C0YAE> list = (List) awS143S0400000_14.l2;
        Map map = (Map) awS143S0400000_14.l3;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C0YAE c0yae : list) {
            Pair[] pairArr2 = new Pair[5];
            C870400YCo c870400YCo = (C870400YCo) map.get(Long.valueOf(c0yae.getUid()));
            if (c870400YCo != null) {
                string2 = Long.valueOf(c870400YCo.LLILZ).toString();
            } else {
                string2 = null;
            }
            pairArr2[0] = new Pair("pigeonReadIndex", string2);
            pairArr2[1] = new Pair("bizRole", c0yae.getAlias());
            pairArr2[2] = new Pair("userId", String.valueOf(c0yae.getUid()));
            pairArr2[3] = new Pair("sortOrder", Long.valueOf(c0yae.getSortOrder()));
            pairArr2[4] = new Pair("secUserId", c0yae.getSecUid());
            arrayList.add(C2097608Jq.LJIIIIZZ(pairArr2));
        }
        pairArr[3] = new Pair("members", arrayList);
        pairArr[4] = new Pair("readIndex", String.valueOf(((C0Y8T) awS143S0400000_14.l1).getReadIndex()));
        pairArr[5] = new Pair("isMember", Boolean.valueOf(((C0Y8T) awS143S0400000_14.l1).isMember()));
        pairArr[6] = new Pair("unreadCount", Long.valueOf(((C0Y8T) awS143S0400000_14.l1).getUnreadCount()));
        pairArr[7] = new Pair("updateAt", Long.valueOf(((C0Y8T) awS143S0400000_14.l1).getUpdatedTime()));
        Pair[] pairArr3 = new Pair[9];
        C0Y8Y coreInfo = ((C0Y8T) awS143S0400000_14.l1).getCoreInfo();
        if (coreInfo != null) {
            name = coreInfo.getName();
        } else {
            name = null;
        }
        pairArr3[0] = new Pair("name", name);
        C0Y8Y coreInfo2 = ((C0Y8T) awS143S0400000_14.l1).getCoreInfo();
        if (coreInfo2 != null) {
            string = Long.valueOf(coreInfo2.getOwner()).toString();
        } else {
            string = null;
        }
        pairArr3[1] = new Pair("ownerId", string);
        C0Y8Y coreInfo3 = ((C0Y8T) awS143S0400000_14.l1).getCoreInfo();
        if (coreInfo3 != null) {
            secOwner = coreInfo3.getSecOwner();
        } else {
            secOwner = null;
        }
        pairArr3[2] = new Pair("secOwnerId", secOwner);
        C0Y8Y coreInfo4 = ((C0Y8T) awS143S0400000_14.l1).getCoreInfo();
        if (coreInfo4 != null) {
            lValueOf = Long.valueOf(coreInfo4.getVersion());
        } else {
            lValueOf = null;
        }
        pairArr3[3] = new Pair("version", lValueOf);
        C0Y8Y coreInfo5 = ((C0Y8T) awS143S0400000_14.l1).getCoreInfo();
        if (coreInfo5 != null) {
            desc = coreInfo5.getDesc();
        } else {
            desc = null;
        }
        pairArr3[4] = new Pair("desc", desc);
        C0Y8Y coreInfo6 = ((C0Y8T) awS143S0400000_14.l1).getCoreInfo();
        if (coreInfo6 != null) {
            ext = coreInfo6.getExt();
        } else {
            ext = null;
        }
        pairArr3[5] = new Pair("ext", ext);
        C0Y8Y coreInfo7 = ((C0Y8T) awS143S0400000_14.l1).getCoreInfo();
        if (coreInfo7 != null) {
            icon = coreInfo7.getIcon();
        } else {
            icon = null;
        }
        pairArr3[6] = new Pair("icon", icon);
        C0Y8Y coreInfo8 = ((C0Y8T) awS143S0400000_14.l1).getCoreInfo();
        if (coreInfo8 != null) {
            notice = coreInfo8.getNotice();
        } else {
            notice = null;
        }
        pairArr3[7] = new Pair("notice", notice);
        pairArr3[8] = new Pair("inboxType", Integer.valueOf(((C0Y8T) awS143S0400000_14.l1).getInboxType()));
        pairArr[8] = new Pair("coreInfo", C2097608Jq.LJIIIIZZ(pairArr3));
        Pair[] pairArr4 = new Pair[4];
        C0Y8W settingInfo = ((C0Y8T) awS143S0400000_14.l1).getSettingInfo();
        if (settingInfo != null) {
            ext2 = settingInfo.getExt();
        } else {
            ext2 = null;
        }
        pairArr4[0] = new Pair("ext", ext2);
        pairArr4[1] = new Pair("readIndex", String.valueOf(((C0Y8T) awS143S0400000_14.l1).getReadIndex()));
        pairArr4[2] = new Pair("minIndex", String.valueOf(((C0Y8T) awS143S0400000_14.l1).getMinIndex()));
        C0Y8W settingInfo2 = ((C0Y8T) awS143S0400000_14.l1).getSettingInfo();
        if (settingInfo2 != null) {
            lValueOf2 = Long.valueOf(settingInfo2.getVersion());
        } else {
            lValueOf2 = null;
        }
        pairArr4[3] = new Pair("version", lValueOf2);
        pairArr[9] = new Pair("settingInfo", C2097608Jq.LJIIIIZZ(pairArr4));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C0Y8T c0y8t = (C0Y8T) awS143S0400000_14.l1;
        C0Y8Y coreInfo9 = c0y8t.getCoreInfo();
        if (coreInfo9 != null && (ext4 = coreInfo9.getExt()) != null && (str2 = ext4.get("countdown_time")) != null) {
            mapLJIIJ.put("countdownTime", Long.valueOf(CastLongProtector.parseLong(str2)));
        }
        C0Y8Y coreInfo10 = c0y8t.getCoreInfo();
        if (coreInfo10 != null && (ext3 = coreInfo10.getExt()) != null && (str = ext3.get("countdown")) != null) {
            mapLJIIJ.put("countdown", Boolean.valueOf(Boolean.parseBoolean(str)));
        }
        ByteString bizExt = c0y8t.getBizExt();
        if (bizExt != null && (strUtf8 = bizExt.utf8()) != null) {
            mapLJIIJ.put("bizExt", strUtf8);
        }
        eventCenterComponent.LJJLIIIJJIZ(new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(mapLJIIJ), "ecim.conversationChange"));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS143S0400000_14(UIContentAssem uIContentAssem, UIContentAssem uIContentAssem2, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C01GW<? extends InterfaceC904700ZeO> c01gw, C01GW<? extends ChatroomEventAbility> c01gw2) {
        super(0);
        this.$t = c01gw2;
        this.l0 = uIContentAssem;
        this.l1 = uIContentAssem2;
        this.l2 = viewOnAttachStateChangeListenerC20604515jv;
        this.l3 = c01gw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS143S0400000_14(EventCenterComponent eventCenterComponent, EventCenterComponent eventCenterComponent2, C0Y8T c0y8t, List<C0YAE> list, Map<Long, ? extends C870400YCo> map) {
        super(0);
        this.$t = map;
        this.l0 = eventCenterComponent;
        this.l1 = eventCenterComponent2;
        this.l2 = c0y8t;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S0400000_14(NoticeFeature noticeFeature, Activity activity, C909290Zln c909290Zln, C0Z1R c0z1r, int i) {
        super(0);
        this.$t = i;
        this.l0 = noticeFeature;
        this.l1 = activity;
        this.l2 = c909290Zln;
        this.l3 = c0z1r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S0400000_14(VoiceAssem voiceAssem, C899830ZRt c899830ZRt, C899820ZRs c899820ZRs, C0ZXC c0zxc, int i) {
        super(0);
        this.$t = i;
        this.l0 = voiceAssem;
        this.l1 = c899830ZRt;
        this.l2 = c899820ZRs;
        this.l3 = c0zxc;
    }
}
