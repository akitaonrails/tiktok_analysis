package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common;

import X.AbstractC345490DgZ;
import X.C01GW;
import X.C06TE;
import X.C0I0B;
import X.C0KFD;
import X.C0Q4Y;
import X.C0QSJ;
import X.C0ZW7;
import X.C1173220gdU;
import X.C1194810hCJ;
import X.C1558360qeg;
import X.C1697810uHb;
import X.C1846060y8i;
import X.C1954807lC;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C904380Zds;
import X.EnumC1242510iRF;
import X.EnumC1381750m3p;
import X.EnumC1381770m3r;
import X.EnumC904370Zdr;
import X.InterfaceC1146704e9;
import X.InterfaceC1194840hCM;
import X.InterfaceC1733780vDc;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailPageScope;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes28.dex */
public abstract class ChatDetailMediaGridAssem extends UISlotAssem implements C0QSJ, InterfaceC1146704e9 {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1509));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1507));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1508));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1506));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cnx;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatDetailPageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatDetailPageScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatDetailPageScope.class);
        return arrayList;
    }

    public abstract MediaGridViewModel hp();

    public abstract void lp();

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final ViewOnAttachStateChangeListenerC20631115oD ip() {
        return (ViewOnAttachStateChangeListenerC20631115oD) this.LLJJIJIIJIL.getValue();
    }

    public final C1846060y8i kp() {
        return (C1846060y8i) this.LLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        int selectedTabPosition;
        EnumC1381750m3p enumC1381750m3p;
        if (hp().EQ2()) {
            super.onDestroy();
            return;
        }
        IIMMediaGridAnalytics iIMMediaGridAnalytics = (IIMMediaGridAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMediaGridAnalytics.class);
        if (iIMMediaGridAnalytics != null && (selectedTabPosition = kp().getSelectedTabPosition()) >= 0 && selectedTabPosition < hp().getState().LL.size()) {
            EnumC904370Zdr enumC904370Zdr = ((C06TE) ListProtector.get(hp().getState().LL, selectedTabPosition)).LIZ;
            int i = C904380Zds.LIZ[enumC904370Zdr.ordinal()];
            if (i == 1) {
                enumC1381750m3p = EnumC1381750m3p.SHARED_VIDEO;
            } else if (i == 2) {
                enumC1381750m3p = EnumC1381750m3p.PRIVATE_MEDIA;
            } else if (i == 3) {
                enumC1381750m3p = EnumC1381750m3p.SHARED_COLLECTION;
            } else {
                if (i != 4) {
                    throw new C1954807lC();
                }
                enumC1381750m3p = EnumC1381750m3p.GROUP_MEMBER;
            }
            EnumC1381770m3r enumC1381770m3r = hp().FQ2() ? EnumC1381770m3r.GROUP : EnumC1381770m3r.PRIVATE;
            EnumC1242510iRF enumC1242510iRF = (enumC904370Zdr == EnumC904370Zdr.PRIVATE_MEDIA || enumC904370Zdr == EnumC904370Zdr.SHARED_VIDEOS) ? hp().DQ2(enumC904370Zdr) ? EnumC1242510iRF.EMPTY : EnumC1242510iRF.NOT_EMPTY : null;
            String strXQ2 = hp().xQ2();
            IMUser iMUserCQ2 = hp().CQ2();
            iIMMediaGridAnalytics.LIZ("ttsocial_chat_setting_media_module_exit", iIMMediaGridAnalytics.LIZJ(strXQ2, iMUserCQ2 != null ? iMUserCQ2.getUid() : null, enumC1381770m3r, enumC1381750m3p, enumC1242510iRF), C0I0B.LJFF.LIZIZ());
        }
        int selectedTabPosition2 = kp().getSelectedTabPosition();
        if (selectedTabPosition2 >= 0 && selectedTabPosition2 < hp().getState().LL.size()) {
            EnumC904370Zdr enumC904370Zdr2 = ((C06TE) ListProtector.get(hp().getState().LL, selectedTabPosition2)).LIZ;
            String strXQ22 = hp().xQ2();
            if (strXQ22 != null) {
                List<AbstractC345490DgZ> listZQ2 = hp().zQ2(enumC904370Zdr2);
                int i2 = 0;
                if (!(listZQ2 instanceof Collection) || !listZQ2.isEmpty()) {
                    Iterator<AbstractC345490DgZ> it2 = listZQ2.iterator();
                    while (it2.hasNext()) {
                        if ((it2.next() instanceof C0ZW7) && (i2 = i2 + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                IIMMediaGridPerformanceAnalytics iIMMediaGridPerformanceAnalytics = (IIMMediaGridPerformanceAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMediaGridPerformanceAnalytics.class);
                if (iIMMediaGridPerformanceAnalytics != null) {
                    boolean zFQ2 = hp().FQ2();
                    MediaGridViewModel mediaGridViewModelHp = hp();
                    iIMMediaGridPerformanceAnalytics.LJ(strXQ22, enumC904370Zdr2, zFQ2, i2, !mediaGridViewModelHp.BQ2().LIZIZ(mediaGridViewModelHp.xQ2(), enumC904370Zdr2));
                    iIMMediaGridPerformanceAnalytics.LJIIIIZZ(strXQ22);
                }
            }
        }
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        final boolean z;
        super.onViewCreated(view);
        hp().IQ2();
        lp();
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDIp = ip();
        C786410Ut5.LLLLL(viewOnAttachStateChangeListenerC20631115oDIp, 0);
        viewOnAttachStateChangeListenerC20631115oDIp.getViewItemOperator().setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20631115oDIp.getViewItemOperator().getState().LIZLLL = C0Q4Y.BUFFER;
        InterfaceC1733780vDc viewItemOperator = viewOnAttachStateChangeListenerC20631115oDIp.getViewItemOperator();
        C1173220gdU c1173220gdU = new C1173220gdU();
        c1173220gdU.LIZ = 1;
        viewItemOperator.LIZLLL(c1173220gdU);
        InterfaceC1733780vDc viewItemOperator2 = viewOnAttachStateChangeListenerC20631115oDIp.getViewItemOperator();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            interfaceC665370Q7zLJ = C1558360qeg.LJFF(fragmentLJI, null);
        } else {
            interfaceC665370Q7zLJ = C1558360qeg.LJ(viewOnAttachStateChangeListenerC20631115oDIp, null);
        }
        viewItemOperator2.LJFF(interfaceC665370Q7zLJ);
        viewOnAttachStateChangeListenerC20631115oDIp.setNestedScrollingEnabled(true);
        ip().addOnItemTouchListener(new C0KFD() { // from class: X.0lQB
            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0 && recyclerView.getScrollState() == 2) {
                    recyclerView.stopScroll();
                    return false;
                }
                return false;
            }
        });
        if (hp().getState().LL.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LLZLI(kp(), 8);
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJJIII.getValue(), 0);
            C786410Ut5.LJLLLLLL(0, (View) this.LLJJIJI.getValue());
            ((TextView) this.LLJJIII.getValue()).setText(2131832155);
            kp().setTabVariant(0);
        } else {
            C786410Ut5.LLZLI(kp(), 0);
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJJIII.getValue(), 8);
            C786410Ut5.LJLLLLLL(8, (View) this.LLJJIJI.getValue());
            kp().setTabVariant(1);
        }
        new C1194810hCJ(kp(), ip(), true, new InterfaceC1194840hCM() { // from class: X.0y8l
            @Override // X.InterfaceC1194840hCM
            public final void LIZ(C1845940y8W c1845940y8W, int i) {
                CharSequence text;
                Resources resources;
                if (z) {
                    C1846060y8i c1846060y8i = c1845940y8W.LJ;
                    if (c1846060y8i != null && (resources = c1846060y8i.getResources()) != null) {
                        text = resources.getText(2131832155);
                    } else {
                        text = null;
                    }
                    c1845940y8W.LIZIZ(text);
                    return;
                }
                c1845940y8W.LIZIZ = Integer.valueOf(((C06TE) ListProtector.get(this.hp().getState().LL, i)).LIZIZ);
                C1846060y8i c1846060y8i2 = c1845940y8W.LJ;
                if (c1846060y8i2 != null) {
                    int childCount = c1846060y8i2.LL.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        c1846060y8i2.LL.getChildAt(i2).requestLayout();
                    }
                }
                C1845930y8V c1845930y8V = c1845940y8W.LJFF;
                if (c1845930y8V == null) {
                    return;
                }
                c1845930y8V.LIZ();
            }
        }).LIZ();
    }
}
