package com.ss.android.ugc.aweme.poi.search.assem;

import X.AbstractC738140SxQ;
import X.C0WZX;
import X.C1155340gAe;
import X.C1180880gpq;
import X.C1196050hEJ;
import X.C1197490hGd;
import X.C1197940hHM;
import X.C1197970hHP;
import X.C1198630hIT;
import X.C1198670hIX;
import X.C1205490hTX;
import X.C1220000hqw;
import X.C123100dR;
import X.C1252710ihh;
import X.C1383370m6R;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1541950qED;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1668306g5;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C1EMR;
import X.C2097908Jt;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C2365509Or;
import X.C339190DRl;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723590SZx;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC1198680hIY;
import X.InterfaceC1197900hHI;
import X.InterfaceC1197930hHL;
import X.InterfaceC20660615sy;
import Y.ARunnableS87S0200000_18;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.poi.PoiAllianceTag;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM;
import com.ss.android.ugc.aweme.poi.creator.vm.PoiSearchCreatorVM;
import com.ss.android.ugc.aweme.poi.search.IPoiSearchAbility;
import com.ss.android.ugc.aweme.poi.search.PoiSearchBannerResModel;
import com.ss.android.ugc.aweme.poi.search.PoiSearchTopBanner;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiPublishRetagOptimizationExperiment;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS6S2400000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSearchHeaderAssem extends UIContentAssem implements InterfaceC1197900hHI {
    public static final C1197970hHP LLJJJIL = new Object() { // from class: X.0hHP
    };
    public View LLIZLLLIL;
    public EditText LLJ;
    public final C1559260qg8 LLJI = new C1559260qg8(new C723590SZx(this, C1155340gAe.class, "PoiSearchHierarchyData"), checkSupervisorPrepared());
    public final C736950SvV LLJIJIL;
    public final C736950SvV LLJILJIL;
    public final C736950SvV LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxIconView LLJJ;
    public TuxIconView LLJJI;
    public ConstraintLayout LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public String LLJJIJIL;
    public boolean LLJJJ;

    private final void Ho() {
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0HSX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197490hGd) obj).LLIZLLLIL;
            }
        }, null, new AwS620S0100000_6(this, 47), 6);
    }

    @Override // X.InterfaceC1197900hHI, X.InterfaceC723730SaB
    public String LIZ() {
        return null;
    }

    private final PoiCreatorVM Jo() {
        return (PoiCreatorVM) this.LLJILJIL.getValue();
    }

    private final PoiSearchCreatorVM Lo() {
        return (PoiSearchCreatorVM) this.LLJILJILJ.getValue();
    }

    public final void Go() {
        EditText editText = this.LLJ;
        if (editText == null) {
            editText = null;
        }
        editText.setText("");
        EditText editText2 = this.LLJ;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.requestFocus();
        EditText editText3 = this.LLJ;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.setCursorVisible(true);
        EditText editText4 = this.LLJ;
        if (editText4 == null) {
            editText4 = null;
        }
        editText4.setSelection(0);
        EditText editText5 = this.LLJ;
        if (editText5 == null) {
            editText5 = null;
        }
        KeyboardUtils.LIZLLL(editText5);
        View view = this.LLIZLLLIL;
        C786410Ut5.LJLLLLLL(8, view != null ? view : null);
    }

    @Override // X.InterfaceC1197900hHI
    public void N4() {
        InputMethodManager inputMethodManager;
        EditText editText = this.LLJ;
        if (editText == null) {
            editText = null;
        }
        editText.requestFocus();
        EditText editText2 = this.LLJ;
        if (editText2 == null) {
            editText2 = null;
        }
        Object objH2 = C786410Ut5.H2(editText2.getContext(), "input_method");
        if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
            return;
        }
        EditText editText3 = this.LLJ;
        if (editText3 == null) {
            editText3 = null;
        }
        if (inputMethodManager.showSoftInput(editText3, 1)) {
            return;
        }
        EditText editText4 = this.LLJ;
        HandlerHook.viewPostDelay(editText4 != null ? editText4 : null, new ARunnableS87S0200000_18(inputMethodManager, this, 14), 100L);
    }

    public final C1155340gAe No() {
        return (C1155340gAe) this.LLJI.getValue();
    }

    public final PoiSearchVM Oo() {
        return (PoiSearchVM) this.LLJIJIL.getValue();
    }

    public final void Vo() {
        PoiSearchBannerResModel poiSearchBannerResModel;
        PoiSearchTopBanner poiSearchTopBanner = C1197940hHM.LIZ;
        if (C123100dR.LIZ((poiSearchTopBanner == null || (poiSearchBannerResModel = poiSearchTopBanner.banner) == null) ? null : poiSearchBannerResModel.resource) && Intrinsics.LJFF(No().LLILLL, Boolean.TRUE)) {
            C339190DRl.LIZLLL(this.LLJJIJI);
            C1180880gpq c1180880gpq = C1180880gpq.LIZ;
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            c1180880gpq.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "poi_search_page_banner");
            C1180880gpq.LIZLLL(c2344009Gk);
            c2344009Gk.LJIIIIZZ("campaign_name", "my_year_campaign");
            C1180880gpq.LJ(fragmentLJI, "ttls_poi_search_banner_show", c2344009Gk.LIZ);
            C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 281));
        }
    }

    public PoiSearchHeaderAssem() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(528);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiSearchVM.class);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(680);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((AbstractC738140SxQ) this, 2044);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJIJIL = new C736950SvV(c19719912DlLIZ, aFwS206S0000000_18, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS256S0000000_18, awS562S0100000_18, c451610HnL, c723700Sa8);
        AFwS206S0000000_18 aFwS206S0000000_182 = AFwS206S0000000_18.get$arr$(526);
        this.LLJILJIL = new C736950SvV(C13LE.LIZ(PoiCreatorVM.class), aFwS206S0000000_182, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(681), new AwS562S0100000_18((AbstractC738140SxQ) this, 2045), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILJILJ = new C736950SvV(C13LE.LIZ(PoiSearchCreatorVM.class), AFwS206S0000000_18.get$arr$(527), c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(682), new AwS562S0100000_18((AbstractC738140SxQ) this, 2046), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIJIL = "";
    }

    @Override // X.InterfaceC1197900hHI
    public void KO() throws JSONException {
        SparkActivity sparkActivity;
        Context contextLJIIL = C1383370m6R.LJIIL();
        Activity activityLIZIZ = contextLJIIL != null ? C737910Sx3.LIZIZ(contextLJIIL) : null;
        if ((activityLIZIZ instanceof SparkActivity) && (sparkActivity = (SparkActivity) activityLIZIZ) != null) {
            sparkActivity.finish();
            return;
        }
        C1205490hTX c1205490hTX = C1205490hTX.LIZ;
        C1EMR c1emr = C1EMR.POI_CREATOR_STRENGTH_FEAT;
        Context contextLJIIL2 = C1383370m6R.LJIIL();
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("activity", String.valueOf(contextLJIIL2 != null ? C737910Sx3.LIZIZ(contextLJIIL2) : null)));
        Throwable th = new Throwable();
        c1205490hTX.getClass();
        C1205490hTX.LIZLLL(c1emr, "close_lynx_page", mapLIZJ, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01e6  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.assem.PoiSearchHeaderAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC1197900hHI
    public void Ib(PoiAllianceTag poiAllianceTag, JSONObject jSONObject) {
        String str = poiAllianceTag.clickUrl;
        if (str == null) {
            return;
        }
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        sparkContext.LJJJZ("roma_enable_with_param", "1");
        sparkContext.LJJJZ("enter_from", "poi_search_page");
        sparkContext.LJJJZ("poi_search_params", C786410Ut5.J3(jSONObject));
        Context context = getContext();
        if (context != null) {
            C1541950qED.LIZJ.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }

    public final void So(String str, boolean z) {
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        View view = null;
        ((InterfaceC1197930hHL) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1197930hHL.class), null)).Sp(((InterfaceC1197930hHL) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1197930hHL.class), null)).k7(), str);
        ((InterfaceC1197930hHL) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1197930hHL.class), null)).nf(str);
        ((InterfaceC1197930hHL) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1197930hHL.class), null)).uh(str, z);
        if (C123100dR.LIZ(str)) {
            View view2 = this.LLIZLLLIL;
            if (view2 != null) {
                view = view2;
            }
            C786410Ut5.LJLLLLLL(0, view);
            return;
        }
        View view3 = this.LLIZLLLIL;
        if (view3 != null) {
            view = view3;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.0Ou4] */
    @Override // X.InterfaceC1197900hHI
    public void ay(PoiData poiData, C1198630hIT c1198630hIT) throws Throwable {
        String str;
        String str2;
        PoiMobParam poiMobParam;
        boolean zBooleanValue;
        String string;
        String string2;
        String string3;
        String str3;
        String str4;
        IPoiSearchAbility iPoiSearchAbility;
        PoiSearchVM poiSearchVMOo = Oo();
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            poiSearchVMOo.getClass();
        } else {
            poiSearchVMOo.LLJZIJLIL = poiData;
            poiSearchVMOo.LLL = c1198630hIT;
            switch (C1198670hIX.LIZ[poiSearchVMOo.LLILLL.ordinal()]) {
                case 1:
                case 2:
                case 4:
                case 6:
                    poiSearchVMOo.CQ2("click");
                    Intent intent = new Intent();
                    intent.putExtra("poi", poiData);
                    intent.putExtra("poi_data", poiData);
                    intent.putExtra("keyword", ((C1197490hGd) poiSearchVMOo.getState()).LL);
                    if (poiData != null) {
                        str = poiData.logId;
                    } else {
                        str = null;
                    }
                    intent.putExtra("log_id", str);
                    if (poiData != null && (poiMobParam = poiData.mobParam) != null) {
                        str2 = poiMobParam.searchId;
                    } else {
                        str2 = null;
                    }
                    intent.putExtra("search_id", str2);
                    C2204961BRm.LLJJIJIL(-1, intent, c19egLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHd2TPdrALVaog2iLZLmRYpFto=", null));
                    c19egLIZ.finish();
                    break;
                case 3:
                case 5:
                    EnumC1198680hIY enumC1198680hIY = poiSearchVMOo.LLILLL;
                    if (poiSearchVMOo.LL) {
                        JSONObject jSONObject = new JSONObject();
                        C2365509Or.LIZLLL(jSONObject, "retag_enter_method", poiSearchVMOo.LLJJIII);
                        if (Intrinsics.LJFF(poiSearchVMOo.LLJJIII, "video") || Intrinsics.LJFF(poiSearchVMOo.LLJJIII, "edit_post") || Intrinsics.LJFF(poiSearchVMOo.LLJJIII, "inbox")) {
                            C2365509Or.LIZLLL(jSONObject, "after_post_days", poiSearchVMOo.LLJJIJI);
                        }
                        ?? r6 = new InterfaceC20660615sy() { // from class: X.0Ou4
                            @Override // X.InterfaceC20660615sy
                            public final boolean t2() {
                                return true;
                            }

                            @Override // X.InterfaceC20658015sY
                            public final boolean Xu() {
                                return c19egLIZ.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
                            }

                            @Override // X.InterfaceC20658015sY
                            public final C688120Qyw i2() {
                                C19EG c19eg = c19egLIZ;
                                return new C688120Qyw(c19eg, c19eg, null);
                            }

                            @Override // X.InterfaceC20658015sY
                            public final String getSceneId() {
                                return C634060Otw.LIZ(this);
                            }
                        };
                        if (poiData != null) {
                            str4 = poiData.name;
                        } else {
                            str4 = null;
                        }
                        PopupManager.LJIIZILJ(new C1196050hEJ(str4, jSONObject, r6, c19egLIZ, new AwS262S0300000_18(poiSearchVMOo, c19egLIZ, poiData, 13)), new C1668306g5("ls_poi_search"));
                    } else {
                        PoiPublishRetagOptimizationExperiment.LIZ.getClass();
                        Boolean bool = PoiPublishRetagOptimizationExperiment.LIZIZ.editPostPromptChange;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        String string4 = c19egLIZ.getString(2131844833);
                        if (zBooleanValue) {
                            Object[] objArr = new Object[1];
                            if (poiData != null) {
                                str3 = poiData.name;
                            } else {
                                str3 = null;
                            }
                            objArr[0] = str3;
                            string = c19egLIZ.getString(2131844755, objArr);
                            string2 = c19egLIZ.getString(2131844754);
                            string3 = c19egLIZ.getString(2131844753);
                        } else {
                            if (poiData != null) {
                                string = poiData.name;
                            } else {
                                string = null;
                            }
                            string2 = c19egLIZ.getString(2131844834);
                            string3 = c19egLIZ.getString(2131844835);
                        }
                        C1397580mTM c1397580mTM = new C1397580mTM(c19egLIZ);
                        if (!zBooleanValue) {
                            c1397580mTM.LJI(string4);
                        }
                        c1397580mTM.LIZIZ(string);
                        C985403tE.LIZ(c1397580mTM, new AwS6S2400000_18(string2, string3, poiSearchVMOo, c19egLIZ, poiData, enumC1198680hIY, 4));
                        c1397580mTM.LJ(new AwS597S0100000_18(poiSearchVMOo, 674));
                        c1397580mTM.LJII = false;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                    }
                    break;
                default:
                    throw new C1954807lC();
            }
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null && (iPoiSearchAbility = (IPoiSearchAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ2, null), IPoiSearchAbility.class, null)) != null) {
            iPoiSearchAbility.FA("choose_poi");
        }
    }
}
