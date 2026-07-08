package com.ss.android.ugc.aweme.commentv2.title;

import X.C01GW;
import X.C0BSN;
import X.C0QSJ;
import X.C1350470lFN;
import X.C1350500lFQ;
import X.C13LE;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C19EG;
import X.C20673215v0;
import X.C2189821An6;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C718860SHs;
import X.C733302tf;
import X.C786410Ut5;
import X.C946803n0;
import X.EnumC1349720lEA;
import X.InterfaceC1146704e9;
import X.InterfaceC1349690lE7;
import X.InterfaceC1354310lLZ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.headeranchor.common.component.CommonTopBarView;
import com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentTopBarAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarContainer;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarIcon;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarPadding;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarText;
import com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS485S0200000_21;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TitlePanelSearchWordAssem extends UISlotAssem implements InterfaceC1354310lLZ, ICommentTopBarAbility, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 96));
    public CommentTopBarComponent LLJJIII;
    public CommonTopBarView LLJJIJI;
    public volatile InterfaceC1349690lE7 LLJJIJIIJIL;
    public InterfaceC665370Q7z LLJJIJIL;
    public C0QSJ LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TitlePanelSearchWordAssem.class, "sheetAbility", "getSheetAbility()Lcom/ss/android/ugc/aweme/feed/title/TitlePanelSheetAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a54;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentTopBarAbility
    public final void bf1(int i, String str, Aweme aweme, CommentTopBarText commentTopBarText, CommentTopBarText commentTopBarText2, CommentTopBarText commentTopBarText3, CommentTopBarText commentTopBarText4, CommentTopBarText commentTopBarText5, CommentTopBarText commentTopBarText6, CommentTopBarText commentTopBarText7) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return false;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TitlePanelRootScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TitlePanelRootScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1354310lLZ
    public final void lM(EnumC1349720lEA enumC1349720lEA) {
    }

    public final CommentContextSource ip() {
        return (CommentContextSource) this.LLJJI.getValue();
    }

    @Override // X.InterfaceC1354310lLZ
    public final void onShow() {
        CommentTopBarComponent commentTopBarComponent;
        C718860SHs.LIZ.getClass();
        if (C0BSN.LIZ && (commentTopBarComponent = this.LLJJIII) != null) {
            C1350500lFQ c1350500lFQ = C1350500lFQ.LIZ;
            Fragment fragmentHp = hp();
            C19EG activity = fragmentHp != null ? fragmentHp.getActivity() : null;
            Fragment fragmentHp2 = hp();
            CommentContextSource commentContextSourceIp = ip();
            Aweme aweme = commentContextSourceIp != null ? CommentContextSourceKt.aweme(commentContextSourceIp) : null;
            CommentContextSource commentContextSourceIp2 = ip();
            c1350500lFQ.getClass();
            C1350500lFQ.LJI(activity, fragmentHp2, commentTopBarComponent, aweme, commentContextSourceIp2);
        }
    }

    public final Fragment hp() {
        return C946803n0.LIZ(getContentView());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onParentSet() {
        /*
            r5 = this;
            super.onParentSet()
            androidx.fragment.app.Fragment r1 = X.C724240Sb0.LJI(r5)
            r0 = 0
            if (r1 == 0) goto L1f
            X.0Q7z r3 = X.C1345700l7g.LJIJJLI(r1)
            if (r3 == 0) goto L1f
            java.lang.Class<com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentTopBarAbility> r2 = com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentTopBarAbility.class
            androidx.fragment.app.Fragment r1 = X.C724240Sb0.LJI(r5)
            if (r1 == 0) goto L25
            androidx.lifecycle.LifecycleOwner r1 = r1.getViewLifecycleOwner()
        L1c:
            X.C1558520qew.LJII(r3, r5, r2, r0, r1)
        L1f:
            X.0lE7 r1 = r5.LLJJIJIIJIL
            if (r1 != 0) goto L5c
            monitor-enter(r5)
            goto L27
        L25:
            r1 = r0
            goto L1c
        L27:
            X.0lE7 r1 = r5.LLJJIJIIJIL     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L5b
            X.0QSJ r1 = r5.LLJJJ     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L49
            X.0Q7z r4 = r5.LLJJIJIL     // Catch: java.lang.Throwable -> L58
            if (r4 != 0) goto L39
            X.0Q7z r4 = X.C687700QyG.LJIIIZ(r5)     // Catch: java.lang.Throwable -> L58
            r5.LLJJIJIL = r4     // Catch: java.lang.Throwable -> L58
        L39:
            r1 = 1
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L58
            java.lang.Class<com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope> r2 = com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope.class
            r1 = 0
            r3[r1] = r2     // Catch: java.lang.Throwable -> L58
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r4, r3)     // Catch: java.lang.Throwable -> L58
            r5.LLJJJ = r1     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L51
        L49:
            java.lang.Class<X.0lE7> r0 = X.InterfaceC1349690lE7.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L58
            X.0lE7 r0 = (X.InterfaceC1349690lE7) r0     // Catch: java.lang.Throwable -> L58
        L51:
            r5.LLJJIJIIJIL = r0     // Catch: java.lang.Throwable -> L58
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L58
            r1 = r0
            if (r0 == 0) goto L5f
            goto L5c
        L58:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L5b:
            monitor-exit(r5)
        L5c:
            r1.d9(r5)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitlePanelSearchWordAssem.onParentSet():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C19EG activity;
        Aweme aweme;
        String strEventType;
        C2189821An6 c2189821An6;
        Integer num;
        Aweme aweme2;
        C19EG activity2;
        boolean zBooleanValue;
        C19EG activity3;
        ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL;
        Aweme aweme3;
        Drawable drawableMapLocalIconDrawable;
        ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL2;
        CommonTopBarView commonTopBarView;
        CommentTopBarContainer commentTopBarContainer;
        CommentCommonModel commonModel;
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, getContentView());
        C718860SHs.LIZ.getClass();
        Aweme aweme4 = null;
        if (C0BSN.LIZ) {
            C1350470lFN c1350470lFN = C1350470lFN.LIZ;
            Fragment fragmentHp = hp();
            if (fragmentHp != null) {
                activity = fragmentHp.getActivity();
            } else {
                activity = null;
            }
            CommentContextSource commentContextSourceIp = ip();
            if (commentContextSourceIp != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceIp);
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceIp2 = ip();
            if (commentContextSourceIp2 != null) {
                strEventType = CommentContextSourceKt.eventType(commentContextSourceIp2);
            } else {
                strEventType = null;
            }
            CommentContextSource commentContextSourceIp3 = ip();
            if (commentContextSourceIp3 != null && (commonModel = commentContextSourceIp3.getCommonModel()) != null) {
                c2189821An6 = commonModel.feedParam;
            } else {
                c2189821An6 = null;
            }
            CommentTopBarComponent commentTopBarComponentLJFF = C1350470lFN.LJFF(c1350470lFN, activity, aweme, strEventType, c2189821An6, true, 16);
            if (commentTopBarComponentLJFF != null) {
                num = commentTopBarComponentLJFF.bizType;
            } else {
                num = null;
            }
            CommentContextSource commentContextSourceIp4 = ip();
            if (commentContextSourceIp4 != null) {
                aweme2 = CommentContextSourceKt.aweme(commentContextSourceIp4);
            } else {
                aweme2 = null;
            }
            CommentTopBarComponent commentTopBarComponentLJIIIZ = C1350470lFN.LJIIIZ(aweme2, num, true);
            if (commentTopBarComponentLJIIIZ != null) {
                this.LLJJIII = commentTopBarComponentLJIIIZ;
                C733302tf.LIZJ(commentTopBarComponentLJIIIZ);
                CommentTopBarComponent commentTopBarComponent = this.LLJJIII;
                if (commentTopBarComponent != null && (commentTopBarContainer = commentTopBarComponent.container) != null) {
                    commentTopBarContainer.setHeight(34);
                    CommentTopBarPadding commentTopBarPadding = commentTopBarContainer.padding;
                    if (commentTopBarPadding != null) {
                        commentTopBarPadding.setTop(16);
                    }
                    CommentTopBarPadding commentTopBarPadding2 = commentTopBarContainer.padding;
                    if (commentTopBarPadding2 != null) {
                        commentTopBarPadding2.setLeft(16);
                    }
                }
                if (this.LLJJIJI == null && getContentView() != null) {
                    if (C20673215v0.LJFF(getContentView().getContext(), getContentView().getContext(), R.layout.agv, (ViewGroup) getContentView(), true) == null) {
                        C786410Ut5.Sd(R.layout.agv, C786410Ut5.ne(getContentView().getContext()), (ViewGroup) getContentView());
                    }
                    View contentView = getContentView();
                    if (contentView != null) {
                        commonTopBarView = (CommonTopBarView) contentView.findViewById(R.id.eel);
                    } else {
                        commonTopBarView = null;
                    }
                    this.LLJJIJI = commonTopBarView;
                }
            }
            CommentTopBarComponent commentTopBarComponent2 = this.LLJJIII;
            if (commentTopBarComponent2 != null) {
                C1350500lFQ c1350500lFQ = C1350500lFQ.LIZ;
                Fragment fragmentHp2 = hp();
                if (fragmentHp2 != null) {
                    activity2 = fragmentHp2.getActivity();
                } else {
                    activity2 = null;
                }
                Fragment fragmentHp3 = hp();
                Aweme aweme5 = CommentContextSourceKt.aweme(ip());
                CommentContextSource commentContextSourceIp5 = ip();
                c1350500lFQ.getClass();
                Boolean boolLJII = C1350500lFQ.LJII(activity2, fragmentHp3, commentTopBarComponent2, aweme5, commentContextSourceIp5);
                if (boolLJII != null) {
                    zBooleanValue = boolLJII.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                for (CommentTopBarIcon commentTopBarIcon : C1697810uHb.LJIIJJI(commentTopBarComponent2.icon, commentTopBarComponent2.tailIcon)) {
                    if (commentTopBarIcon != null && Intrinsics.LJFF(commentTopBarIcon.isLocal(), Boolean.TRUE) && commentTopBarIcon.localType != null) {
                        C1350500lFQ c1350500lFQ2 = C1350500lFQ.LIZ;
                        Context context = getContentView().getContext();
                        Integer num2 = commentTopBarIcon.localType;
                        CommentContextSource commentContextSourceIp6 = ip();
                        if (commentContextSourceIp6 != null) {
                            aweme3 = CommentContextSourceKt.aweme(commentContextSourceIp6);
                        } else {
                            aweme3 = null;
                        }
                        CommentContextSource commentContextSourceIp7 = ip();
                        c1350500lFQ2.getClass();
                        Integer num3 = commentTopBarComponent2.bizType;
                        if (num3 != null && (iCommentTopBarImplementServiceLIZLLL2 = C1350500lFQ.LIZLLL(num3.intValue())) != null) {
                            drawableMapLocalIconDrawable = iCommentTopBarImplementServiceLIZLLL2.mapLocalIconDrawable(context, num2, commentTopBarComponent2, aweme3, commentContextSourceIp7);
                        } else {
                            drawableMapLocalIconDrawable = null;
                        }
                        commentTopBarIcon.setLocalResDrawable(drawableMapLocalIconDrawable);
                    }
                }
                C1350500lFQ c1350500lFQ3 = C1350500lFQ.LIZ;
                Fragment fragmentHp4 = hp();
                if (fragmentHp4 != null) {
                    activity3 = fragmentHp4.getActivity();
                } else {
                    activity3 = null;
                }
                Fragment fragmentHp5 = hp();
                CommentContextSource commentContextSourceIp8 = ip();
                if (commentContextSourceIp8 != null) {
                    aweme4 = CommentContextSourceKt.aweme(commentContextSourceIp8);
                }
                CommentContextSource commentContextSourceIp9 = ip();
                c1350500lFQ3.getClass();
                Integer num4 = commentTopBarComponent2.bizType;
                if (num4 != null && (iCommentTopBarImplementServiceLIZLLL = C1350500lFQ.LIZLLL(num4.intValue())) != null) {
                    iCommentTopBarImplementServiceLIZLLL.onBindComponentView(activity3, fragmentHp5, commentTopBarComponent2, aweme4, commentContextSourceIp9);
                }
                C786410Ut5.LJLLLLLL(0, getContentView());
                CommonTopBarView commonTopBarView2 = this.LLJJIJI;
                if (commonTopBarView2 != null) {
                    commonTopBarView2.LIZ(commentTopBarComponent2, zBooleanValue, new AwS485S0200000_21(commentTopBarComponent2, this, 7));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentTopBarAbility
    public final void uh2(int i, String str) {
        C19EG activity;
        Aweme aweme;
        Aweme aweme2;
        String aid;
        CommentTopBarComponent commentTopBarComponent = this.LLJJIII;
        if (commentTopBarComponent != null) {
            C1350470lFN c1350470lFN = C1350470lFN.LIZ;
            Fragment fragmentHp = hp();
            if (fragmentHp != null) {
                activity = fragmentHp.getActivity();
            } else {
                activity = null;
            }
            CommentContextSource commentContextSourceIp = ip();
            if (commentContextSourceIp != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceIp);
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceIp2 = ip();
            c1350470lFN.getClass();
            if (C1350470lFN.LIZIZ(activity, aweme, commentContextSourceIp2, commentTopBarComponent, true) != 0) {
                CommentContextSource commentContextSourceIp3 = ip();
                if (commentContextSourceIp3 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceIp3)) != null && (aid = aweme2.getAid()) != null) {
                    C1350470lFN.LIZLLL.remove(aid);
                    C1350470lFN.LJ.remove(aid);
                }
                View contentView = getContentView();
                if (contentView != null) {
                    C786410Ut5.LJLLLLLL(8, contentView);
                }
                CommonTopBarView commonTopBarView = this.LLJJIJI;
                if (commonTopBarView != null) {
                    int visibility = commonTopBarView.getVisibility();
                    commonTopBarView.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, commonTopBarView);
                }
                this.LLJJIJI = null;
                this.LLJJIII = null;
            }
        }
    }
}
