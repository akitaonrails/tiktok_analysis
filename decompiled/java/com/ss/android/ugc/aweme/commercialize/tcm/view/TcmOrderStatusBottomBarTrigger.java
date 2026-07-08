package com.ss.android.ugc.aweme.commercialize.tcm.view;

import X.C01GW;
import X.C03H5;
import X.C04PM;
import X.C0D80;
import X.C0QSJ;
import X.C0TPP;
import X.C11S5;
import X.C13IQ;
import X.C13LE;
import X.C1701940uOG;
import X.C1770720wBC;
import X.C1770730wBD;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C702420Rgu;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1770740wBE;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC699970Rcx;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.InterfaceC737790Swr;
import Y.AfS195S0100000_26;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.commercialize.tcm.api.TcmBarStatusApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public final class TcmOrderStatusBottomBarTrigger extends BaseCellTriggerComponent<TcmOrderStatusBottomBarTrigger> implements BottomBarPriorityProtocol, InterfaceC699970Rcx, ITriggerAssemHost, InterfaceC1554640qYg, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public final /* synthetic */ C702420Rgu LLJJLIIIJLLLLLLLZ = new C702420Rgu();
    public final /* synthetic */ TriggerAssemHost LLJL = new TriggerAssemHost();
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C1770730wBD(this));
    public final TcmOrderStatusBottomBarTrigger LLJLILLLLZIIL = this;
    public int LLJLL;
    public ITriggerAssemHost LLJLLIL;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_banner_tcm";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.view.ITriggerAssemHost
    public final void LLLILZ(Function1<? super Integer, Unit> function1) {
        this.LLJL.LLLILZ(function1);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == ITriggerAssemHost.class) {
            this.LLJLLIL = (ITriggerAssemHost) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TcmOrderStatusVSCope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == ITriggerAssemHost.class) {
            return this.LLJLLIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TcmOrderStatusVSCope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TcmOrderStatusVSCope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(TcmOrderStatusBottomBarAssem.class);
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
        if (str.hashCode() != 1388094129) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == ITriggerAssemHost.class) {
            this.LLJLLIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_banner_tcm";
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean Nm() {
        return this.LLJJLIIIJLLLLLLLZ.LL;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
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

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TcmOrderStatusVSCope.class}).unbindAbility(this.LLJLILLLLZIIL, ITriggerAssemHost.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TcmOrderStatusVSCope.class}).bindAbility(this.LLJLILLLLZIIL, ITriggerAssemHost.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        Aweme aweme;
        PriorityAbility priorityAbility;
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (lp(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJLIL.getValue()) != null) {
            priorityAbility.MJ(this, new C1770720wBC(this));
        }
        if (up(videoItemParams) && (aweme = videoItemParams.getAweme()) != null) {
            C0TPP c0tpp = C0TPP.LIZ;
            String str = C0D80.LIZ;
            c0tpp.getClass();
            ((TcmBarStatusApi) C0TPP.LIZIZ(TcmBarStatusApi.class, str)).getBarStatus("orders.AdTcmOrdersService", "TcmItemInfo", CastLongProtector.parseLong(aweme.getAid()), aweme.getStarAtlasOrderId()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS195S0100000_26(this, 14), new AfS195S0100000_26(this, 15));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        User currentUser;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme.getStarAtlasOrderId() != 0 && !TextUtils.equals(aweme.getAid(), String.valueOf(aweme.getStarAtlasOrderId()))) {
            InterfaceC1770740wBE interfaceC1770740wBE = (InterfaceC1770740wBE) C04PM.LIZ.LIZ();
            String uid = null;
            if (interfaceC1770740wBE != null) {
                currentUser = interfaceC1770740wBE.getCurrentUser();
            } else {
                currentUser = null;
            }
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            if (currentUser != null) {
                uid = currentUser.getUid();
            }
            if (TextUtils.equals(authorUid, uid)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
