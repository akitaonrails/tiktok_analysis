package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C01GW;
import X.C0RF0;
import X.C13LE;
import X.C1559260qg8;
import X.C1AF0;
import X.C2217381BqS;
import X.C299590Boj;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C690430R6j;
import X.C690870R8b;
import X.C698200Ra6;
import X.C700100RdA;
import X.C704010RjT;
import X.C723580SZw;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C799570VYd;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.ContentIMConversation;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.IMInfo;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedDMSharedTagAssem extends DynamicComponent<FeedDMSharedTagAssem> {
    public C427870Gq9 LLJZIJLIL;
    public TuxTextView LLL;
    public final C01GW LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(566));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b63;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        User sharer;
        Integer numValueOf;
        String strJ4;
        String nickname;
        StandardBusinessModel standardBusinessModel;
        IMInfo imInfo;
        ContentIMConversation contentIMConversation;
        String strJ42;
        String strJ43;
        StandardBusinessModel standardBusinessModel2;
        IMInfo imInfo2;
        ContentIMConversation contentIMConversation2;
        StandardBusinessModel standardBusinessModel3;
        IMInfo imInfo3;
        ContentModel contentModel = videoItemParams.getAweme().getContentModel();
        if ((contentModel == null || (standardBusinessModel3 = contentModel.standardBusinessModel) == null || (imInfo3 = standardBusinessModel3.getImInfo()) == null || (sharer = imInfo3.user) == null) && (sharer = AwemeBizExtKt.getSharer(videoItemParams.getAweme())) == null) {
            return;
        }
        ContentModel contentModel2 = videoItemParams.getAweme().getContentModel();
        TuxTextView tuxTextView = null;
        if (contentModel2 != null && (standardBusinessModel2 = contentModel2.standardBusinessModel) != null && (imInfo2 = standardBusinessModel2.getImInfo()) != null && (contentIMConversation2 = imInfo2.contentIMConversation) != null) {
            numValueOf = Integer.valueOf(contentIMConversation2.conversationType);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 1) {
                C427870Gq9 c427870Gq9 = this.LLJZIJLIL;
                if (c427870Gq9 == null) {
                    c427870Gq9 = null;
                }
                C786410Ut5.LLLLJI(c427870Gq9, 8);
                TuxTextView tuxTextView2 = this.LLL;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                Context context = getContext();
                if (context != null) {
                    strJ43 = C786410Ut5.j4(context.getString(2131831563), Arrays.copyOf(new Object[]{sharer.getNickname()}, 1));
                } else {
                    strJ43 = null;
                }
                tuxTextView2.setText(strJ43);
                TuxTextView tuxTextView3 = this.LLL;
                if (tuxTextView3 != null) {
                    tuxTextView = tuxTextView3;
                }
                tuxTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                return;
            }
            if (numValueOf.intValue() == 2) {
                ContentModel contentModel3 = videoItemParams.getAweme().getContentModel();
                if (contentModel3 == null || (standardBusinessModel = contentModel3.standardBusinessModel) == null || (imInfo = standardBusinessModel.getImInfo()) == null || (contentIMConversation = imInfo.contentIMConversation) == null) {
                    return;
                }
                C427870Gq9 c427870Gq92 = this.LLJZIJLIL;
                if (c427870Gq92 == null) {
                    c427870Gq92 = null;
                }
                C786410Ut5.LLLLJI(c427870Gq92, 8);
                TuxTextView tuxTextView4 = this.LLL;
                if (tuxTextView4 == null) {
                    tuxTextView4 = null;
                }
                Context context2 = getContext();
                if (context2 != null) {
                    String string = context2.getString(2131832193);
                    C698200Ra6 c698200Ra6 = C698200Ra6.LIZ;
                    strJ42 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{C698200Ra6.LIZLLL(c698200Ra6, sharer.getNickname()), C698200Ra6.LIZLLL(c698200Ra6, contentIMConversation.groupName)}, 2));
                } else {
                    strJ42 = null;
                }
                tuxTextView4.setText(strJ42);
                TuxTextView tuxTextView5 = this.LLL;
                if (tuxTextView5 != null) {
                    tuxTextView = tuxTextView5;
                }
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                return;
            }
        }
        C427870Gq9 c427870Gq93 = this.LLJZIJLIL;
        if (c427870Gq93 == null) {
            c427870Gq93 = null;
        }
        C786410Ut5.LLLLJI(c427870Gq93, 8);
        TuxTextView tuxTextView6 = this.LLL;
        if (tuxTextView6 == null) {
            tuxTextView6 = null;
        }
        Context context3 = getContext();
        if (context3 != null) {
            String string2 = context3.getString(2131831563);
            Object[] objArr = new Object[1];
            User sharer2 = AwemeBizExtKt.getSharer(videoItemParams.getAweme());
            if (sharer2 != null) {
                nickname = sharer2.getNickname();
            } else {
                nickname = null;
            }
            objArr[0] = nickname;
            strJ4 = C786410Ut5.j4(string2, Arrays.copyOf(objArr, 1));
        } else {
            strJ4 = null;
        }
        tuxTextView6.setText(strJ4);
        TuxTextView tuxTextView7 = this.LLL;
        if (tuxTextView7 != null) {
            tuxTextView = tuxTextView7;
        }
        tuxTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        String str;
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            LJJIJL().setTag(C700100RdA.LJIILIIL, "FeedDMSharedTagAssem");
        } else {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS111S0100000_11(this, 82));
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        this.LLJZIJLIL = (C427870Gq9) view.findViewById(R.id.ht8);
        this.LLL = (TuxTextView) view.findViewById(R.id.ht9);
        C427870Gq9 c427870Gq9 = null;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        } else {
            str = null;
        }
        if (C704010RjT.LJ(str)) {
            TuxTextView tuxTextView = this.LLL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C704010RjT.LIZLLL(tuxTextView);
            C427870Gq9 c427870Gq92 = this.LLJZIJLIL;
            if (c427870Gq92 != null) {
                c427870Gq9 = c427870Gq92;
            }
            C704010RjT.LIZ(c427870Gq9);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0NzF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(9), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
