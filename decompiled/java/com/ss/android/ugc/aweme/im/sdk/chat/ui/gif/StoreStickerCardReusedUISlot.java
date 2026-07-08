package com.ss.android.ugc.aweme.im.sdk.chat.ui.gif;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0H6Q;
import X.C0I6Y;
import X.C0I9I;
import X.C0ICM;
import X.C0ICP;
import X.C0ICQ;
import X.C0ICR;
import X.C0ICT;
import X.C0ICV;
import X.C0ICZ;
import X.C0IDR;
import X.C0QSJ;
import X.C0ZFQ;
import X.C1331070kk5;
import X.C1336205Ku;
import X.C1383370m6R;
import X.C138600fw;
import X.C1388190mED;
import X.C13LE;
import X.C13LQ;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19EG;
import X.C19MX;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C300630BqP;
import X.C314880CVy;
import X.C418440Gaw;
import X.C444350Hbd;
import X.C451140Hma;
import X.C452501pT;
import X.C457780HxI;
import X.C461530I7z;
import X.C462590ICb;
import X.C462620ICe;
import X.C462630ICf;
import X.C687700QyG;
import X.C723590SZx;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C898900ZOe;
import X.C902500Zaq;
import X.C912220ZqW;
import X.EnumC451180Hme;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.InterfaceC911210Zot;
import Y.ACListenerS141S0100000_6;
import android.graphics.drawable.Animatable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.StoreStickerCardReusedUISlot;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS90S0210000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StoreStickerCardReusedUISlot extends ReusedUISlotAssem<StoreStickerCardReusedUISlot> implements InterfaceC712990Rxx<C0ICT>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public AnonymousClass0956 LLJZIJLIL;
    public int LLL;
    public AwS90S0210000_6 LLLI;
    public volatile InterfaceC911210Zot LLLII;
    public InterfaceC665370Q7z LLLIIII;
    public C0QSJ LLLIIIIL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 319));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 320));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 321));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(91));
    public Pair<String, String> LLJLLL = new Pair<>("", "");
    public final C902500Zaq LLJZ = new C902500Zaq();
    public final long LLLF = 30000;
    public final long[] LLLFF = {3000, Mp4ScreenVideoLoadTimeout.CONTROL, 10000};
    public final String LLLFFI = "sticker_video_holder_new_";
    public final C0ICP LLLFZ = new C0I9I() { // from class: X.0ICP
        @Override // X.C0I9I
        public final void LIZJ(String str) {
        }

        @Override // X.C0I9I
        public final boolean LIZLLL() {
            return false;
        }

        @Override // X.C0I9I
        public final void LIZIZ(String str, Throwable th) {
            String message;
            if (this.LIZ.Ip()) {
                this.LIZ.Gp();
            } else {
                StoreStickerCardReusedUISlot.Jp(this.LIZ, false, th, 1);
            }
            StoreStickerCardReusedUISlot storeStickerCardReusedUISlot = this.LIZ;
            if (th == null || (message = th.getMessage()) == null) {
                message = "";
            }
            storeStickerCardReusedUISlot.LLJZ.LIZ(storeStickerCardReusedUISlot.Bp(), new C0ZYR(message));
        }

        @Override // X.C0I9I
        public final void LIZ(String str, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
            StoreStickerCardReusedUISlot storeStickerCardReusedUISlot = this.LIZ;
            AnonymousClass0956 anonymousClass0956 = storeStickerCardReusedUISlot.LLJZIJLIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            storeStickerCardReusedUISlot.LLJZIJLIL = null;
            storeStickerCardReusedUISlot.LLL = 0;
            this.LIZ.Ap().setTag(R.id.kad, this.LIZ.Ep());
            StoreStickerCardReusedUISlot storeStickerCardReusedUISlot2 = this.LIZ;
            storeStickerCardReusedUISlot2.LLJZ.LIZ(storeStickerCardReusedUISlot2.Bp(), C0ICO.LIZ);
            this.LIZ.Tp();
            StoreStickerCardReusedUISlot storeStickerCardReusedUISlot3 = this.LIZ;
            InterfaceC911210Zot interfaceC911210ZotTp = storeStickerCardReusedUISlot3.LLLII;
            if (interfaceC911210ZotTp == null) {
                synchronized (storeStickerCardReusedUISlot3) {
                    interfaceC911210ZotTp = storeStickerCardReusedUISlot3.LLLII;
                    if (interfaceC911210ZotTp == null) {
                        interfaceC911210ZotTp = storeStickerCardReusedUISlot3.tp();
                        storeStickerCardReusedUISlot3.LLLII = interfaceC911210ZotTp;
                    }
                }
            }
            interfaceC911210ZotTp.LIZLLL(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(this.LIZ)).getUuid(), new InterfaceC2187608he() { // from class: X.1EEU
                public static final C1EEW LIZIZ = C1EEW.LIZ;
                public static final String LIZJ = "main_image_sticker";

                @Override // X.InterfaceC2187608he
                public final String LIZ() {
                    return LIZJ;
                }

                @Override // X.InterfaceC2187608he
                public final InterfaceC2187908hh LJJJ() {
                    return LIZIZ;
                }
            });
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoreStickerCardReusedUISlot.class, "messageListFMPTracker", "getMessageListFMPTracker()Lcom/ss/android/ugc/aweme/im/messagelist/perf/IMMessageListFMPTracker;", 0);
        C13LE.LIZ.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cls;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C444350Hbd Ap() {
        return (C444350Hbd) this.LLJLL.getValue();
    }

    public final void Gp() {
        Long lLJJIIJZLJL = C13LQ.LJJIIJZLJL(this.LLL, this.LLLFF);
        if (lLJJIIJZLJL != null) {
            long jLongValue = lLJJIIJZLJL.longValue();
            this.LLL++;
            this.LLJZIJLIL = C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(getLifecycle()), null, null, new C314880CVy(jLongValue, this, null), 3);
        }
    }

    public final void Tp() {
        C0ICM c0icm = (C0ICM) this.LLJLLIL.getValue();
        if (c0icm != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            C0ZFQ c0zfqLJIL = c0icm.LJIL(C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)));
            if (c0zfqLJIL == null || !c0zfqLJIL.LIZJ()) {
                return;
            }
            C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJJIJIIJI(Ap());
            c0zfqLJIL.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x0523  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp() {
        /*
            Method dump skipped, instruction units count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.StoreStickerCardReusedUISlot.sp():void");
    }

    public final InterfaceC911210Zot tp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLLIIIIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLIIII;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLLIIII = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLLIIIIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC911210Zot interfaceC911210Zot = (InterfaceC911210Zot) c0qsjLIZLLL.getAbility(InterfaceC911210Zot.class);
        C687700QyG.LJ(interfaceC911210Zot, InterfaceC911210Zot.class);
        return interfaceC911210Zot;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        AnonymousClass0956 anonymousClass0956 = this.LLJZIJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJZIJLIL = null;
        this.LLL = 0;
        this.LLLI = null;
        Ap().setTag(R.id.kad, null);
    }

    public final RoundingCornerLayout yp() {
        return (RoundingCornerLayout) this.LLJLIL.getValue();
    }

    public final StickerTemplate zp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C0ICT) (c724270Sb3 != null ? c724270Sb3.LL : null)).getContent();
    }

    public final String Bp() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLLFFI);
        sbLIZ.append(Fp());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String Ep() {
        BaseRequestComponent baseRequestComponent;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        StickerTemplate stickerTemplateZp = zp();
        if (stickerTemplateZp == null || (baseRequestComponent = stickerTemplateZp.baseRequestComponent) == null || (queryDataComponent = baseRequestComponent.queryData) == null || (map = queryDataComponent.extras) == null) {
            return null;
        }
        return map.get("a:sticker_id");
    }

    public final String Fp() {
        BaseRequestComponent baseRequestComponent;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        StickerTemplate stickerTemplateZp = zp();
        if (stickerTemplateZp == null || (baseRequestComponent = stickerTemplateZp.baseRequestComponent) == null || (queryDataComponent = baseRequestComponent.queryData) == null || (map = queryDataComponent.extras) == null) {
            return null;
        }
        return map.get("a:sticker_type");
    }

    public final boolean Ip() {
        if (!C0ICV.LIZ().enableImageAutoRetry) {
            return false;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        long localCreatedAt = C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)).getLocalCreatedAt();
        return localCreatedAt > 0 && System.currentTimeMillis() - localCreatedAt < this.LLLF && this.LLL < this.LLLFF.length;
    }

    public final void Qp() {
        StickerTemplate stickerTemplateZp;
        FragmentManager supportFragmentManager;
        MessageListStickerClickAbility messageListStickerClickAbility = (MessageListStickerClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MessageListStickerClickAbility.class, null);
        if (messageListStickerClickAbility == null) {
            return;
        }
        String strFp = Fp();
        if (Intrinsics.LJFF(strFp, String.valueOf(EnumC451180Hme.STATIC.getType())) || Intrinsics.LJFF(strFp, String.valueOf(EnumC451180Hme.ANIMATED.getType()))) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(yp().getContext());
            if (c19egLIZIZ == null || (stickerTemplateZp = zp()) == null) {
                return;
            }
            if (!C138600fw.LIZ()) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                messageListStickerClickAbility.Gl1(c19egLIZIZ, C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)), stickerTemplateZp);
                return;
            } else {
                RoundingCornerLayout roundingCornerLayoutYp = yp();
                C724270Sb3 c724270Sb32 = this.LLJI;
                messageListStickerClickAbility.zM(roundingCornerLayoutYp, c19egLIZIZ, C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb32 != null ? c724270Sb32.LL : null)), stickerTemplateZp);
                return;
            }
        }
        if (Intrinsics.LJFF(strFp, String.valueOf(EnumC451180Hme.AIMOJI_STICKER_STATIC.getType()))) {
            RoundingCornerLayout roundingCornerLayoutYp2 = yp();
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(yp().getContext());
            if (c19egLIZIZ2 == null || (supportFragmentManager = c19egLIZIZ2.getSupportFragmentManager()) == null) {
                return;
            }
            C724270Sb3 c724270Sb33 = this.LLJI;
            C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb33 != null ? c724270Sb33.LL : null));
            StickerTemplate stickerTemplateZp2 = zp();
            if (stickerTemplateZp2 == null) {
                return;
            }
            messageListStickerClickAbility.up1(roundingCornerLayoutYp2, supportFragmentManager, c869590Y9lLIZ, stickerTemplateZp2);
            return;
        }
        if (Intrinsics.LJFF(strFp, String.valueOf(EnumC451180Hme.VIDEO_STICKER_STATIC.getType())) || Intrinsics.LJFF(strFp, String.valueOf(EnumC451180Hme.VIDEO_STICKER_ANIMATED.getType()))) {
            RoundingCornerLayout roundingCornerLayoutYp3 = yp();
            C19EG c19egLIZIZ3 = C1388190mED.LIZIZ(yp().getContext());
            if (c19egLIZIZ3 == null) {
                return;
            }
            C724270Sb3 c724270Sb34 = this.LLJI;
            C869590Y9l c869590Y9lLIZ2 = C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb34 != null ? c724270Sb34.LL : null));
            StickerTemplate stickerTemplateZp3 = zp();
            if (stickerTemplateZp3 == null) {
                return;
            }
            messageListStickerClickAbility.dH1(roundingCornerLayoutYp3, c19egLIZIZ3, c869590Y9lLIZ2, stickerTemplateZp3);
            return;
        }
        if (!Intrinsics.LJFF(strFp, String.valueOf(EnumC451180Hme.AISELF_STICKER.getType()))) {
            RoundingCornerLayout roundingCornerLayoutYp4 = yp();
            C19EG c19egLIZIZ4 = C1388190mED.LIZIZ(yp().getContext());
            if (c19egLIZIZ4 == null) {
                return;
            }
            C724270Sb3 c724270Sb35 = this.LLJI;
            C869590Y9l c869590Y9lLIZ3 = C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb35 != null ? c724270Sb35.LL : null));
            StickerTemplate stickerTemplateZp4 = zp();
            if (stickerTemplateZp4 == null) {
                return;
            }
            messageListStickerClickAbility.zM(roundingCornerLayoutYp4, c19egLIZIZ4, c869590Y9lLIZ3, stickerTemplateZp4);
            return;
        }
        if (C138600fw.LIZ()) {
            RoundingCornerLayout roundingCornerLayoutYp5 = yp();
            C19EG c19egLIZIZ5 = C1388190mED.LIZIZ(yp().getContext());
            if (c19egLIZIZ5 == null) {
                return;
            }
            C724270Sb3 c724270Sb36 = this.LLJI;
            C869590Y9l c869590Y9lLIZ4 = C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb36 != null ? c724270Sb36.LL : null));
            StickerTemplate stickerTemplateZp5 = zp();
            if (stickerTemplateZp5 == null) {
                return;
            }
            messageListStickerClickAbility.zM(roundingCornerLayoutYp5, c19egLIZIZ5, c869590Y9lLIZ4, stickerTemplateZp5);
            return;
        }
        if (C0H6Q.LIZ()) {
            RoundingCornerLayout roundingCornerLayoutYp6 = yp();
            C19EG c19egLIZIZ6 = C1388190mED.LIZIZ(yp().getContext());
            if (c19egLIZIZ6 == null) {
                return;
            }
            C724270Sb3 c724270Sb37 = this.LLJI;
            C869590Y9l c869590Y9lLIZ5 = C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb37 != null ? c724270Sb37.LL : null));
            StickerTemplate stickerTemplateZp6 = zp();
            if (stickerTemplateZp6 == null) {
                return;
            }
            messageListStickerClickAbility.MS(roundingCornerLayoutYp6, c19egLIZIZ6, c869590Y9lLIZ5, stickerTemplateZp6);
            return;
        }
        RoundingCornerLayout roundingCornerLayoutYp7 = yp();
        C19EG c19egLIZIZ7 = C1388190mED.LIZIZ(yp().getContext());
        if (c19egLIZIZ7 == null) {
            return;
        }
        C724270Sb3 c724270Sb38 = this.LLJI;
        C869590Y9l c869590Y9lLIZ6 = C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb38 != null ? c724270Sb38.LL : null));
        StickerTemplate stickerTemplateZp7 = zp();
        if (stickerTemplateZp7 == null) {
            return;
        }
        messageListStickerClickAbility.zM(roundingCornerLayoutYp7, c19egLIZIZ7, c869590Y9lLIZ6, stickerTemplateZp7);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LL.findViewById(R.id.nzx).getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        C19MX c19mx = (C19MX) ((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LL.findViewById(R.id.ev_);
        if (c19mx != null) {
            c19mx.setReferencedIds(new int[]{R.id.apb, R.id.eu1});
        }
        LJJIJL().addOnAttachStateChangeListener(new C0IDR(this, 3));
        if (C300630BqP.LIZ()) {
            Ap().setTag(-5676, "StoreStickerReceiveViewHolder");
        }
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 38), (View) this.LLJLILLLLZIIL.getValue());
        yp().setContentDescription(C1383370m6R.LJIIJ(2131848823));
        C786410Ut5.Ma(yp(), new ACListenerS141S0100000_6(this, 39));
    }

    public final void op(C462620ICe c462620ICe) {
        yp().setRoundingParams(c462620ICe.LIZ);
        Ap().setBackground(null);
        C1331070kk5 hierarchy = Ap().getHierarchy();
        if (hierarchy != null) {
            C462630ICf c462630ICf = c462620ICe.LIZ;
            hierarchy.LJJIII(C912220ZqW.LIZIZ(LJJIJL().getContext(), c462630ICf.LIZ, c462630ICf.LIZIZ, c462630ICf.LIZJ, c462630ICf.LIZLLL));
        }
        if ((Intrinsics.LJFF(Fp(), String.valueOf(EnumC451180Hme.VIDEO_STICKER_ANIMATED.getType())) || Intrinsics.LJFF(Fp(), String.valueOf(EnumC451180Hme.VIDEO_STICKER_STATIC.getType()))) && !((Boolean) C451140Hma.LIZ.getValue()).booleanValue()) {
            yp().setBackground(C462590ICb.LIZIZ(new C462620ICe(c462620ICe.LIZ, new C0ICR(R.attr.c7)), LJJIJL()));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0ICT c0ict) {
        C0ICT c0ict2 = c0ict;
        AnonymousClass0956 anonymousClass0956 = this.LLJZIJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJZIJLIL = null;
        this.LLL = 0;
        this.LLJZ.LIZJ(C0I6Y.LIZ(c0ict2), Bp());
        sp();
        op(c0ict2.LIZJ());
    }

    public final void up(C0ICQ c0icq) {
        RoundingCornerLayout roundingCornerLayoutYp = yp();
        int childCount = roundingCornerLayoutYp.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = roundingCornerLayoutYp.getChildAt(i);
            if (i == c0icq.LL) {
                C786410Ut5.LJLLLLLL(0, childAt);
            } else {
                C786410Ut5.LJLLLLLL(8, childAt);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ICT c0ict) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ICT c0ict) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        boolean z;
        C0ICZ c0icz;
        C0ICT c0ict = (C0ICT) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.LLJZ.LIZJ(C0I6Y.LIZ(c0ict), Bp());
            sp();
            op(c0ict.LIZJ());
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C0ICZ) && (c0icz = (C0ICZ) obj2) != null) {
                    if (c0icz.LIZ) {
                        this.LLJZ.LIZJ(C0I6Y.LIZ(c0ict), Bp());
                        sp();
                    }
                    if (c0icz.LIZIZ) {
                        op(c0ict.LIZJ());
                    }
                }
            }
        }
        MessageListStickerClickAbility messageListStickerClickAbility = (MessageListStickerClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MessageListStickerClickAbility.class, null);
        if (messageListStickerClickAbility != null) {
            SessionInfo sessionInfo = ((C457780HxI) this.LLJL.getValue()).LL;
            StickerTemplate stickerTemplateZp = zp();
            if (stickerTemplateZp != null) {
                messageListStickerClickAbility.iA0(sessionInfo, stickerTemplateZp, new AwS215S0300000_6(this, c0ict, messageListStickerClickAbility, 23));
            }
        }
    }

    public static void Jp(StoreStickerCardReusedUISlot storeStickerCardReusedUISlot, boolean z, Throwable th, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        storeStickerCardReusedUISlot.getClass();
        storeStickerCardReusedUISlot.up(C0ICQ.LLILLL);
        storeStickerCardReusedUISlot.Ap().setTag(R.id.kad, null);
        storeStickerCardReusedUISlot.LLLI = new AwS90S0210000_6(storeStickerCardReusedUISlot, z, th, 1);
    }
}
