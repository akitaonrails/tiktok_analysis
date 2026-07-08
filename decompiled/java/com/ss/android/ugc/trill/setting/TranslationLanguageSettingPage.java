package com.ss.android.ugc.trill.setting;

import X.AbstractC1250290idn;
import X.AnonymousClass0175;
import X.C01GW;
import X.C086I;
import X.C09JN;
import X.C0OM1;
import X.C0TUX;
import X.C0WZX;
import X.C11S5;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1391190mJ3;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C19EG;
import X.C20684815ws;
import X.C207069161b;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C343970De7;
import X.C452501pT;
import X.C497820Jfg;
import X.C747580TUe;
import X.C814420VxA;
import X.EnumC638250P1r;
import X.InterfaceC747540TUa;
import X.InterfaceC836760Ws6;
import Y.AfS38S1000000_19;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class TranslationLanguageSettingPage extends BasePage implements Observer<ArrayList<C747580TUe>>, InterfaceC747540TUa {
    public static String LLJJIJIL = "";
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZjYpPTs6JiHELIOSJiHT0yJjYgKDs6JysAKCE0PSQrLBw2PDElJygDKSIp";
    public TuxNavBar LLJ;
    public RecyclerView LLJI;
    public TranslationLanguageViewModel LLJIJIL;
    public C0TUX LLJILJIL;
    public int LLJILJILJ = -1;
    public int LLJILLL = -1;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 659));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 658));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 656));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 655));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 657));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f7l;
    }

    public final Boolean ZR() {
        return (Boolean) this.LLJJIJIIJIL.getValue();
    }

    public final void aS() {
        ContentLanguage contentLanguage;
        if (!Intrinsics.LJFF(ZR(), Boolean.TRUE)) {
            TuxNavBar tuxNavBar = this.LLJ;
            if (tuxNavBar == null) {
                tuxNavBar = null;
            }
            View viewLJII = tuxNavBar.LJII("end_text");
            if (viewLJII == null || !viewLJII.isEnabled()) {
                return;
            }
        }
        Intent intent = new Intent();
        List list = (List) this.LLJJ.getValue();
        if (list != null && (contentLanguage = (ContentLanguage) ListProtector.get(list, this.LLJILLL)) != null) {
            TranslationLanguageViewModel translationLanguageViewModel = this.LLJIJIL;
            if (translationLanguageViewModel != null) {
                String languageCode = contentLanguage.getLanguageCode();
                translationLanguageViewModel.LLILLJJLI.LIZ("selected_translation_language", languageCode).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJLL(new AfS38S1000000_19(languageCode, 0), new C09JN() { // from class: X.00Pt
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("TranslationLanguageViewModel@2d2e.updateSelectedTranslationLanguage$disposable$2");
                        C1C7U.LIZIZ("TranslationLanguageViewModel@2d2e.updateSelectedTranslationLanguage$disposable$2");
                    }
                });
            }
            intent.putExtra("updated_language_name", contentLanguage.getLocalName());
            intent.putExtra("updated_language_code", contentLanguage.getLanguageCode());
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid());
            c2344009Gk.LJIIIIZZ("enter_from", (String) this.LLJJIJI.getValue());
            c2344009Gk.LJIIIIZZ("enter_method", (String) this.LLJJIII.getValue());
            c2344009Gk.LJIIIIZZ("prev_selected_target_lang", LLJJIJIL);
            c2344009Gk.LJIIIIZZ("target_lang", contentLanguage.getLanguageCode());
            Bundle arguments = getArguments();
            if (arguments != null && arguments.containsKey("aweme_type")) {
                Bundle arguments2 = getArguments();
                c2344009Gk.LJ(arguments2 != null ? Integer.valueOf(arguments2.getInt("aweme_type")) : null, "aweme_type");
            }
            C207069161b.LJFF(new AnonymousClass0175(), "save_transl_lang", c2344009Gk.LIZ);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C2204961BRm.LLJJIJIL(-1, intent, activity, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wrdWs/KPmtd4vH0jWWVAPp31qxv2yBQXgvAzkUa+CN0zczYljFT6KT0viG", null));
        }
    }

    @Override // X.InterfaceC747540TUa
    public final void LLJL(int i) {
        if (i == this.LLJILLL) {
            return;
        }
        Boolean boolZR = ZR();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(boolZR, bool)) {
            TuxNavBar tuxNavBar = null;
            if (i == this.LLJILJILJ) {
                TuxNavBar tuxNavBar2 = this.LLJ;
                if (tuxNavBar2 != null) {
                    tuxNavBar = tuxNavBar2;
                }
                tuxNavBar.LJJ(AFwS271S0000000_28.get$arr$(236), "end_text");
            } else {
                TuxNavBar tuxNavBar3 = this.LLJ;
                if (tuxNavBar3 != null) {
                    tuxNavBar = tuxNavBar3;
                }
                tuxNavBar.LJJ(AFwS271S0000000_28.get$arr$(237), "end_text");
            }
        }
        TranslationLanguageViewModel translationLanguageViewModel = this.LLJIJIL;
        if (translationLanguageViewModel != null) {
            int i2 = this.LLJILLL;
            MutableLiveData<ArrayList<C747580TUe>> mutableLiveData = translationLanguageViewModel.LL;
            if (mutableLiveData != null && !C086I.LIZIZ(mutableLiveData.getValue())) {
                if (i2 >= 0) {
                    ((C747580TUe) ListProtector.get(mutableLiveData.getValue(), i2)).LIZ = false;
                }
                ((C747580TUe) ListProtector.get(mutableLiveData.getValue(), i)).LIZ = true;
            }
        }
        this.LLJILLL = i;
        C0TUX c0tux = this.LLJILJIL;
        if (c0tux != null) {
            c0tux.notifyDataSetChanged();
        }
        if (Intrinsics.LJFF(ZR(), bool)) {
            aS();
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ArrayList<C747580TUe> arrayList) {
        C0TUX c0tux;
        ArrayList<C747580TUe> arrayList2 = arrayList;
        if (!C086I.LIZIZ(arrayList2)) {
            C0TUX c0tux2 = this.LLJILJIL;
            if (c0tux2 == null) {
                Context context = getContext();
                RecyclerView recyclerView = null;
                if (context != null) {
                    c0tux = new C0TUX(context, this);
                } else {
                    c0tux = null;
                }
                this.LLJILJIL = c0tux;
                if (c0tux != null) {
                    c0tux.LLILLL = arrayList2;
                }
                RecyclerView recyclerView2 = this.LLJI;
                if (recyclerView2 != null) {
                    recyclerView = recyclerView2;
                }
                recyclerView.setAdapter(c0tux);
                return;
            }
            c0tux2.LLILLL = arrayList2;
            c0tux2.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        double d;
        boolean z;
        String string;
        AbstractC1250290idn abstractC1250290idn;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        List list;
        Integer numValueOf;
        Context contextRequireContext = requireContext();
        int iLIZ = C497820Jfg.LIZ(contextRequireContext) - C497820Jfg.LIZJ(contextRequireContext);
        Boolean boolZR = ZR();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolZR, bool)) {
            d = 0.7d;
        } else {
            d = 1.0d;
        }
        int iLIZ2 = C814420VxA.LIZ(((double) iLIZ) * d);
        if (Intrinsics.LJFF(ZR(), bool)) {
            view.getLayoutParams().height = iLIZ2;
            view.getLayoutParams().width = C497820Jfg.LIZIZ(contextRequireContext);
        }
        this.LLJ = (TuxNavBar) view.findViewById(R.id.y08);
        this.LLJI = (RecyclerView) view.findViewById(R.id.msq);
        super.onViewCreated(view, bundle);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid());
        c2344009Gk.LJIIIIZZ("enter_method", (String) this.LLJJIII.getValue());
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("aweme_type")) {
            z = true;
        } else {
            z = false;
        }
        TuxNavBar tuxNavBar = null;
        if (z) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                numValueOf = Integer.valueOf(arguments2.getInt("aweme_type"));
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "aweme_type");
        }
        c2344009Gk.LJIIIIZZ("enter_from", (String) this.LLJJIJI.getValue());
        c2344009Gk.LJIIIIZZ("target_lang", LLJJIJIL);
        C20684815ws.LJIILLIIL("enter_transl_lang", c2344009Gk.LIZ);
        TranslationLanguageViewModel translationLanguageViewModel = (TranslationLanguageViewModel) ViewModelProviders.of(this).get(TranslationLanguageViewModel.class);
        this.LLJIJIL = translationLanguageViewModel;
        if (translationLanguageViewModel != null) {
            if (translationLanguageViewModel.LL == null) {
                translationLanguageViewModel.LL = new MutableLiveData<>();
            }
            translationLanguageViewModel.LL.observe(this, this);
        }
        if (this.LLJJ.getValue() == null || ((list = (List) this.LLJJ.getValue()) != null && list.isEmpty())) {
            if (Intrinsics.LJFF(ZR(), bool)) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(this, C343970De7.LIZ);
                return;
            }
            SR();
        }
        TranslationLanguageViewModel translationLanguageViewModel2 = this.LLJIJIL;
        int i = -1;
        if (translationLanguageViewModel2 != null) {
            List list2 = (List) this.LLJJ.getValue();
            String str2 = (String) this.LLJJI.getValue();
            int i2 = 0;
            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
            if (i18nServiceApi != null) {
                i18nManagerServiceApiLIZ = i18nServiceApi.LIZ();
            } else {
                i18nManagerServiceApiLIZ = null;
            }
            ArrayList<C747580TUe> arrayList = new ArrayList<>();
            if (i18nManagerServiceApiLIZ != null && list2 != null) {
                for (Object obj : list2) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        ContentLanguage contentLanguage = (ContentLanguage) obj;
                        if (u.LJIJI(str2, contentLanguage.getLanguageCode(), false)) {
                            arrayList.add(new C747580TUe(i18nManagerServiceApiLIZ.LJIILLIIL(contentLanguage.getEnglishName(), contentLanguage.getLanguageCode(), contentLanguage.getLocalName()), true));
                            i = i2;
                        } else {
                            arrayList.add(new C747580TUe(i18nManagerServiceApiLIZ.LJIILLIIL(contentLanguage.getEnglishName(), contentLanguage.getLanguageCode(), contentLanguage.getLocalName()), false));
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            MutableLiveData<ArrayList<C747580TUe>> mutableLiveData = translationLanguageViewModel2.LL;
            if (mutableLiveData != null) {
                mutableLiveData.postValue(arrayList);
            }
        }
        this.LLJILJILJ = i;
        this.LLJILLL = i;
        RecyclerView recyclerView = this.LLJI;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        String string2 = getString(2131828779);
        TuxNavBar tuxNavBar2 = this.LLJ;
        TuxNavBar tuxNavBar3 = tuxNavBar2;
        if (tuxNavBar2 == null) {
            tuxNavBar3 = null;
        }
        C0OM1 c0om1 = new C0OM1();
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZIZ = "start_text";
        Boolean boolZR2 = ZR();
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(boolZR2, bool2)) {
            string = "";
        } else {
            string = getString(2131828217);
        }
        c1250300ido.LIZJ = string;
        c1250300ido.LIZ(new AwS572S0100000_28(this, 707));
        abstractC1250290idnArr[0] = c1250300ido;
        c0om1.LJ(abstractC1250290idnArr);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string2;
        c0om1.LIZJ = c1250250idj;
        AbstractC1250290idn[] abstractC1250290idnArr2 = new AbstractC1250290idn[1];
        if (Intrinsics.LJFF(ZR(), bool2)) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS572S0100000_28(this, 708));
            abstractC1250290idn = c1251150ifB;
        } else {
            C1250300ido c1250300ido2 = new C1250300ido();
            c1250300ido2.LIZIZ = "end_text";
            c1250300ido2.LIZJ = getString(2131834695);
            c1250300ido2.LJ = false;
            c1250300ido2.LIZLLL = EnumC638250P1r.SECONDARY;
            c1250300ido2.LIZ(new AwS572S0100000_28(this, 709));
            abstractC1250290idn = c1250300ido2;
        }
        abstractC1250290idnArr2[0] = abstractC1250290idn;
        c0om1.LIZIZ(abstractC1250290idnArr2);
        tuxNavBar3.setNavActions(c0om1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, requireContext());
        if (numLIZJ == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        View view2 = getView();
        if (view2 != null) {
            view2.setBackgroundColor(iIntValue);
        }
        TuxNavBar tuxNavBar4 = this.LLJ;
        if (tuxNavBar4 != null) {
            tuxNavBar = tuxNavBar4;
        }
        tuxNavBar.setNavBackground(iIntValue);
    }
}
