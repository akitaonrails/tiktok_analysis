package com.ss.android.ugc.aweme.newcreatoredit.translation;

import X.AbstractC1779240wOw;
import X.C01WS;
import X.C098200Yq;
import X.C0OM1;
import X.C0TRX;
import X.C0TRZ;
import X.C10F8;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1260870iur;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1777720wMU;
import X.C1779150wOn;
import X.C1826670xdR;
import X.C1839820xye;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20703515zt;
import X.C21384118mN;
import X.C21384818mU;
import X.C23250099c;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import Y.AObserverS229S0100000_27;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TranslationLanguagePanelFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZispPiwhLSQ4Jj02LCw4ZzshHELIOSKSs/JS4nISoiZxshKSs/JS4nISoiBS49LzAtLioDKSspJQkhKSIhLCEn";
    public NewCreatorCaptionEditViewModel LL;
    public C21384118mN LLILLJJLI;
    public RecyclerView LLILLL;
    public LinearLayout LLILZ;
    public TuxNavBar LLILZIL;
    public C0TRX LLILZLL;
    public C1749280vcc LLIZ;

    public final void MR() {
        C21384818mU c21384818mU;
        String str;
        Long lValueOf;
        Aweme aweme;
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LL;
        if (newCreatorCaptionEditViewModel == null || (c21384818mU = newCreatorCaptionEditViewModel.LLILZLL) == null || (str = c21384818mU.LIZIZ) == null || (lValueOf = Long.valueOf(CastLongProtector.parseLong(str))) == null) {
            return;
        }
        long jLongValue = lValueOf.longValue();
        final C1826670xdR c1826670xdR = newCreatorCaptionEditViewModel.LLILZIL;
        C21384818mU c21384818mU2 = newCreatorCaptionEditViewModel.LLILZLL;
        c1826670xdR.LIZIZ = (c21384818mU2 == null || (aweme = c21384818mU2.LJII) == null) ? null : C20703515zt.LJIIIZ(aweme);
        if (c1826670xdR.LIZJ.LIZ() == null) {
            C23250099c.LIZLLL(c1826670xdR.LIZ, null, null, new C01WS(jLongValue, c1826670xdR, null), 3);
        }
        if (c1826670xdR.LIZLLL.LIZ() == null) {
            List<ContentLanguage> listLJII = C1839820xye.LIZ().LJII();
            if (listLJII != null) {
                c1826670xdR.LIZLLL = new C1779150wOn(listLJII);
                c1826670xdR.LIZ();
            } else {
                ((C1260870iur) c1826670xdR.LJFF.getValue()).LJIIJJI(new C10F8() { // from class: X.0xdS
                    @Override // X.C10F8
                    public final void Hl(PushSettings pushSettings) {
                        AbstractC1779240wOw<? extends List<? extends ContentLanguage>> c1777720wMU;
                        C1826670xdR c1826670xdR2 = c1826670xdR;
                        List<ContentLanguage> list = pushSettings.translationLanguage;
                        if (list != null) {
                            c1777720wMU = new C1779150wOn<>(list);
                        } else {
                            c1777720wMU = new C1777720wMU("");
                        }
                        c1826670xdR2.LIZLLL = c1777720wMU;
                        c1826670xdR2.LIZ();
                    }

                    @Override // X.C10F8
                    public final void onFailed(Exception exc) {
                        String message;
                        C1826670xdR c1826670xdR2 = c1826670xdR;
                        if (exc == null || (message = exc.getMessage()) == null) {
                            message = "";
                        }
                        c1826670xdR2.LIZLLL = new C1777720wMU(message);
                        c1826670xdR2.LIZ();
                    }
                });
                ((C1260870iur) c1826670xdR.LJFF.getValue()).LIZJ(new Object[0]);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        context.setTheme(R.style.y0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC1779240wOw<List<C0TRZ>> value;
        LiveData<AbstractC1779240wOw<List<C0TRZ>>> liveData;
        LiveData<AbstractC1779240wOw<List<C0TRZ>>> liveData2;
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.LLILLL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        C0TRX c0trx = new C0TRX(new AwS606S0100000_27(this, 627));
        this.LLILZLL = c0trx;
        RecyclerView recyclerView2 = this.LLILLL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(c0trx);
        }
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LL;
        if (newCreatorCaptionEditViewModel != null && (liveData2 = newCreatorCaptionEditViewModel.LLJILLL) != null) {
            value = liveData2.getValue();
        } else {
            value = null;
        }
        if (value instanceof C1777720wMU) {
            MR();
        }
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel2 = this.LL;
        if (newCreatorCaptionEditViewModel2 != null && (liveData = newCreatorCaptionEditViewModel2.LLJILLL) != null) {
            liveData.observe(this, new AObserverS229S0100000_27(this, 28));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        Integer numLIZJ;
        int iIntValue = 0;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.b5v, viewGroup, false);
        this.LLILZ = (LinearLayout) viewTd.findViewById(R.id.mpz);
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null) {
            Context contextRequireContext = requireContext();
            C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, C814420VxA.LIZ(((double) (C497820Jfg.LIZ(contextRequireContext) - C497820Jfg.LIZJ(contextRequireContext))) * 0.7d)));
        }
        this.LLILZIL = (TuxNavBar) viewTd.findViewById(R.id.p15);
        TuxNavBar tuxNavBar = this.LLILZIL;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131828799);
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS571S0100000_27(this, 1375));
            c0om1.LIZIZ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
        }
        TuxNavBar tuxNavBar2 = this.LLILZIL;
        if (tuxNavBar2 != null) {
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            tuxNavBar2.setNavBackground(iIntValue);
        }
        this.LLIZ = (C1749280vcc) viewTd.findViewById(R.id.uls);
        this.LLILLL = (RecyclerView) viewTd.findViewById(R.id.yj2);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
