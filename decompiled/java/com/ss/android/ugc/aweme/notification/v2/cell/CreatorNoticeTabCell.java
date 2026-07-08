package com.ss.android.ugc.aweme.notification.v2.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1308910kAL;
import X.C13LE;
import X.C1618770sE7;
import X.C1900930zZD;
import X.C1900940zZE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C890300YwG;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS162S0100000_28;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class CreatorNoticeTabCell extends PowerCell<C1900930zZD> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public TuxTextView LL;
    public final AssemVMLazy LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CreatorNoticeTabCell.class, "notificationViewModel", "getNotificationViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/NotificationFragmentV2ViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CreatorNoticeTabCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NotificationFragmentV2ViewModel.class);
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(c19719912DlLIZ, 391);
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(181);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS572S0100000_28(c19719912DlLIZ, 376), awS572S0100000_28, AFwS217S0000000_28.get$arr$(297), new AwS572S0100000_28((C03K6) this, 377), new AwS572S0100000_28((C03K6) this, 379), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 381), aFwS271S0000000_28, new AwS572S0100000_28((C03K6) this, 383), null, new AwS572S0100000_28((C03K6) this, 384));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS572S0100000_28 awS572S0100000_282 = new AwS572S0100000_28((C03K6) this, 378);
            AwS572S0100000_28 awS572S0100000_283 = new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 380);
            AwS572S0100000_28 awS572S0100000_284 = new AwS572S0100000_28(c19719912DlLIZ, 382);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS429S0200000_28((InterfaceC451590HnJ) obj, awS572S0100000_282, 41));
            AwS572S0100000_28 awS572S0100000_285 = new AwS572S0100000_28(c01gwLIZIZ, 385);
            AwS572S0100000_28 awS572S0100000_286 = new AwS572S0100000_28(c01gwLIZIZ, 386);
            AwS572S0100000_28 awS572S0100000_287 = new AwS572S0100000_28(c01gwLIZIZ, 387);
            AwS572S0100000_28 awS572S0100000_288 = new AwS572S0100000_28(c01gwLIZIZ, 388);
            AwS572S0100000_28 awS572S0100000_289 = new AwS572S0100000_28(c01gwLIZIZ, 389);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS572S0100000_284, awS572S0100000_28, new C452080Ho6(), awS572S0100000_285, awS572S0100000_286, awS572S0100000_283, aFwS271S0000000_28, awS572S0100000_287, awS572S0100000_288, awS572S0100000_289);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS572S0100000_28(c19719912DlLIZ, 390), awS572S0100000_28, AFwS217S0000000_28.get$arr$(298), new AwS572S0100000_28((C03K6) this, 392), new AwS572S0100000_28((C03K6) this, 393), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 394), aFwS271S0000000_28, new AwS572S0100000_28((C03K6) this, 395), null, new AwS572S0100000_28((C03K6) this, 396));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS572S0100000_28(c19719912DlLIZ, 397), awS572S0100000_28, AFwS217S0000000_28.get$arr$(299), new AwS572S0100000_28((C03K6) this, 398), new AwS572S0100000_28((C03K6) this, 399), new AwS572S0100000_28((C03K6) this, 400), aFwS271S0000000_28, null, null, new AwS572S0100000_28((C03K6) this, 401));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    public final int I5() {
        Integer numLIZJ;
        Integer numLIZJ2;
        C1900930zZD item = getItem();
        if (item == null || !item.LLILLJJLI) {
            Context context = getContext();
            if (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) == null) {
                return 0;
            }
            return numLIZJ.intValue();
        }
        Context context2 = getContext();
        if (context2 == null || (numLIZJ2 = C1308910kAL.LIZJ(R.attr.bj, context2)) == null) {
            return 0;
        }
        return numLIZJ2.intValue();
    }

    public static String L5(NoticeTabModel noticeTabModel) {
        int i;
        if (!noticeTabModel.isAllTab && !C890300YwG.LIZIZ.LIZJ(true) && (i = noticeTabModel.unReadCount) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(noticeTabModel.tabName);
            sbLIZ.append(' ');
            sbLIZ.append(C1618770sE7.LJIIIZ(i));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        String str = noticeTabModel.tabName;
        if (str != null) {
            return str;
        }
        return "";
    }

    public final void N5(NoticeTabModel noticeTabModel) {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView == null) {
            return;
        }
        CharSequence text = tuxTextView.getText();
        if (text != null && text.length() != 0) {
            if (Intrinsics.LJFF(tuxTextView.getText().toString(), L5(noticeTabModel))) {
                return;
            }
            final int width = tuxTextView.getWidth();
            final String strL5 = L5(noticeTabModel);
            final float fMeasureText = tuxTextView.getPaint().measureText(strL5) + tuxTextView.getPaddingStart() + tuxTextView.getPaddingEnd();
            int i = (int) fMeasureText;
            if (width != i) {
                final TuxTextView tuxTextView2 = this.LL;
                if (tuxTextView2 != null) {
                    ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(tuxTextView2, "width", width, i);
                    objectAnimatorOfInt.setDuration(200L);
                    objectAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.0GY7
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            if (fMeasureText > width) {
                                tuxTextView2.setText(strL5);
                            }
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            if (fMeasureText <= width) {
                                tuxTextView2.setText(strL5);
                            }
                        }
                    });
                    C786410Ut5.Pd(objectAnimatorOfInt);
                    return;
                }
                return;
            }
            tuxTextView.setText(strL5);
            return;
        }
        tuxTextView.setText(L5(noticeTabModel));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C1900930zZD c1900930zZD = (C1900930zZD) interfaceC1891350zJl;
        super.onBindItemView(c1900930zZD);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(L5(c1900930zZD.LL));
        }
        TuxTextView tuxTextView2 = this.LL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColor(I5());
        }
        TuxTextView tuxTextView3 = this.LL;
        if (tuxTextView3 != null) {
            C1900930zZD item = getItem();
            if (item != null && item.LLILLJJLI) {
                i = R.drawable.ai9;
            } else {
                i = R.drawable.ahd;
            }
            tuxTextView3.setBackgroundResource(i);
        }
        N5(c1900930zZD.LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(8388611);
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
        tuxTextView.setTuxFont(62);
        C786410Ut5.h9(tuxTextView, new ACListenerS162S0100000_28(this, 66));
        this.LL = tuxTextView;
        return tuxTextView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1900940zZE c1900940zZE;
        int i;
        C1900930zZD c1900930zZD = (C1900930zZD) interfaceC1891350zJl;
        super.onBindItemView(c1900930zZD, list);
        if (!list.isEmpty()) {
            Object obj = ListProtector.get(list, 0);
            if ((obj instanceof C1900940zZE) && (c1900940zZE = (C1900940zZE) obj) != null) {
                if (c1900940zZE.LIZ) {
                    TuxTextView tuxTextView = this.LL;
                    if (tuxTextView != null) {
                        tuxTextView.setTextColor(I5());
                    }
                    TuxTextView tuxTextView2 = this.LL;
                    if (tuxTextView2 != null) {
                        C1900930zZD item = getItem();
                        if (item != null && item.LLILLJJLI) {
                            i = R.drawable.ai9;
                        } else {
                            i = R.drawable.ahd;
                        }
                        tuxTextView2.setBackgroundResource(i);
                    }
                }
                if (c1900940zZE.LIZIZ) {
                    TuxTextView tuxTextView3 = this.LL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(L5(c1900930zZD.LL));
                    }
                    N5(c1900930zZD.LL);
                }
            }
        }
    }
}
