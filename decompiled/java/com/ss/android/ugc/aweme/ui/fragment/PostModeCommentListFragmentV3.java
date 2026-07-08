package com.ss.android.ugc.aweme.ui.fragment;

import X.AbstractC21673619ry;
import X.C0SO2;
import X.C0SOM;
import X.C0SOP;
import X.C0SOQ;
import X.C0SRI;
import X.C0SRL;
import X.C0SS3;
import X.C0SS4;
import X.C0SU0;
import X.C12ES;
import X.C1308910kAL;
import X.C16G1;
import X.C19EG;
import X.C21146717pB;
import X.C673150Qan;
import X.C687700QyG;
import X.C717490SCl;
import X.C721410SRn;
import X.C721460SRs;
import X.C721490SRv;
import X.C721640SSk;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC716950SAj;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentFloatAdAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentExposureAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.view.AdvancedStopAtOffsetAppBarBehavior;
import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS590S0100000_11;
import u4.q0;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeCommentListFragmentV3 extends PostModeCommentListFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjAlZykhKSIhHELIOSLCEnZhUjOjseJyEpCiA+JSAiPQM6OzEKOy40JSAiPRlg";
    public boolean LLL;
    public PostModeNestHeaderComponent LLLF;
    public C0SS3 LLLFF;
    public WeakReference<C0SRI> LLLFFI;
    public ICommentFloatAdAbility LLLFZ;
    public ICommentListAssemAbility LLLI;
    public ICommentExposureAbility LLLII;
    public ICommentListVMAbility LLLIIII;

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        super.bindAbility(obj, cls);
        if (cls == ICommentFloatAdAbility.class) {
            this.LLLFZ = (ICommentFloatAdAbility) obj;
        } else if (cls == ICommentListAssemAbility.class) {
            this.LLLI = (ICommentListAssemAbility) obj;
        } else if (cls == ICommentExposureAbility.class) {
            this.LLLII = (ICommentExposureAbility) obj;
        } else if (cls == ICommentListVMAbility.class) {
            this.LLLIIII = (ICommentListVMAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentPageScope.class});
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2, X.C0QSJ
    public final Object getAbility(Class cls) {
        return cls == ICommentFloatAdAbility.class ? this.LLLFZ : cls == ICommentListAssemAbility.class ? this.LLLI : cls == ICommentExposureAbility.class ? this.LLLII : cls == ICommentListVMAbility.class ? this.LLLIIII : super.getAbility(cls);
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(CommentPageScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(CommentPageScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final void nS() {
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final void sS() {
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        super.unbindAbility(obj, cls);
        if (cls == ICommentFloatAdAbility.class) {
            this.LLLFZ = null;
        } else if (cls == ICommentListAssemAbility.class) {
            this.LLLI = null;
        } else if (cls == ICommentExposureAbility.class) {
            this.LLLII = null;
        } else if (cls == ICommentListVMAbility.class) {
            this.LLLIIII = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final void wS() {
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final void NR() {
        if (this.LLL) {
            C0SU0 c0su0 = this.LLJILJIL;
            if (c0su0 != null) {
                c0su0.setOverScrollMode(2);
                c0su0.LLJJIJIL = true;
                return;
            }
            return;
        }
        PostModeDetailParams postModeDetailParams = this.LLILZLL;
        if (postModeDetailParams == null || !postModeDetailParams.enableGestureExit) {
            C0SU0 c0su02 = this.LLJILJIL;
            if (c0su02 != null) {
                c0su02.setOverScrollMode(0);
                c0su02.LLJJIJIL = true;
                return;
            }
            return;
        }
        C0SU0 c0su03 = this.LLJILJIL;
        Integer numValueOf = null;
        if ((c0su03 instanceof C0SU0) && c0su03 != null) {
            double upperThreshold = c0su03.getUpperThreshold();
            C721640SSk c721640SSk = C721640SSk.LIZ;
            C19EG c19egRequireActivity = requireActivity();
            c721640SSk.getClass();
            numValueOf = Integer.valueOf((int) ((upperThreshold + ((double) C721640SSk.LJIIIIZZ(c19egRequireActivity))) * 1.3d));
        }
        ViewGroup viewGroup = this.LLJILJILJ;
        ImageView imageView = new ImageView(UR());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10, -1);
        layoutParams.height = numValueOf != null ? numValueOf.intValue() : C12ES.LJIIIIZZ(UR()) / 3;
        C786410Ut5.c6(imageView, layoutParams);
        viewGroup.addView(imageView, 0);
        C0SU0 c0su04 = this.LLJILJIL;
        if (!(c0su04 instanceof C0SU0) || c0su04 == null) {
            return;
        }
        c0su04.setOnDragOutOfBounds(new AwS590S0100000_11(imageView, 301));
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final void RR() throws Exception {
        PostModeNestHeaderComponent postModeNestHeaderComponent = this.LLLF;
        if (postModeNestHeaderComponent != null) {
            C0SOQ c0soq = postModeNestHeaderComponent.LLILZLL;
            if (c0soq != null) {
                c0soq.LJI();
            }
            postModeNestHeaderComponent.LLILZLL = null;
            ValueAnimator valueAnimator = postModeNestHeaderComponent.LLL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            postModeNestHeaderComponent.LLL = null;
            C0SOP c0sop = postModeNestHeaderComponent.LLIZ;
            if (c0sop != null) {
                c0sop.LJI();
            }
            postModeNestHeaderComponent.LLIZ = null;
            C721460SRs c721460SRs = postModeNestHeaderComponent.LLLFF;
            if (c721460SRs != null) {
                c721460SRs.LIZ.setOnNextDownListener(null);
                AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehaviorLIZ = c721460SRs.LIZ();
                if (advancedStopAtOffsetAppBarBehaviorLIZ != null) {
                    advancedStopAtOffsetAppBarBehaviorLIZ.LJIILLIIL = null;
                }
                C0SS4 c0ss4 = (C0SS4) c721460SRs.LJII.getValue();
                ValueAnimator valueAnimator2 = c0ss4.LIZJ;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                c0ss4.LIZJ = null;
                q0.LJJIII(0, c0ss4.LIZ);
                q0.LJJIII(1, c0ss4.LIZ);
                AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehaviorLIZ2 = c721460SRs.LIZ();
                if (advancedStopAtOffsetAppBarBehaviorLIZ2 != null) {
                    advancedStopAtOffsetAppBarBehaviorLIZ2.LJIIZILJ = false;
                    advancedStopAtOffsetAppBarBehaviorLIZ2.LJIJ = true;
                }
                c721460SRs.LIZIZ.LIZLLL(c721460SRs.LJI);
            }
            postModeNestHeaderComponent.LLLFF = null;
            C721490SRv c721490SRv = postModeNestHeaderComponent.LLLF;
            if (c721490SRv != null) {
                c721490SRv.LIZ();
                c721490SRv.LIZ.LIZLLL(c721490SRv.LJ);
            }
            postModeNestHeaderComponent.LLLF = null;
            C721410SRn c721410SRn = postModeNestHeaderComponent.LLJJIJI;
            if (c721410SRn != null) {
                c721410SRn.LIZIZ.recycle();
            }
            ValueAnimator valueAnimator3 = postModeNestHeaderComponent.LLJLLIL;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            postModeNestHeaderComponent.LLJLLIL = null;
            ValueAnimator valueAnimator4 = postModeNestHeaderComponent.LLJZ;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            postModeNestHeaderComponent.LLJZ = null;
            ValueAnimator valueAnimator5 = postModeNestHeaderComponent.LLJLLL;
            if (valueAnimator5 != null) {
                valueAnimator5.cancel();
            }
            postModeNestHeaderComponent.LLJLLL = null;
            ValueAnimator valueAnimator6 = postModeNestHeaderComponent.LLJLL;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
            }
            postModeNestHeaderComponent.LLJLL = null;
            ValueAnimator valueAnimator7 = postModeNestHeaderComponent.LLJZIJLIL;
            if (valueAnimator7 != null) {
                valueAnimator7.cancel();
            }
            postModeNestHeaderComponent.LLJZIJLIL = null;
            postModeNestHeaderComponent.LLZL.removeCallbacksAndMessages(null);
            postModeNestHeaderComponent.LLZILL = null;
            postModeNestHeaderComponent.LLZ = null;
            postModeNestHeaderComponent.LLZIL = null;
        }
        this.LLLF = null;
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final C0SRI ZR() {
        WeakReference<C0SRI> weakReference = this.LLLFFI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2, X.C0SSC
    public final InterfaceC716950SAj getRealPageViewPagerLis() {
        if (this.LLL) {
            return this.LLLF;
        }
        C0SRI c0sriZR = ZR();
        if (c0sriZR != null) {
            return c0sriZR.getRealPageViewPagerLis();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final boolean yS() {
        PostModeDetailParams postModeDetailParams;
        return (this.LLL || (postModeDetailParams = this.LLILZLL) == null || !postModeDetailParams.enableGestureExit) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final void OR() {
        MR();
        C0SU0 c0su0 = this.LLJILJIL;
        if (c0su0 != null) {
            c0su0.LJ(0, this.LLJLIL);
        }
        DR().LLJL.postValue(Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final void PR() {
        C0SS3 c0ss3;
        if (!C0SO2.LIZLLL() || (c0ss3 = this.LLLFF) == null) {
            return;
        }
        c0ss3.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final View WR() {
        C0SRL postModeModel;
        C0SRI c0sriZR = ZR();
        if (c0sriZR == null || (postModeModel = c0sriZR.getPostModeModel()) == null) {
            return null;
        }
        return postModeModel.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final C0SOM bS() {
        C0SRI c0sriZR = ZR();
        View view = c0sriZR != null ? c0sriZR.getView() : null;
        if (!(view instanceof ViewGroup) || view == null) {
            return null;
        }
        return (C0SOM) view.findViewById(R.id.qex);
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0SS3 c0ss3 = this.LLLFF;
        if (c0ss3 != null) {
            c0ss3.LIZIZ = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final void uS() {
        C0SS3 c0ss3;
        C0SRI c0sriZR = ZR();
        C0SRL postModeModel = c0sriZR != null ? c0sriZR.getPostModeModel() : null;
        if (C0SO2.LIZLLL() && postModeModel != null) {
            this.LLLFF = new C0SS3(postModeModel);
            Context context = getContext();
            if (!this.LLL && context != null && C960203pA.LIZIZ(context) && (c0ss3 = this.LLLFF) != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context);
                c0ss3.LIZIZ(numLIZJ != null ? numLIZJ.intValue() : -16777216, false);
            }
        }
        if (!this.LLL || postModeModel == null) {
            return;
        }
        C0SRI c0sriZR2 = ZR();
        this.LLLF = new PostModeNestHeaderComponent(c0sriZR2 != null ? c0sriZR2.getVideoItemParams() : null, (PhotoSharedViewModel) this.LLILLL.getValue(), postModeModel, this.LLLFFI, this.LLLFF);
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final boolean dS() {
        return this.LLL;
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final void SR(CommentContextSource commentContextSource) {
        commentContextSource.setActionFromPage("graphic_full_page");
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final void hS(List<?> list) {
        int itemCount;
        View view;
        View view2;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view3;
        if (this.LLL) {
            if (!list.isEmpty()) {
                C0SU0 c0su0 = this.LLJILJIL;
                if (c0su0 != null && (viewHolderFindViewHolderForAdapterPosition = c0su0.findViewHolderForAdapterPosition(1)) != null && (view3 = viewHolderFindViewHolderForAdapterPosition.itemView) != null && C717490SCl.LIZ(view3)) {
                    DR().LLJILJILJ.setValue(Unit.LIZ);
                    return;
                }
                PostModeNestHeaderComponent postModeNestHeaderComponent = this.LLLF;
                if (postModeNestHeaderComponent == null) {
                    return;
                }
                postModeNestHeaderComponent.LJLI(1);
                return;
            }
            C0SU0 c0su02 = this.LLJILJIL;
            if (c0su02 == null) {
                return;
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = c0su02.findViewHolderForAdapterPosition(1);
            if (viewHolderFindViewHolderForAdapterPosition2 != null && (view2 = viewHolderFindViewHolderForAdapterPosition2.itemView) != null && C717490SCl.LIZ(view2)) {
                DR().LLJILJILJ.setValue(Unit.LIZ);
                return;
            }
            AbstractC21673619ry adapter = c0su02.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount() - 1) < 0) {
                return;
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = c0su02.findViewHolderForAdapterPosition(itemCount);
            if (viewHolderFindViewHolderForAdapterPosition3 != null && (view = viewHolderFindViewHolderForAdapterPosition3.itemView) != null) {
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect) && rect.bottom <= c0su02.getBottom()) {
                    PostModeNestHeaderComponent postModeNestHeaderComponent2 = this.LLLF;
                    if (postModeNestHeaderComponent2 != null) {
                        postModeNestHeaderComponent2.LJLI(0);
                    }
                    DR().LLJILJILJ.setValue(Unit.LIZ);
                    return;
                }
            }
            PostModeNestHeaderComponent postModeNestHeaderComponent3 = this.LLLF;
            if (postModeNestHeaderComponent3 == null) {
                return;
            }
            postModeNestHeaderComponent3.LJLI(itemCount);
            return;
        }
        super.hS(list);
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final void rS(C0SRI c0sri) {
        WeakReference<C0SRI> weakReference;
        if (c0sri != null) {
            weakReference = new WeakReference<>(c0sri);
        } else {
            weakReference = null;
        }
        this.LLLFFI = weakReference;
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2
    public final View cS(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.LLL) {
            View viewLIZIZ = C21146717pB.LIZIZ(layoutInflater.getContext(), R.layout.e9z, viewGroup, false);
            if ((viewLIZIZ instanceof ViewGroup) && viewLIZIZ != null) {
                ViewGroup.LayoutParams layoutParams = viewLIZIZ.findViewById(R.id.t0h).getLayoutParams();
                if ((layoutParams instanceof C16G1) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                }
                viewLIZIZ.findViewById(R.id.t0h).setBackground(null);
            }
            return viewLIZIZ;
        }
        View viewLIZIZ2 = C21146717pB.LIZIZ(layoutInflater.getContext(), R.layout.e9y, viewGroup, false);
        if ((viewLIZIZ2 instanceof ViewGroup) && viewLIZIZ2 != null) {
            int iGS = gS();
            View viewFindViewById = viewLIZIZ2.findViewById(R.id.t0h);
            C786410Ut5.W5(viewFindViewById, new RelativeLayout.LayoutParams(-1, -1));
            viewFindViewById.setBackgroundColor(iGS);
        }
        return viewLIZIZ2;
    }
}
