package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C034L;
import X.C07MW;
import X.C09R3;
import X.C0H1U;
import X.C12ES;
import X.C13LE;
import X.C13LP;
import X.C1421105hJ;
import X.C14EU;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1702530uPD;
import X.C1728460v52;
import X.C1729250v6J;
import X.C1730290v7z;
import X.C1730750v8j;
import X.C197039127h;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2108208Ns;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C290160BYw;
import X.C452501pT;
import X.C520040KaQ;
import X.C622680Oba;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1730790v8n;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import g1c.AjS70S0100000_26;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateEditBottomAreaAssem extends UISlotAssem implements InterfaceC1730790v8n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1730750v8j.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public long LLJJJJ;
    public TemplateItem LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TemplateEditBottomAreaAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/TemplateEditBottomAreaViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TemplateEditBottomAreaAssem.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJL = 8;
    }

    public TemplateEditBottomAreaAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TemplateEditBottomAreaViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS570S0100000_26(c19719912DlLIZ, 781), AFwS268S0000000_26.get$arr$(362), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BillboardGlobalViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS570S0100000_26(c19719912DlLIZ2, 782), AFwS268S0000000_26.get$arr$(363), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 776));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 775));
        this.LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 780));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 783));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.buk;
    }

    @Override // X.InterfaceC1730790v8n, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    public final C197039127h lp() {
        return (C197039127h) this.LLJJIJIL.getValue();
    }

    public final C197039127h mp() {
        return (C197039127h) this.LLJJIJIIJIL.getValue();
    }

    public final BillboardGlobalViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (BillboardGlobalViewModel) assemVMLazy.getValue();
    }

    public final C1730750v8j sp() {
        return (C1730750v8j) this.LLJJI.getValue();
    }

    public final LinearLayout tp() {
        return (LinearLayout) this.LLJJJ.getValue();
    }

    public final TuxTextView up() {
        return (TuxTextView) this.LLJJJIL.getValue();
    }

    public final TemplateEditBottomAreaViewModel yp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (TemplateEditBottomAreaViewModel) assemVMLazy.getValue();
    }

    private final boolean ip() {
        return !sp().LLILZ;
    }

    private final boolean kp() {
        TemplateItem templateItem;
        return sp().LLILZ || (templateItem = this.LLJJJJJIL) == null || !templateItem.b0();
    }

    private final void zp() {
        AssemViewModel.asyncSubscribe$default(yp(), new C2217381BqS() { // from class: X.0v7p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730180v7o) obj).LL;
            }
        }, null, new AwS605S0100000_26(this, 316), new AwS570S0100000_26(this, 778), new AwS605S0100000_26(this, 317), 2, null);
        AssemViewModel.asyncSubscribe$default(yp(), new C2217381BqS() { // from class: X.0v7q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730180v7o) obj).LLILLJJLI;
            }
        }, null, new AwS605S0100000_26(this, 318), new AwS570S0100000_26(this, 779), new AwS605S0100000_26(this, 319), 2, null);
        AssemViewModel.asyncSubscribe$default(yp(), new C2217381BqS() { // from class: X.0v7r
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730180v7o) obj).LLILLL;
            }
        }, null, new AwS605S0100000_26(this, 314), new AwS570S0100000_26(this, 777), new AwS605S0100000_26(this, 315), 2, null);
    }

    @Override // X.InterfaceC1730790v8n
    public void Ab() {
        if (!ip()) {
            C0H1U.LIZIZ(lp());
            return;
        }
        TemplateItem templateItem = this.LLJJJJJIL;
        if (templateItem == null) {
            return;
        }
        C12ES.LJIILL(0, lp());
        if (templateItem.b0()) {
            lp().setText(C20642515q3.LJI(2131822800));
            hp(templateItem);
        } else {
            if (templateItem.Sm()) {
                hp(templateItem);
                return;
            }
            lp().setEnabled(false);
            lp().setSupportClickWhenDisable(true);
            C786410Ut5.I7(new AjS70S0100000_26(this, 29), lp());
        }
    }

    @Override // X.InterfaceC1730790v8n
    public void B8() {
        C0H1U.LIZIZ(tp());
    }

    public final void Ep() {
        String resourceId;
        RootData rootData = op().getState().LL;
        LiveEffect liveEffect = op().getState().LLILZLL;
        if (liveEffect == null || (resourceId = liveEffect.getResourceId()) == null) {
            resourceId = "";
        }
        C1728460v52.LIZJ(rootData, "notice_board_edit", resourceId, "template_edit", "display_total");
    }

    @Override // X.InterfaceC1730790v8n
    public void Mn() {
        if (!kp()) {
            C0H1U.LIZIZ(mp());
            return;
        }
        if (sp().LLILZ) {
            mp().setButtonVariant(0);
        } else {
            mp().setButtonVariant(1);
        }
        TemplateItem templateItem = this.LLJJJJJIL;
        if (templateItem == null) {
            return;
        }
        C12ES.LJIILL(0, mp());
        mp().setEnabled(true);
        C786410Ut5.I7(new AjS44S0200000_26(this, templateItem, 13), mp());
    }

    @Override // X.InterfaceC1730790v8n
    public C197039127h Mo() {
        if (ip()) {
            return lp();
        }
        return null;
    }

    @Override // X.InterfaceC1730790v8n
    public void SK() {
        C197039127h c197039127hLp = lp();
        TemplateItem templateItem = this.LLJJJJJIL;
        boolean z = false;
        if (templateItem != null && templateItem.Sm()) {
            z = true;
        }
        c197039127hLp.setEnabled(z);
        mp().setEnabled(true);
        C0H1U.LIZIZ(tp());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC1730790v8n
    public C197039127h u4() {
        if (kp()) {
            return mp();
        }
        return null;
    }

    private final void hp(TemplateItem templateItem) {
        lp().setEnabled(true);
        C786410Ut5.I7(new AjS44S0200000_26(this, templateItem, 12), lp());
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

    @C14EU(sticky = true)
    public final void onBillboardIsUsingEvent(C034L c034l) {
        TemplateItem templateItemLIZ;
        TemplateItem templateItem = this.LLJJJJJIL;
        if (templateItem != null) {
            templateItemLIZ = C1730290v7z.LIZ(C1730290v7z.LIZ, templateItem, Boolean.valueOf(c034l.LIZ), null, null, null, null, 60);
        } else {
            templateItemLIZ = null;
        }
        this.LLJJJJJIL = templateItemLIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2108208Ns.LIZ), null, null, new C1702530uPD(this, null), 3);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C622680Oba.LIZJ(this);
        yp().LLILLJJLI = op();
        this.LLJJJJJIL = sp().LL;
        Mn();
        Ab();
        zp();
    }

    public final void Ap(boolean z, String str) {
        String resourceId;
        String str2;
        RootData rootData = op().getState().LL;
        LiveEffect liveEffect = op().getState().LLILZLL;
        if (liveEffect == null || (resourceId = liveEffect.getResourceId()) == null) {
            resourceId = "";
        }
        if (z) {
            str2 = "display_total_success";
        } else {
            str2 = "display_total_fail";
        }
        C1728460v52.LIZ(rootData, "notice_board_edit", resourceId, "template_edit", str2, "display_total", z, Long.valueOf(System.currentTimeMillis() - this.LLJJJJ), null, str);
    }

    public final void Fp(boolean z, String str) {
        String str2;
        TemplateField templateField;
        TemplateFieldData templateFieldData;
        TemplateFieldProduct templateFieldProduct;
        RootData rootData = op().getState().LL;
        TemplateItem templateItem = this.LLJJJJJIL;
        if (templateItem == null) {
            return;
        }
        boolean z2 = false;
        if ((templateItem instanceof ProductTemplateItem) && (templateField = (TemplateField) C13LP.LJJJLZIJ(0, ((ProductTemplateItem) templateItem).fieldList)) != null && (templateFieldData = templateField.fieldData) != null && (templateFieldProduct = templateFieldData.fieldProduct) != null) {
            str2 = templateFieldProduct.productId;
        } else {
            str2 = null;
        }
        String str3 = rootData.roomId;
        String str4 = rootData.authorId;
        boolean z3 = rootData.isNewUser;
        String templateId = templateItem.getTemplateId();
        int type = templateItem.getType();
        String strLIZ = rootData.LIZ();
        int i = rootData.templateEntryType;
        C1730290v7z.LIZ.getClass();
        boolean zLJIILJJIL = C1730290v7z.LJIILJJIL(templateItem);
        Map mapLIZ = C1729250v6J.LIZ(str3, str4, strLIZ, z3, "notice_board_edit", Integer.valueOf(i));
        mapLIZ.put("is_success", Integer.valueOf(z ? 1 : 0));
        mapLIZ.put("template_id", templateId);
        if (str != null) {
            mapLIZ.put("fail_reason", str);
        }
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        }
        if (z2) {
            mapLIZ.put("result_name", "template_review");
        } else {
            mapLIZ.put("result_name", "upload_product_image");
            mapLIZ.put("product_id", str2);
        }
        mapLIZ.put("template_type", Integer.valueOf(type));
        mapLIZ.put("is_suggested_template", Integer.valueOf(zLJIILJJIL ? 1 : 0));
        C1421105hJ.LIZJ("livesdk_tiktokec_result_show", mapLIZ);
    }
}
