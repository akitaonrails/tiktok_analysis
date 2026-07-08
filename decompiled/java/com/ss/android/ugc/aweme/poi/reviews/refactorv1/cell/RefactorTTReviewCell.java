package com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell;

import X.AbstractC1192060h7s;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C08QT;
import X.C09RB;
import X.C1189060h32;
import X.C1190820h5s;
import X.C1191130h6N;
import X.C1191340h6i;
import X.C1191350h6j;
import X.C1191610h79;
import X.C1191620h7A;
import X.C1191810h7T;
import X.C1192010h7n;
import X.C1192020h7o;
import X.C1192030h7p;
import X.C1192040h7q;
import X.C1192050h7r;
import X.C1205490hTX;
import X.C1308910kAL;
import X.C13LE;
import X.C13LQ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1939607ik;
import X.C1954807lC;
import X.C19719912Dl;
import X.C1EMR;
import X.C2188811AlT;
import X.C2215091Bml;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C946803n0;
import X.EnumC2207011BZj;
import X.EnumC2215081Bmk;
import X.InterfaceC1191710h7J;
import X.InterfaceC1192080h7u;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import Y.ALAdapterS13S0200000_18;
import Y.AUListenerS267S0100000_18;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewCellVAbility;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsFoldedReviewCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.tab.adapter.PoiCommentReviewCellVAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RefactorTTReviewCell extends AbstractRefactorPoiReviewCell<PoiReviewsApi.PoiReviewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public AbstractC1192060h7s LLILZIL;
    public InterfaceC1191710h7J LLILZLL;
    public final AssemVMLazy LLIZ;
    public boolean LLIZLLLIL;
    public PoiReviewsApi.PoiReviewModel LLJ;
    public final C01GW LLJI;
    public final boolean LLJIJIL;
    public TuxTextView LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public ConstraintLayout LLJJ;
    public View LLJJI;
    public TuxIconView LLJJIII;
    public View LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public View LLJJIJIL;
    public TuxIconView LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RefactorTTReviewCell.class, "landingVm", "getLandingVm$poi_release()Lcom/ss/android/ugc/aweme/poi/reviews/landing/viewmodel/PoiReviewsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RefactorTTReviewCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewsListViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1877);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(611);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1860), awS562S0100000_18, AFwS206S0000000_18.get$arr$(474), new AwS562S0100000_18((C03K6) this, 1863), new AwS562S0100000_18((C03K6) this, 1865), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1867), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1869), null, new AwS562S0100000_18((C03K6) this, 1870));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1864);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1866);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1868);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 94));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1871);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1872);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1873);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1874);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1875);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1876), awS562S0100000_18, AFwS206S0000000_18.get$arr$(475), new AwS562S0100000_18((C03K6) this, 1878), new AwS562S0100000_18((C03K6) this, 1879), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1880), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1881), null, new AwS562S0100000_18((C03K6) this, 1882));
        } else {
            if (!Intrinsics.LJFF(obj, obj)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1883), awS562S0100000_18, AFwS206S0000000_18.get$arr$(476), new AwS562S0100000_18((C03K6) this, 1853), new AwS562S0100000_18((C03K6) this, 1854), new AwS562S0100000_18((C03K6) this, 1857), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1859));
        }
        this.LLIZ = assemVMLazy;
        this.LLIZLLLIL = true;
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1861));
        this.LLJIJIL = C1191350h6j.LIZ();
        this.LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1858));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1855));
        this.LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1856));
        this.LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1862));
    }

    public final int R5() {
        InterfaceC1191710h7J interfaceC1191710h7J = this.LLILZLL;
        if (interfaceC1191710h7J != null) {
            interfaceC1191710h7J.wZ();
        }
        return getBindingAdapterPosition() + 1;
    }

    public final C1191810h7T T5() {
        return (C1191810h7T) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C1192050h7r U5() {
        return (C1192050h7r) this.LLJL.getValue();
    }

    public final C1191620h7A V5() {
        return (C1191620h7A) this.LLJJL.getValue();
    }

    public final PageFinder W5() {
        return (PageFinder) this.LLJI.getValue();
    }

    public final AbstractC1192060h7s X5() {
        AbstractC1192060h7s abstractC1192060h7s = this.LLILZIL;
        if (abstractC1192060h7s != null) {
            return abstractC1192060h7s;
        }
        return null;
    }

    public final C1191610h79 a6() {
        return (C1191610h79) this.LLJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell
    public final List<InterfaceC1192080h7u> I5() {
        return X5().LJIIIIZZ(this);
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell
    public final int L5() {
        return X5().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell
    public final void N5() {
        Object obj;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            obj = C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiReviewsListItemCell.PoiReviewCellVAbility.class, null) != null ? C1192030h7p.LIZ : C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiReviewCellVAbility.class, null) != null ? C1192010h7n.LIZ : C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiReviewsFoldedReviewCell.PoiReviewCellVAbility.class, null) != null ? C1192020h7o.LIZ : C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiCommentReviewCellVAbility.class, null) != null ? C1192040h7q.LIZ : C1192030h7p.LIZ;
        } else {
            obj = C1192030h7p.LIZ;
        }
        if (!Intrinsics.LJFF(obj, X5())) {
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.UNKNOWN_ERR;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TT scene probe mismatch: onCreateItemView=");
            sbLIZ.append(X5());
            sbLIZ.append(" loadAbilityState=");
            sbLIZ.append(obj);
            sbLIZ.append(". 重看 host probe 路径——onCreateItemView 走 view 树 findFragment(parent)、loadAbilityState 走 PowerCell.parent 链 findFragmentInCell()，两者应一致。");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            IllegalStateException illegalStateException = new IllegalStateException("TT scene probe mismatch");
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, strLIZIZ, null, illegalStateException);
        }
        X5().LJII(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b6() {
        return !C1190820h5s.LJFF((PoiReviewsApi.PoiReviewModel) getItem()) || C1190820h5s.LJII((PoiReviewsApi.PoiReviewModel) getItem());
    }

    public final void c6() {
        V5().LJI();
    }

    public final View d6() {
        return !C1191350h6j.LIZ() ? this.LLJJIJI : this.LLJJJJ;
    }

    public final View e6() {
        return C1191340h6i.LIZIZ() ? this.LLJJJJJIL : this.LLJJJIL;
    }

    public final View f6() {
        return C1191340h6i.LIZIZ() ? this.LLJJJJLIIL : this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.ffv);
        if (tuxTextView == null) {
            tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.ffs);
        }
        this.LLJILJIL = tuxTextView;
        this.itemView.findViewById(R.id.f707g3a);
        this.LLJILJILJ = this.itemView.findViewById(R.id.mnd);
        this.LLJILLL = this.itemView.findViewById(R.id.cpg);
        this.LLJJ = (ConstraintLayout) this.itemView.findViewById(R.id.m6p);
        this.itemView.findViewById(R.id.ths);
        this.LLJJI = this.itemView.findViewById(R.id.tht);
        this.itemView.findViewById(R.id.cpi);
        this.LLJJIJIIJIL = (TuxTextView) this.itemView.findViewById(R.id.ffv);
        this.LLJJIII = (TuxIconView) this.itemView.findViewById(R.id.fxm);
        this.LLJJJ = (TuxIconView) this.itemView.findViewById(R.id.fxp);
        this.LLJJIJI = this.itemView.findViewById(R.id.fxn);
        this.LLJJJIL = this.itemView.findViewById(R.id.mnf);
        this.LLJJJJ = this.itemView.findViewById(R.id.fxo);
        this.LLJJIJIL = this.itemView.findViewById(R.id.cpi);
        this.LLJJJJJIL = this.itemView.findViewById(R.id.mng);
        this.LLJJJJLIIL = this.itemView.findViewById(R.id.cpj);
        X5().LJ(this);
        X5().LIZ(this);
        X5().LIZJ(this);
        X5().LJIILIIL(this);
        X5().LJIIL(this);
    }

    public static CharSequence S5(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        long jLongValue;
        Long l;
        PoiReviewsApi.PoiReviewBasicInfoModel basicInfo = poiReviewModel.getBasicInfo();
        if (basicInfo != null && (l = basicInfo.createTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        return C2215091Bml.LIZLLL(jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT), Locale.getDefault(), C13LQ.LJLIIL(new EnumC2215081Bmk[]{EnumC2215081Bmk.Year, EnumC2215081Bmk.Date}), EnumC2207011BZj.Mid, true, false, false, 1552);
    }

    public final void h6(boolean z) {
        V5().LJIIIZ(z);
        if (X5() == C1192030h7p.LIZ || X5() == C1192020h7o.LIZ) {
            V5().LJI();
        }
    }

    public final void i6(boolean z) {
        if (X5() == C1192030h7p.LIZ || X5() == C1192020h7o.LIZ) {
            V5().LJI();
        }
        V5().LJIIJ(z);
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        AbstractC1192060h7s abstractC1192060h7s;
        if (this.LLILZIL == null) {
            Fragment fragmentLIZ = C946803n0.LIZ(viewGroup);
            if (fragmentLIZ == null) {
                abstractC1192060h7s = C1192030h7p.LIZ;
            } else {
                InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ, null);
                if (C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiReviewsListItemCell.PoiReviewCellVAbility.class, null) != null) {
                    abstractC1192060h7s = C1192030h7p.LIZ;
                } else if (C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiReviewCellVAbility.class, null) != null) {
                    abstractC1192060h7s = C1192010h7n.LIZ;
                } else if (C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiReviewsFoldedReviewCell.PoiReviewCellVAbility.class, null) != null) {
                    abstractC1192060h7s = C1192020h7o.LIZ;
                } else if (C1558520qew.LIZ(interfaceC665370Q7zLJFF, PoiCommentReviewCellVAbility.class, null) != null) {
                    abstractC1192060h7s = C1192040h7q.LIZ;
                } else {
                    abstractC1192060h7s = C1192030h7p.LIZ;
                }
            }
            this.LLILZIL = abstractC1192060h7s;
        }
        return X5().LJI(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        X5().LJIIJJI(this);
    }

    public final void q6(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, this.itemView.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stage_reviews_cell: bgcolor highlight pos: ");
            sbLIZ.append(getBindingAdapterPosition());
            sbLIZ.append(" review_id: ");
            sbLIZ.append(poiReviewModel.getReviewId());
            sbLIZ.append(" viewId: ");
            sbLIZ.append(this.itemView.hashCode());
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            ConstraintLayout constraintLayout = this.LLJJ;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundColor(iIntValue);
            }
        }
    }

    public final void r6(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        InterfaceC1191710h7J interfaceC1191710h7J = this.LLILZLL;
        if (interfaceC1191710h7J != null) {
            interfaceC1191710h7J.D00();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell
    /* JADX INFO: renamed from: P5 */
    public final void onBindItemView(PoiReviewsApi.PoiReviewModel poiReviewModel, List<? extends Object> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stage_reviews_cell:  TT onBindItemView pos: ");
        sbLIZ.append(getBindingAdapterPosition());
        sbLIZ.append(" review_id: ");
        sbLIZ.append(poiReviewModel.getReviewId());
        sbLIZ.append(" scene: ");
        sbLIZ.append(X5());
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("stage_reviews_cell: bgcolor highlight state: ");
        sbLIZ2.append(poiReviewModel.getHighlightState());
        sbLIZ2.append(" pos: ");
        sbLIZ2.append(getBindingAdapterPosition());
        sbLIZ2.append(" review_id: ");
        sbLIZ2.append(poiReviewModel.getReviewId());
        sbLIZ2.append(" viewId: ");
        sbLIZ2.append(this.itemView.hashCode());
        sbLIZ2.append(' ');
        C2188811AlT.LIZIZ(sbLIZ2);
        int i = C1191130h6N.LIZ[poiReviewModel.getHighlightState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0h, this.itemView.getContext());
                        if (numLIZJ != null) {
                            ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(numLIZJ.intValue(), 0);
                            valueAnimatorOfArgb.setDuration(300L);
                            valueAnimatorOfArgb.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfArgb.addUpdateListener(new AUListenerS267S0100000_18(this, 14));
                            valueAnimatorOfArgb.addListener(new ALAdapterS13S0200000_18(this, poiReviewModel, 3));
                            valueAnimatorOfArgb.start();
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    q6(poiReviewModel);
                }
            } else {
                q6(poiReviewModel);
                InterfaceC1191710h7J interfaceC1191710h7J = this.LLILZLL;
                if (interfaceC1191710h7J != null) {
                    interfaceC1191710h7J.CT1(poiReviewModel);
                }
            }
        } else {
            ConstraintLayout constraintLayout = this.LLJJ;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundColor(0);
            }
        }
        if (X5().LJIILJJIL(list)) {
            this.LL = poiReviewModel;
            this.LLJ = poiReviewModel;
            C08QT c08qt = new C08QT(C09RB.LJIIIZ(new C1939607ik((Iterable) this.LLILZ.getValue()), AFwS256S0000000_18.get$arr$(612)));
            while (c08qt.hasNext()) {
                ((InterfaceC1192080h7u) c08qt.next()).LIZJ(poiReviewModel, list);
            }
            return;
        }
        super.onBindItemView(poiReviewModel, list);
        this.LLJ = poiReviewModel;
        X5().LIZIZ(this, poiReviewModel);
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        onBindItemView((PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl, list);
    }
}
