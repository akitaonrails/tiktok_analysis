package com.ss.android.ugc.aweme.feed.assem.live;

import X.C01GW;
import X.C03H5;
import X.C0QSJ;
import X.C0RJN;
import X.C1389300mG0;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1578630rBN;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C702420Rgu;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC699970Rcx;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.InterfaceC737790Swr;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class LiveNoticeCTAButtonTrigger extends BaseCellTriggerComponent<LiveNoticeCTAButtonTrigger> implements PriorityProtocol, LiveCTAButtonAbility, InterfaceC699970Rcx, ITriggerAssemHost, InterfaceC1554640qYg, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final Set<String> LLLFZ = new LinkedHashSet();
    public Boolean LLJZ;
    public boolean LLLFF;
    public ITriggerAssemHost LLLFFI;
    public final /* synthetic */ C702420Rgu LLJJLIIIJLLLLLLLZ = new C702420Rgu();
    public final /* synthetic */ TriggerAssemHost LLJL = new TriggerAssemHost();
    public final LiveNoticeCTAButtonTrigger LLJLIL = this;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 237));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 234));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(91));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(90));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 235));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 236));
    public boolean LLLF = true;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_button_live_notify";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.live.LiveCTAButtonAbility
    public final void LJJJJIZL() {
        this.LLLF = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.live.ITriggerAssemHost
    public final void LLLILZ(Function1<? super String, Unit> function1) {
        this.LLJL.LLLILZ(function1);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == ITriggerAssemHost.class) {
            this.LLLFFI = (ITriggerAssemHost) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{LiveNoticeCTABCope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == ITriggerAssemHost.class) {
            return this.LLLFFI;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LiveNoticeCTABCope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LiveNoticeCTABCope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(LiveNoticeCTAButtonAssem.class);
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean l5(boolean z) {
        return this.LLJJLIIIJLLLLLLLZ.l5(z);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -412516219 || iHashCode == 687347569) {
            return this;
        }
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLLF = true;
        this.LLJZ = null;
        this.LLLFF = false;
        this.LLJL.LL.LJ();
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == ITriggerAssemHost.class) {
            this.LLLFFI = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_button_live_notify";
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean Nm() {
        return this.LLJJLIIIJLLLLLLLZ.LL;
    }

    public final Keva yp() {
        return (Keva) this.LLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.live.LiveCTAButtonAbility
    public final int GF1() {
        return yp().getInt((String) this.LLJZIJLIL.getValue(), 0);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.live.LiveCTAButtonAbility
    public final boolean IO1() {
        long j = yp().getLong((String) this.LLL.getValue(), -1L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j <= 0) {
            return true;
        }
        if (jCurrentTimeMillis - j <= ((long) 259200) * 1000) {
            return false;
        }
        if (jCurrentTimeMillis - j <= ((long) 259200) * 1000) {
            return true;
        }
        yp().storeInt((String) this.LLJZIJLIL.getValue(), 0);
        yp().storeLong((String) this.LLL.getValue(), -1L);
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.live.LiveCTAButtonAbility
    public final boolean Rj0() {
        return this.LLLF;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.live.LiveCTAButtonAbility
    public final boolean CH(Aweme aweme) {
        User author;
        Object obj;
        if (aweme == null || AwemeExtKt.getFollowStatus(aweme) == 1 || AwemeExtKt.getFollowStatus(aweme) == 2 || AwemeSaaSExtKt.isLive(aweme) || (((author = aweme.getAuthor()) != null && author.isLive()) || aweme.isAd())) {
            return false;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme2 = ((VideoItemParams) obj).getAweme();
        if (aweme2 != null && AwemeBizExtKt.getHasDisplayLiveNoticeButton(aweme2)) {
            return false;
        }
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        if (iECommerceAnchorService.LJJJJZ(((VideoItemParams) obj2).getAweme())) {
            return false;
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (it2.hasNext()) {
                if (it2.next().getType() == 41) {
                    return false;
                }
            }
        }
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            Iterator<InteractStickerStruct> it3 = interactStickerStructs.iterator();
            while (it3.hasNext()) {
                if (it3.next().getType() == 25) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.live.LiveCTAButtonAbility
    public final void LLLLLL(boolean z) {
        PriorityAbility priorityAbility = (PriorityAbility) this.LLJLILLLLZIIL.getValue();
        if (priorityAbility != null) {
            priorityAbility.nw0(this, true);
        }
        FeedBottomButtonAbility feedBottomButtonAbility = (FeedBottomButtonAbility) this.LLJLL.getValue();
        if (feedBottomButtonAbility != null) {
            feedBottomButtonAbility.Ds2();
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{LiveNoticeCTABCope.class}).unbindAbility(this.LLJLIL, ITriggerAssemHost.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{LiveNoticeCTABCope.class}).bindAbility(this.LLJLIL, ITriggerAssemHost.class);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.live.LiveCTAButtonAbility
    public final void rn2(boolean z) {
        int i = 0;
        int i2 = yp().getInt((String) this.LLJZIJLIL.getValue(), 0);
        if (z) {
            i = i2 + 1;
        } else {
            yp().storeLong((String) this.LLL.getValue(), -1L);
        }
        yp().storeInt((String) this.LLJZIJLIL.getValue(), i);
        if (i >= 4) {
            yp().storeLong((String) this.LLL.getValue(), System.currentTimeMillis());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        PriorityAbility priorityAbility;
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (lp(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJLILLLLZIIL.getValue()) != null) {
            priorityAbility.Vx0(this, new AwS377S0200000_11(this, videoItemParams, 27), new AwS590S0100000_11(this, 94));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        C0RJN c0rjnLIZIZ;
        Boolean boolValueOf;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI);
        } else {
            c0rjnLIZIZ = null;
        }
        if (this.LLJZ == null) {
            if (C1389300mG0.LJIL(c0rjnLIZIZ)) {
                boolValueOf = Boolean.valueOf(CH(videoItemParams.getAweme()));
            } else {
                boolValueOf = Boolean.FALSE;
            }
            this.LLJZ = boolValueOf;
        }
        return Intrinsics.LJFF(this.LLJZ, Boolean.TRUE);
    }
}
