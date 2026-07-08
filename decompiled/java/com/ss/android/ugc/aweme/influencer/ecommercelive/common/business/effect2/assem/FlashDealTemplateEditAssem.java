package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C01D1;
import X.C07MW;
import X.C08JS;
import X.C09R3;
import X.C0H1U;
import X.C0I7D;
import X.C0NOH;
import X.C1252710ihh;
import X.C12ES;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1730290v7z;
import X.C1730670v8b;
import X.C1730750v8j;
import X.C1731050v9D;
import X.C1731270v9Z;
import X.C197039127h;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C290160BYw;
import X.C428440Gr4;
import X.C520040KaQ;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1164530gPT;
import X.InterfaceC1728430v4z;
import X.InterfaceC1730790v8n;
import X.InterfaceC2217461Bqa;
import X.InterfaceC459810I1j;
import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardActivityInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.EcAuthorBillboardParams;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.FlashDealTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.FixedKeyboardMonitor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.FlashDealTemplateEditViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import g1c.AjS70S0100000_26;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS121S0400000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class FlashDealTemplateEditAssem extends UISlotAssem implements InterfaceC1728430v4z, InterfaceC459810I1j, InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public C428440Gr4 LLJJI;
    public C0I7D LLJJIII;
    public TuxTextView LLJJIJI;
    public CardView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public final C1559260qg8 LLJJJIL = new C1559260qg8(new C723590SZx(this, C1730750v8j.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public InterfaceC1730790v8n LLJJJJLIIL;
    public FixedKeyboardMonitor LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FlashDealTemplateEditAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/FlashDealTemplateEditViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FlashDealTemplateEditAssem.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJL = 8;
    }

    public FlashDealTemplateEditAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FlashDealTemplateEditViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 691), AFwS268S0000000_26.get$arr$(351), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BillboardGlobalViewModel.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 692), AFwS268S0000000_26.get$arr$(352), null, true);
    }

    private final void Bp() {
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217381BqS() { // from class: X.0v8m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730740v8i) obj).LLILZ;
            }
        }, null, AFwS310S0000000_24.get$arr$(25), 6);
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217381BqS() { // from class: X.0v8o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730740v8i) obj).LLILLJJLI;
            }
        }, null, AFwS310S0000000_24.get$arr$(26), 6);
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217381BqS() { // from class: X.0v8p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730740v8i) obj).LLILLL;
            }
        }, null, AFwS310S0000000_24.get$arr$(27), 6);
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217381BqS() { // from class: X.0v8g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730740v8i) obj).LLILZIL;
            }
        }, null, new AwS640S0100000_26(this, 44), 6);
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217381BqS() { // from class: X.0v8l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730740v8i) obj).LL;
            }
        }, null, new AwS640S0100000_26(this, 43), 6);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.buo;
    }

    @Override // X.InterfaceC1728430v4z, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.InterfaceC459810I1j
    public void V3() {
    }

    private final String ip() {
        String strLJI;
        TemplateFieldData templateFieldData;
        TemplateFieldProduct templateFieldProduct;
        String str;
        try {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("ec_flash_sale_page_schema", "aweme://lynxview_popup?channel=tiktok_live_ecommerce_flash_sale&bundle=pages%2Flive-flash-deal%2Ftemplate.js&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ftiktok_live_ecommerce_flash_sale%2Flive-flash-deal%2Ftemplate.js&use_gecko_first=1&dynamic=1&hide_nav_bar=1&use_bdx=1&use_spark=1&height_percent=73&popup_enter_type=bottom&radius=8&close_by_mask=1&close_by_gesture=0&drag_by_gesture=0&container_bg_color=app_theme");
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strLJI = null;
        }
        String str2 = strLJI != null ? strLJI : "aweme://lynxview_popup?channel=tiktok_live_ecommerce_flash_sale&bundle=pages%2Flive-flash-deal%2Ftemplate.js&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ftiktok_live_ecommerce_flash_sale%2Flive-flash-deal%2Ftemplate.js&use_gecko_first=1&dynamic=1&hide_nav_bar=1&use_bdx=1&use_spark=1&height_percent=73&popup_enter_type=bottom&radius=8&close_by_mask=1&close_by_gesture=0&drag_by_gesture=0&container_bg_color=app_theme";
        RootData rootData = sp().getState().LL;
        FlashDealTemplateItem flashDealTemplateItemWQ2 = Ap().wQ2();
        Uri.Builder builderBuildUpon = UriProtector.parse(str2).buildUpon();
        builderBuildUpon.appendQueryParameter("enter_from", "billboard");
        builderBuildUpon.appendQueryParameter("is_owner", rootData.LIZJ() ? "1" : CardStruct.IStatusCode.DEFAULT);
        builderBuildUpon.appendQueryParameter("kol_id", rootData.authorId);
        builderBuildUpon.appendQueryParameter("room_id", rootData.roomId);
        TemplateField templateField = (TemplateField) C13LP.LJJJLZIJ(0, flashDealTemplateItemWQ2.fieldList);
        if (templateField != null && (templateFieldData = templateField.fieldData) != null && (templateFieldProduct = templateFieldData.fieldProduct) != null && (str = templateFieldProduct.productId) != null) {
            builderBuildUpon.appendQueryParameter("product_id", str);
        }
        C1730290v7z c1730290v7z = C1730290v7z.LIZ;
        BillboardActivityInfo billboardActivityInfo = flashDealTemplateItemWQ2.activityInfo;
        Integer numValueOf = billboardActivityInfo != null ? Integer.valueOf(billboardActivityInfo.activityStatus) : null;
        c1730290v7z.getClass();
        if (!C1730290v7z.LJIIL(numValueOf)) {
            BillboardActivityInfo billboardActivityInfo2 = flashDealTemplateItemWQ2.activityInfo;
            if ((billboardActivityInfo2 != null ? billboardActivityInfo2.activityId : null) != null) {
                builderBuildUpon.appendQueryParameter("activity_id", billboardActivityInfo2.activityId.toString());
            }
        }
        return builderBuildUpon.toString();
    }

    public final FlashDealTemplateEditViewModel Ap() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (FlashDealTemplateEditViewModel) assemVMLazy.getValue();
    }

    public final InterfaceC1730790v8n kp() {
        InterfaceC1730790v8n interfaceC1730790v8n = this.LLJJJJLIIL;
        if (interfaceC1730790v8n != null) {
            return interfaceC1730790v8n;
        }
        InterfaceC1730790v8n interfaceC1730790v8n2 = null;
        try {
            interfaceC1730790v8n2 = (InterfaceC1730790v8n) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1730790v8n.class), null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LLJJJJLIIL = interfaceC1730790v8n2;
        return interfaceC1730790v8n2;
    }

    public final CardView lp() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.fek) : null;
            this.LLJJIJIIJIL = (CardView) viewFindViewById;
        }
        return (CardView) viewFindViewById;
    }

    public final C0I7D mp() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.hcc) : null;
            this.LLJJIII = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final C428440Gr4 op() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.i24) : null;
            this.LLJJI = (C428440Gr4) viewFindViewById;
        }
        return (C428440Gr4) viewFindViewById;
    }

    public final BillboardGlobalViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (BillboardGlobalViewModel) assemVMLazy.getValue();
    }

    public final C1730750v8j tp() {
        return (C1730750v8j) this.LLJJJIL.getValue();
    }

    public final TuxTextView up() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z4j) : null;
            this.LLJJIJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView yp() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z5l) : null;
            this.LLJJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView zp() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z6p) : null;
            this.LLJJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    private final void Up() {
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_author_billboard_event", this);
    }

    private final void Vp() {
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_author_billboard_event", this);
    }

    private final void hp() {
        C197039127h c197039127hU4;
        InterfaceC1730790v8n interfaceC1730790v8nKp = kp();
        C197039127h c197039127hMo = interfaceC1730790v8nKp != null ? interfaceC1730790v8nKp.Mo() : null;
        if (c197039127hMo != null) {
            c197039127hMo.setEnabled(false);
        }
        if (c197039127hMo != null) {
            c197039127hMo.setSupportClickWhenDisable(true);
            C786410Ut5.I7(new AjS70S0100000_26(this, 27), c197039127hMo);
        }
        InterfaceC1730790v8n interfaceC1730790v8nKp2 = kp();
        if (interfaceC1730790v8nKp2 == null || (c197039127hU4 = interfaceC1730790v8nKp2.u4()) == null) {
            return;
        }
        c197039127hU4.setEnabled(false);
        c197039127hU4.setSupportClickWhenDisable(true);
        C786410Ut5.I7(new AjS70S0100000_26(this, 28), c197039127hU4);
    }

    public final void Ep() {
        SmartRouter.buildRoute(getContext(), ip()).open();
    }

    @Override // X.InterfaceC1728430v4z
    public TemplateItem Ul() {
        return Ap().wQ2();
    }

    @Override // X.InterfaceC1728430v4z
    public ViewGroup jE() {
        return op();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        FixedKeyboardMonitor fixedKeyboardMonitor = this.LLJJL;
        if (fixedKeyboardMonitor != null) {
            fixedKeyboardMonitor.LIZIZ();
        }
        FlashDealTemplateEditViewModel flashDealTemplateEditViewModelAp = Ap();
        C0NOH c0noh = flashDealTemplateEditViewModelAp.LLILLJJLI;
        if (c0noh != null) {
            c0noh.LIZJ();
        }
        flashDealTemplateEditViewModelAp.LLILLJJLI = null;
        Vp();
    }

    @Override // X.InterfaceC459810I1j
    public void ub() {
        C1731050v9D.LIZ(mp());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public Context Eo(Context context) {
        Fragment fragmentLJI;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Context contextLJIIIIZZ;
        if ((C290160BYw.LIZ() || C07MW.LIZ()) && (fragmentLJI = C724240Sb0.LJI(this)) != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJI)) != null && (contextLJIIIIZZ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) != null) {
            return contextLJIIIIZZ;
        }
        return context;
    }

    public final void Fp(CardView cardView) {
        this.LLJJIJIIJIL = cardView;
    }

    public final void Gp(C0I7D c0i7d) {
        this.LLJJIII = c0i7d;
    }

    public final void Ip(C428440Gr4 c428440Gr4) {
        this.LLJJI = c428440Gr4;
    }

    public final void Jp(TuxTextView tuxTextView) {
        this.LLJJIJI = tuxTextView;
    }

    public final void Qp(TuxTextView tuxTextView) {
        this.LLJJIJIL = tuxTextView;
    }

    public final void Tp(TuxTextView tuxTextView) {
        this.LLJJJ = tuxTextView;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TemplateField next;
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        super.onViewCreated(view);
        if (!(tp().LL instanceof FlashDealTemplateItem)) {
            return;
        }
        FlashDealTemplateItem flashDealTemplateItem = (FlashDealTemplateItem) tp().LL;
        new C1731270v9Z(op()).LIZ(flashDealTemplateItem);
        Wp(this, flashDealTemplateItem, true);
        FlashDealTemplateEditViewModel flashDealTemplateEditViewModelAp = Ap();
        long j = tp().LLILLJJLI;
        long j2 = tp().LLILLL;
        flashDealTemplateEditViewModelAp.LL = flashDealTemplateItem;
        flashDealTemplateEditViewModelAp.LLILLL = j2;
        flashDealTemplateEditViewModelAp.LLILZ = j;
        flashDealTemplateEditViewModelAp.setState(new AwS605S0100000_26(flashDealTemplateItem, 623));
        flashDealTemplateEditViewModelAp.vQ2(flashDealTemplateItem.activityInfo);
        Up();
        getActualLifecycleOwner();
        FixedKeyboardMonitor fixedKeyboardMonitor = new FixedKeyboardMonitor(this);
        this.LLJJL = fixedKeyboardMonitor;
        fixedKeyboardMonitor.LIZ(view, this);
        Iterator<TemplateField> it2 = flashDealTemplateItem.fieldList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.fieldName, "customize_text")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TemplateField templateField = next;
        if (templateField != null && (templateFieldData = templateField.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            mp().setText(templateFieldText.content);
            mp().setHint(templateFieldText.defaultContent);
            mp().setFilters(new InputFilter[]{new InputFilter.LengthFilter(templateFieldText.limit)});
        }
        mp().addTextChangedListener(new C1730670v8b() { // from class: X.0v8h
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                InterfaceC1730790v8n interfaceC1730790v8nKp;
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                FlashDealTemplateEditViewModel flashDealTemplateEditViewModelAp2 = this.LL.Ap();
                flashDealTemplateEditViewModelAp2.getClass();
                flashDealTemplateEditViewModelAp2.setState(new AwS76S1000000_26(string, 33));
                if (string.length() == 0) {
                    C0H1U.LIZIZ(this.LL.up());
                    this.LL.up().setText("");
                } else {
                    C12ES.LJIILL(0, this.LL.up());
                    TuxTextView tuxTextViewUp = this.LL.up();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(string.length());
                    sbLIZ.append('/');
                    sbLIZ.append(((InputFilter.LengthFilter) this.LL.mp().getFilters()[0]).getMax());
                    tuxTextViewUp.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
                C1730290v7z c1730290v7z = C1730290v7z.LIZ;
                Integer num = this.LL.Ap().getState().LLILZIL;
                c1730290v7z.getClass();
                if ((!C1730290v7z.LJIIL(num) || this.LL.tp().LLILZ) && (interfaceC1730790v8nKp = this.LL.kp()) != null) {
                    interfaceC1730790v8nKp.SK();
                }
            }
        });
        C1731050v9D.LIZIZ(mp());
        Bp();
    }

    @Override // X.InterfaceC1164530gPT
    public void onEvent(String str, String str2) {
        Long lLJIILIIL;
        Long lLJIILIIL2;
        Long lLJIILIIL3;
        int iIntValue;
        if (Intrinsics.LJFF(str, "ec_author_billboard_event")) {
            FlashDealTemplateEditViewModel flashDealTemplateEditViewModelAp = Ap();
            flashDealTemplateEditViewModelAp.getClass();
            try {
                EcAuthorBillboardParams ecAuthorBillboardParams = (EcAuthorBillboardParams) C08JS.LIZ(str2, EcAuthorBillboardParams.class);
                if (ecAuthorBillboardParams != null && Intrinsics.LJFF(ecAuthorBillboardParams.eventName, "select_live_flash_sale")) {
                    String str3 = ecAuthorBillboardParams.activityId;
                    if (str3 != null) {
                        lLJIILIIL = C2095008Iq.LJIILIIL(str3);
                    } else {
                        lLJIILIIL = null;
                    }
                    String str4 = ecAuthorBillboardParams.startTime;
                    if (str4 != null) {
                        lLJIILIIL2 = C2095008Iq.LJIILIIL(str4);
                    } else {
                        lLJIILIIL2 = null;
                    }
                    String str5 = ecAuthorBillboardParams.endTime;
                    if (str5 != null) {
                        lLJIILIIL3 = C2095008Iq.LJIILIIL(str5);
                    } else {
                        lLJIILIIL3 = null;
                    }
                    String str6 = ecAuthorBillboardParams.productId;
                    if (str6 != null && str6.length() != 0 && lLJIILIIL != null) {
                        C0NOH c0noh = flashDealTemplateEditViewModelAp.LLILLJJLI;
                        if (c0noh != null) {
                            c0noh.LIZJ();
                        }
                        flashDealTemplateEditViewModelAp.LLILLJJLI = null;
                        flashDealTemplateEditViewModelAp.setState(new AwS121S0400000_26(ecAuthorBillboardParams, lLJIILIIL, lLJIILIIL2, lLJIILIIL3, 13));
                        Integer num = ecAuthorBillboardParams.activityStatus;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        flashDealTemplateEditViewModelAp.vQ2(new BillboardActivityInfo(iIntValue, Integer.valueOf(flashDealTemplateEditViewModelAp.getState().LLIZ), lLJIILIIL, lLJIILIIL2, lLJIILIIL3));
                    }
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final void Wp(FlashDealTemplateEditAssem flashDealTemplateEditAssem, FlashDealTemplateItem flashDealTemplateItem, boolean z) {
        Integer numValueOf;
        String str;
        TemplateFieldData templateFieldData;
        TemplateFieldProduct templateFieldProduct;
        C1730290v7z c1730290v7z = C1730290v7z.LIZ;
        BillboardActivityInfo billboardActivityInfo = flashDealTemplateItem.activityInfo;
        Integer num = null;
        if (billboardActivityInfo != null) {
            numValueOf = Integer.valueOf(billboardActivityInfo.activityStatus);
        } else {
            numValueOf = null;
        }
        c1730290v7z.getClass();
        boolean zLJIIL = C1730290v7z.LJIIL(numValueOf);
        BillboardActivityInfo billboardActivityInfo2 = flashDealTemplateItem.activityInfo;
        if (billboardActivityInfo2 != null) {
            num = billboardActivityInfo2.activityNum;
        }
        if ((num == null || billboardActivityInfo2.activityNum.intValue() <= 1) && !zLJIIL) {
            C0H1U.LIZIZ(flashDealTemplateEditAssem.lp());
            InterfaceC1730790v8n interfaceC1730790v8nKp = flashDealTemplateEditAssem.kp();
            if (interfaceC1730790v8nKp != null) {
                interfaceC1730790v8nKp.SK();
            }
            InterfaceC1730790v8n interfaceC1730790v8nKp2 = flashDealTemplateEditAssem.kp();
            if (interfaceC1730790v8nKp2 != null) {
                interfaceC1730790v8nKp2.Mn();
            }
            InterfaceC1730790v8n interfaceC1730790v8nKp3 = flashDealTemplateEditAssem.kp();
            if (interfaceC1730790v8nKp3 != null) {
                interfaceC1730790v8nKp3.Ab();
                return;
            }
            return;
        }
        if (zLJIIL && !flashDealTemplateEditAssem.tp().LLILZ) {
            if (z) {
                C12ES.LJIILL(0, flashDealTemplateEditAssem.lp());
            }
            if (flashDealTemplateEditAssem.lp().getVisibility() == 0) {
                flashDealTemplateEditAssem.yp().setTextColorRes(R.attr.w0);
                flashDealTemplateEditAssem.yp().setText(C20642515q3.LJI(2131832717));
            }
            InterfaceC1730790v8n interfaceC1730790v8nKp4 = flashDealTemplateEditAssem.kp();
            if (interfaceC1730790v8nKp4 != null) {
                interfaceC1730790v8nKp4.B8();
            }
            flashDealTemplateEditAssem.hp();
        } else {
            if (!flashDealTemplateEditAssem.tp().LLILZ) {
                C12ES.LJIILL(0, flashDealTemplateEditAssem.lp());
                flashDealTemplateEditAssem.yp().setTextColorRes(R.attr.a1k);
                TuxTextView tuxTextViewYp = flashDealTemplateEditAssem.yp();
                TemplateField templateField = (TemplateField) C13LP.LJJJLZIJ(0, flashDealTemplateItem.fieldList);
                if (templateField == null || (templateFieldData = templateField.fieldData) == null || (templateFieldProduct = templateFieldData.fieldProduct) == null || (str = templateFieldProduct.productName) == null) {
                    str = "";
                }
                tuxTextViewYp.setText(str);
            }
            InterfaceC1730790v8n interfaceC1730790v8nKp5 = flashDealTemplateEditAssem.kp();
            if (interfaceC1730790v8nKp5 != null) {
                interfaceC1730790v8nKp5.SK();
            }
            InterfaceC1730790v8n interfaceC1730790v8nKp6 = flashDealTemplateEditAssem.kp();
            if (interfaceC1730790v8nKp6 != null) {
                interfaceC1730790v8nKp6.Mn();
            }
            InterfaceC1730790v8n interfaceC1730790v8nKp7 = flashDealTemplateEditAssem.kp();
            if (interfaceC1730790v8nKp7 != null) {
                interfaceC1730790v8nKp7.Ab();
            }
        }
        C786410Ut5.I7(new AjS44S0200000_26(flashDealTemplateEditAssem, flashDealTemplateItem, 10), flashDealTemplateEditAssem.zp());
    }
}
