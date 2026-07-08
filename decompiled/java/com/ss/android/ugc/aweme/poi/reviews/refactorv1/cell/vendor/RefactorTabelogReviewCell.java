package com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.vendor;

import X.AbstractC1192150h81;
import X.C01GW;
import X.C1189060h32;
import X.C1191360h6k;
import X.C1191620h7A;
import X.C1191640h7C;
import X.C1191660h7E;
import X.C1191790h7R;
import X.C1191990h7l;
import X.C1192140h80;
import X.C1192180h84;
import X.C1205490hTX;
import X.C13LQ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19ME;
import X.C1EMR;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2215091Bml;
import X.C297470BlJ;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.EnumC1189990h4X;
import X.EnumC2207011BZj;
import X.EnumC2215081Bmk;
import X.InterfaceC1191710h7J;
import X.InterfaceC1192080h7u;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.ViewOnLongClickListenerC1208780hYq;
import Y.ACListenerS121S0200000_18;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewCellVAbility;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RefactorTabelogReviewCell extends AbstractRefactorPoiReviewCell<PoiReviewsApi.PoiReviewModel> {
    public AbstractC1192150h81 LLILZIL;
    public InterfaceC1191710h7J LLILZLL;
    public C1191790h7R LLIZ;
    public PoiReviewsApi.PoiReviewModel LLIZLLLIL;
    public TuxTextView LLJ;
    public View LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1931));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1930));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell
    public final List<InterfaceC1192080h7u> I5() {
        InterfaceC1192080h7u[] interfaceC1192080h7uArr = new InterfaceC1192080h7u[6];
        AbstractC1192150h81 abstractC1192150h81 = this.LLILZIL;
        if (abstractC1192150h81 == null) {
            abstractC1192150h81 = null;
        }
        interfaceC1192080h7uArr[0] = abstractC1192150h81.LJIIIZ(this);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 1921);
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(this, 1922);
        AbstractC1192150h81 abstractC1192150h812 = this.LLILZIL;
        if (abstractC1192150h812 == null) {
            abstractC1192150h812 = null;
        }
        interfaceC1192080h7uArr[1] = new C1191640h7C(awS562S0100000_18, awS562S0100000_182, abstractC1192150h812.LJI(this), new AwS562S0100000_18(this, 1923), new AwS562S0100000_18(this, 1924), new AwS562S0100000_18(this, 1925));
        AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18(this, 1926);
        AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(this, 1927);
        AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(this, 1928);
        AbstractC1192150h81 abstractC1192150h813 = this.LLILZIL;
        if (abstractC1192150h813 == null) {
            abstractC1192150h813 = null;
        }
        interfaceC1192080h7uArr[2] = new C1191660h7E(awS562S0100000_183, awS562S0100000_184, awS562S0100000_185, abstractC1192150h813.LIZJ(this));
        AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(this, 1929);
        AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(this, 480);
        AwS597S0100000_18 awS597S0100000_182 = new AwS597S0100000_18(this, 481);
        AbstractC1192150h81 abstractC1192150h814 = this.LLILZIL;
        interfaceC1192080h7uArr[3] = new C1191990h7l(awS562S0100000_186, awS597S0100000_18, awS597S0100000_182, (abstractC1192150h814 != null ? abstractC1192150h814 : null).LJIILIIL(this));
        interfaceC1192080h7uArr[4] = S5();
        interfaceC1192080h7uArr[5] = this.LLJILJIL.getValue();
        return C1697810uHb.LJIIJJI(interfaceC1192080h7uArr);
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell
    public final int L5() {
        AbstractC1192150h81 abstractC1192150h81 = this.LLILZIL;
        if (abstractC1192150h81 == null) {
            abstractC1192150h81 = null;
        }
        return abstractC1192150h81.LJFF();
    }

    public final int R5() {
        InterfaceC1191710h7J interfaceC1191710h7J = this.LLILZLL;
        if (interfaceC1191710h7J != null) {
            interfaceC1191710h7J.wZ();
        }
        return getBindingAdapterPosition() + 1;
    }

    public final C1191620h7A S5() {
        return (C1191620h7A) this.LLJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell
    public final void N5() {
        Object obj;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            obj = (C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiReviewsListItemCell.PoiReviewCellVAbility.class, null) == null && C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiReviewCellVAbility.class, null) != null) ? C1192180h84.LIZ : C1192140h80.LIZ;
        } else {
            obj = C1192140h80.LIZ;
        }
        AbstractC1192150h81 abstractC1192150h81 = this.LLILZIL;
        if (abstractC1192150h81 == null) {
            abstractC1192150h81 = null;
        }
        if (!Intrinsics.LJFF(obj, abstractC1192150h81)) {
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.UNKNOWN_ERR;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Tabelog scene probe mismatch: onCreateItemView=");
            AbstractC1192150h81 abstractC1192150h812 = this.LLILZIL;
            if (abstractC1192150h812 == null) {
                abstractC1192150h812 = null;
            }
            sbLIZ.append(abstractC1192150h812);
            sbLIZ.append(" loadAbilityState=");
            sbLIZ.append(obj);
            sbLIZ.append(". 重看 host probe 路径——onCreateItemView 走 view 树 findFragment(parent)、loadAbilityState 走 PowerCell.parent 链 findFragmentInCell()，两者应一致。");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            IllegalStateException illegalStateException = new IllegalStateException("Tabelog scene probe mismatch");
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, strLIZIZ, null, illegalStateException);
        }
        AbstractC1192150h81 abstractC1192150h813 = this.LLILZIL;
        (abstractC1192150h813 != null ? abstractC1192150h813 : null).LJIIIIZZ(this);
    }

    public final void T5() {
        S5().LJI();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View view;
        C19ME c19me;
        super.onItemViewCreated();
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.ffv);
        this.LLJI = this.itemView.findViewById(R.id.f707g3a);
        AbstractC1192150h81 abstractC1192150h81 = this.LLILZIL;
        if (abstractC1192150h81 == null) {
            abstractC1192150h81 = null;
        }
        abstractC1192150h81.LIZLLL(this);
        AbstractC1192150h81 abstractC1192150h812 = this.LLILZIL;
        if (abstractC1192150h812 == null) {
            abstractC1192150h812 = null;
        }
        abstractC1192150h812.LIZ(this);
        AbstractC1192150h81 abstractC1192150h813 = this.LLILZIL;
        if (abstractC1192150h813 == null) {
            abstractC1192150h813 = null;
        }
        abstractC1192150h813.getClass();
        if (C297470BlJ.LIZ() && (view = (View) LLLZIL("translate.areaSeeOriginal")) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                c19me.startToStart = R.id.ji7;
                c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                C786410Ut5.W5(view, c19me);
            }
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 482));
    }

    public final void U5(boolean z) {
        S5().LJIIIZ(z);
        AbstractC1192150h81 abstractC1192150h81 = this.LLILZIL;
        if (abstractC1192150h81 == null) {
            abstractC1192150h81 = null;
        }
        if (abstractC1192150h81.LJ()) {
            S5().LJI();
        }
    }

    public final void V5(boolean z) {
        AbstractC1192150h81 abstractC1192150h81 = this.LLILZIL;
        if (abstractC1192150h81 == null) {
            abstractC1192150h81 = null;
        }
        if (abstractC1192150h81.LJ()) {
            S5().LJI();
        }
        S5().LJIIJ(z);
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        AbstractC1192150h81 abstractC1192150h81;
        AbstractC1192150h81 abstractC1192150h812 = null;
        if (this.LLILZIL == null) {
            Fragment fragmentLIZ = C946803n0.LIZ(viewGroup);
            if (fragmentLIZ == null) {
                abstractC1192150h81 = C1192140h80.LIZ;
            } else {
                InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ, null);
                if (C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiReviewsListItemCell.PoiReviewCellVAbility.class, null) == null && C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiReviewCellVAbility.class, null) != null) {
                    abstractC1192150h81 = C1192180h84.LIZ;
                } else {
                    abstractC1192150h81 = C1192140h80.LIZ;
                }
            }
            this.LLILZIL = abstractC1192150h81;
        }
        AbstractC1192150h81 abstractC1192150h813 = this.LLILZIL;
        if (abstractC1192150h813 != null) {
            abstractC1192150h812 = abstractC1192150h813;
        }
        return abstractC1192150h812.LJII(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell
    /* JADX INFO: renamed from: P5 */
    public final void onBindItemView(PoiReviewsApi.PoiReviewModel poiReviewModel, List<? extends Object> list) {
        Long l;
        long jLongValue;
        Long l2;
        super.onBindItemView(poiReviewModel, list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stage_reviews_cell: Tabelog onBindItemView pos: ");
        sbLIZ.append(getBindingAdapterPosition());
        sbLIZ.append(" review_id: ");
        sbLIZ.append(poiReviewModel.getReviewId());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZLLLIL = poiReviewModel;
        PoiReviewsApi.PoiReviewBasicInfoModel basicInfo = poiReviewModel.getBasicInfo();
        AbstractC1192150h81 abstractC1192150h81 = null;
        if (basicInfo != null) {
            l = basicInfo.createTime;
        } else {
            l = null;
        }
        if (l != null) {
            TuxTextView tuxTextView = this.LLJ;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            View view = this.LLJI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        } else {
            TuxTextView tuxTextView2 = this.LLJ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            View view2 = this.LLJI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        TuxTextView tuxTextView3 = this.LLJ;
        if (tuxTextView3 != null) {
            PoiReviewsApi.PoiReviewBasicInfoModel basicInfo2 = poiReviewModel.getBasicInfo();
            if (basicInfo2 != null && (l2 = basicInfo2.createTime) != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            tuxTextView3.setText(C2215091Bml.LIZLLL(jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT), Locale.getDefault(), C13LQ.LJLIIL(new EnumC2215081Bmk[]{EnumC2215081Bmk.Year, EnumC2215081Bmk.Date}), EnumC2207011BZj.Mid, true, false, false, 1552));
        }
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 17));
        AbstractC1192150h81 abstractC1192150h812 = this.LLILZIL;
        if (abstractC1192150h812 == null) {
            abstractC1192150h812 = null;
        }
        abstractC1192150h812.getClass();
        if (C1191360h6k.LIZ() && poiReviewModel.getScene() == EnumC1189990h4X.POI_DETAIL_PAGE) {
            C786410Ut5.I7(new ACListenerS121S0200000_18(this, poiReviewModel, 28), this.itemView);
        }
        AbstractC1192150h81 abstractC1192150h813 = this.LLILZIL;
        if (abstractC1192150h813 != null) {
            abstractC1192150h81 = abstractC1192150h813;
        }
        abstractC1192150h81.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        onBindItemView((PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl, list);
    }
}
