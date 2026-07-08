package com.ss.android.ugc.aweme.commentv2.headeranchor.common.component;

import X.AbstractViewOnClickListenerC372950Ejl;
import X.C03D4;
import X.C03EV;
import X.C03EX;
import X.C123100dR;
import X.C1602160rnK;
import X.C1848410yCV;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C427690Gpr;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import Y.ATListenerS437S0100000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import avg.f;
import com.ss.android.ugc.aweme.feed.model.ClickHotAreaType;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarAction;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarIcon;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarText;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonTopBarView extends FrameLayout {
    public final View LL;
    public final C03D4 LLILLJJLI;
    public final C03D4 LLILLL;
    public final C03D4 LLILZ;
    public final C03D4 LLILZIL;
    public final C03D4 LLILZLL;
    public final C03D4 LLIZ;
    public final ViewGroup LLIZLLLIL;
    public final C03EX LLJ;
    public final C03EV LLJI;
    public final C03EX LLJIJIL;
    public final C03D4 LLJILJIL;
    public final View LLJILJILJ;

    public CommonTopBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setContainer(com.ss.android.ugc.aweme.feed.model.CommentTopBarContainer r10) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.headeranchor.common.component.CommonTopBarView.setContainer(com.ss.android.ugc.aweme.feed.model.CommentTopBarContainer):void");
    }

    private final void setIcon(CommentTopBarIcon commentTopBarIcon) {
        C03EX c03ex = this.LLJ;
        if (c03ex != null) {
            int visibility = c03ex.getVisibility();
            c03ex.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c03ex);
        }
        if (commentTopBarIcon == null || this.LLJ == null) {
            return;
        }
        Boolean boolIsLocal = commentTopBarIcon.isLocal();
        Boolean bool = Boolean.TRUE;
        if ((Intrinsics.LJFF(boolIsLocal, bool) && commentTopBarIcon.localType != null) || (!Intrinsics.LJFF(commentTopBarIcon.isLocal(), bool) && commentTopBarIcon.iconUrl != null)) {
            C03EX c03ex2 = this.LLJ;
            if (c03ex2 != null) {
                c03ex2.LIZ(commentTopBarIcon);
            }
            C03EX c03ex3 = this.LLJ;
            if (c03ex3 != null) {
                int visibility2 = c03ex3.getVisibility();
                c03ex3.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, c03ex3);
            }
        }
    }

    public CommonTopBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        View viewSd = C786410Ut5.Sd(R.layout.agx, C786410Ut5.ne(context), this);
        this.LLJI = (C03EV) viewSd.findViewById(R.id.y9p);
        this.LLJ = (C03EX) viewSd.findViewById(R.id.nwl);
        this.LL = viewSd.findViewById(R.id.uh2);
        this.LLILLJJLI = (C03D4) viewSd.findViewById(R.id.eei);
        this.LLILLL = (C03D4) viewSd.findViewById(R.id.eej);
        this.LLILZ = (C03D4) viewSd.findViewById(R.id.eek);
        this.LLILZIL = (C03D4) viewSd.findViewById(R.id.eee);
        this.LLILZLL = (C03D4) viewSd.findViewById(R.id.eeg);
        this.LLIZ = (C03D4) viewSd.findViewById(R.id.eef);
        this.LLIZLLLIL = (ViewGroup) viewSd.findViewById(R.id.eed);
        this.LLJIJIL = (C03EX) viewSd.findViewById(R.id.x2v);
        this.LLJILJIL = (C03D4) viewSd.findViewById(R.id.eec);
        this.LLJILJILJ = viewSd.findViewById(R.id.eeh);
    }

    public final void LIZ(CommentTopBarComponent commentTopBarComponent, boolean z, final InterfaceC1631620sYq<? super View, ? super Integer, ? super MotionEvent, Boolean> interfaceC1631620sYq) {
        ViewGroup viewGroup;
        setContainer(commentTopBarComponent.container);
        setIcon(commentTopBarComponent.icon);
        LIZJ(commentTopBarComponent.title, commentTopBarComponent.titleSeparator, commentTopBarComponent.titlePrefix);
        LIZIZ(commentTopBarComponent.descPrefix, commentTopBarComponent.descSuffix, commentTopBarComponent.separator, commentTopBarComponent.tailIcon, commentTopBarComponent.descTail);
        CommentTopBarAction commentTopBarAction = commentTopBarComponent.action;
        C03EV c03ev = this.LLJI;
        if (c03ev != null) {
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c03ev);
            }
            c03ev.setOnClickListener(null);
        }
        C03EV c03ev2 = this.LLJI;
        if (c03ev2 != null) {
            c03ev2.setOnLongClickListener(null);
        }
        C03EV c03ev3 = this.LLJI;
        if (c03ev3 != null) {
            c03ev3.setOnTouchListener(null);
        }
        ViewGroup viewGroup2 = this.LLIZLLLIL;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, null);
        }
        ViewGroup viewGroup3 = this.LLIZLLLIL;
        if (viewGroup3 != null) {
            viewGroup3.setOnLongClickListener(null);
        }
        ViewGroup viewGroup4 = this.LLIZLLLIL;
        if (viewGroup4 != null) {
            viewGroup4.setOnTouchListener(null);
        }
        View.OnClickListener fVar = new View.OnClickListener() { // from class: X.03EW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
        if (C1848410yCV.LIZ) {
            fVar = new f(fVar);
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        setOnLongClickListener(null);
        setOnTouchListener(null);
        if (commentTopBarAction != null) {
            Integer num = commentTopBarAction.clickHotAreaType;
            int iOrdinal = ClickHotAreaType.MACH_CONTAINER.ordinal();
            if (num != null && num.intValue() == iOrdinal) {
                final int i = 0;
                C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl(interfaceC1631620sYq, i) { // from class: X.04JE
                    public final int $t;
                    public Object l0;

                    @Override // X.AbstractViewOnClickListenerC372950Ejl
                    public final void LIZ(View view) {
                        switch (this.$t) {
                            case 0:
                                LIZ$0(this, view);
                                break;
                            case 1:
                                LIZ$1(this, view);
                                break;
                            case 2:
                                LIZ$2(this, view);
                                break;
                            default:
                                super.LIZ(view);
                                break;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(700L);
                        this.$t = i;
                        this.l0 = interfaceC1631620sYq;
                    }

                    public static final void LIZ$0(C04JE c04je, View view) {
                        InterfaceC1631620sYq interfaceC1631620sYq2;
                        if (view != null && (interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04je.l0) != null) {
                            interfaceC1631620sYq2.invoke(view, 1, null);
                        }
                    }

                    public static final void LIZ$1(C04JE c04je, View view) {
                        InterfaceC1631620sYq interfaceC1631620sYq2;
                        if (view != null && (interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04je.l0) != null) {
                            interfaceC1631620sYq2.invoke(view, 1, null);
                        }
                    }

                    public static final void LIZ$2(C04JE c04je, View view) {
                        InterfaceC1631620sYq interfaceC1631620sYq2;
                        if (view != null && (interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04je.l0) != null) {
                            interfaceC1631620sYq2.invoke(view, 1, null);
                        }
                    }
                }, this);
                final int i2 = 0;
                setOnLongClickListener(new View.OnLongClickListener(interfaceC1631620sYq, i2) { // from class: X.04JM
                    public final int $t;
                    public Object l0;

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        switch (this.$t) {
                            case 0:
                                return onLongClick$0(this, view);
                            case 1:
                                return onLongClick$1(this, view);
                            case 2:
                                return onLongClick$2(this, view);
                            default:
                                return false;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.$t = i2;
                        this.l0 = interfaceC1631620sYq;
                    }

                    public static final boolean onLongClick$0(C04JM c04jm, View view) {
                        InterfaceC1631620sYq interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04jm.l0;
                        if (interfaceC1631620sYq2 != null) {
                            return ((Boolean) interfaceC1631620sYq2.invoke(view, 2, null)).booleanValue();
                        }
                        return false;
                    }

                    public static final boolean onLongClick$1(C04JM c04jm, View view) {
                        InterfaceC1631620sYq interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04jm.l0;
                        if (interfaceC1631620sYq2 != null) {
                            return ((Boolean) interfaceC1631620sYq2.invoke(view, 2, null)).booleanValue();
                        }
                        return false;
                    }

                    public static final boolean onLongClick$2(C04JM c04jm, View view) {
                        InterfaceC1631620sYq interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04jm.l0;
                        if (interfaceC1631620sYq2 != null) {
                            return ((Boolean) interfaceC1631620sYq2.invoke(view, 2, null)).booleanValue();
                        }
                        return false;
                    }
                });
                setOnTouchListener(new ATListenerS437S0100000_1(interfaceC1631620sYq, 9));
            }
        }
        C03EV c03ev4 = this.LLJI;
        if (c03ev4 != null) {
            final int i3 = 1;
            C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl(interfaceC1631620sYq, i3) { // from class: X.04JE
                public final int $t;
                public Object l0;

                @Override // X.AbstractViewOnClickListenerC372950Ejl
                public final void LIZ(View view) {
                    switch (this.$t) {
                        case 0:
                            LIZ$0(this, view);
                            break;
                        case 1:
                            LIZ$1(this, view);
                            break;
                        case 2:
                            LIZ$2(this, view);
                            break;
                        default:
                            super.LIZ(view);
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(700L);
                    this.$t = i3;
                    this.l0 = interfaceC1631620sYq;
                }

                public static final void LIZ$0(C04JE c04je, View view) {
                    InterfaceC1631620sYq interfaceC1631620sYq2;
                    if (view != null && (interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04je.l0) != null) {
                        interfaceC1631620sYq2.invoke(view, 1, null);
                    }
                }

                public static final void LIZ$1(C04JE c04je, View view) {
                    InterfaceC1631620sYq interfaceC1631620sYq2;
                    if (view != null && (interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04je.l0) != null) {
                        interfaceC1631620sYq2.invoke(view, 1, null);
                    }
                }

                public static final void LIZ$2(C04JE c04je, View view) {
                    InterfaceC1631620sYq interfaceC1631620sYq2;
                    if (view != null && (interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04je.l0) != null) {
                        interfaceC1631620sYq2.invoke(view, 1, null);
                    }
                }
            }, c03ev4);
        }
        C03EV c03ev5 = this.LLJI;
        if (c03ev5 != null) {
            final int i4 = 1;
            c03ev5.setOnLongClickListener(new View.OnLongClickListener(interfaceC1631620sYq, i4) { // from class: X.04JM
                public final int $t;
                public Object l0;

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    switch (this.$t) {
                        case 0:
                            return onLongClick$0(this, view);
                        case 1:
                            return onLongClick$1(this, view);
                        case 2:
                            return onLongClick$2(this, view);
                        default:
                            return false;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.$t = i4;
                    this.l0 = interfaceC1631620sYq;
                }

                public static final boolean onLongClick$0(C04JM c04jm, View view) {
                    InterfaceC1631620sYq interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04jm.l0;
                    if (interfaceC1631620sYq2 != null) {
                        return ((Boolean) interfaceC1631620sYq2.invoke(view, 2, null)).booleanValue();
                    }
                    return false;
                }

                public static final boolean onLongClick$1(C04JM c04jm, View view) {
                    InterfaceC1631620sYq interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04jm.l0;
                    if (interfaceC1631620sYq2 != null) {
                        return ((Boolean) interfaceC1631620sYq2.invoke(view, 2, null)).booleanValue();
                    }
                    return false;
                }

                public static final boolean onLongClick$2(C04JM c04jm, View view) {
                    InterfaceC1631620sYq interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04jm.l0;
                    if (interfaceC1631620sYq2 != null) {
                        return ((Boolean) interfaceC1631620sYq2.invoke(view, 2, null)).booleanValue();
                    }
                    return false;
                }
            });
        }
        C03EV c03ev6 = this.LLJI;
        if (c03ev6 != null) {
            c03ev6.setOnTouchListener(new ATListenerS437S0100000_1(interfaceC1631620sYq, 10));
        }
        ViewGroup viewGroup5 = this.LLIZLLLIL;
        if (viewGroup5 != null) {
            final int i5 = 2;
            C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl(interfaceC1631620sYq, i5) { // from class: X.04JE
                public final int $t;
                public Object l0;

                @Override // X.AbstractViewOnClickListenerC372950Ejl
                public final void LIZ(View view) {
                    switch (this.$t) {
                        case 0:
                            LIZ$0(this, view);
                            break;
                        case 1:
                            LIZ$1(this, view);
                            break;
                        case 2:
                            LIZ$2(this, view);
                            break;
                        default:
                            super.LIZ(view);
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(700L);
                    this.$t = i5;
                    this.l0 = interfaceC1631620sYq;
                }

                public static final void LIZ$0(C04JE c04je, View view) {
                    InterfaceC1631620sYq interfaceC1631620sYq2;
                    if (view != null && (interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04je.l0) != null) {
                        interfaceC1631620sYq2.invoke(view, 1, null);
                    }
                }

                public static final void LIZ$1(C04JE c04je, View view) {
                    InterfaceC1631620sYq interfaceC1631620sYq2;
                    if (view != null && (interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04je.l0) != null) {
                        interfaceC1631620sYq2.invoke(view, 1, null);
                    }
                }

                public static final void LIZ$2(C04JE c04je, View view) {
                    InterfaceC1631620sYq interfaceC1631620sYq2;
                    if (view != null && (interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04je.l0) != null) {
                        interfaceC1631620sYq2.invoke(view, 1, null);
                    }
                }
            }, viewGroup5);
        }
        ViewGroup viewGroup6 = this.LLIZLLLIL;
        if (viewGroup6 != null) {
            final int i6 = 2;
            viewGroup6.setOnLongClickListener(new View.OnLongClickListener(interfaceC1631620sYq, i6) { // from class: X.04JM
                public final int $t;
                public Object l0;

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    switch (this.$t) {
                        case 0:
                            return onLongClick$0(this, view);
                        case 1:
                            return onLongClick$1(this, view);
                        case 2:
                            return onLongClick$2(this, view);
                        default:
                            return false;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.$t = i6;
                    this.l0 = interfaceC1631620sYq;
                }

                public static final boolean onLongClick$0(C04JM c04jm, View view) {
                    InterfaceC1631620sYq interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04jm.l0;
                    if (interfaceC1631620sYq2 != null) {
                        return ((Boolean) interfaceC1631620sYq2.invoke(view, 2, null)).booleanValue();
                    }
                    return false;
                }

                public static final boolean onLongClick$1(C04JM c04jm, View view) {
                    InterfaceC1631620sYq interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04jm.l0;
                    if (interfaceC1631620sYq2 != null) {
                        return ((Boolean) interfaceC1631620sYq2.invoke(view, 2, null)).booleanValue();
                    }
                    return false;
                }

                public static final boolean onLongClick$2(C04JM c04jm, View view) {
                    InterfaceC1631620sYq interfaceC1631620sYq2 = (InterfaceC1631620sYq) c04jm.l0;
                    if (interfaceC1631620sYq2 != null) {
                        return ((Boolean) interfaceC1631620sYq2.invoke(view, 2, null)).booleanValue();
                    }
                    return false;
                }
            });
        }
        if (z && (viewGroup = this.LLIZLLLIL) != null) {
            C427690Gpr.LJI(viewGroup, new AwS615S0100000_1(interfaceC1631620sYq, (InterfaceC1631620sYq<? super View, ? super Integer, ? super MotionEvent, Boolean>) 355));
        }
    }

    public final void LIZJ(CommentTopBarText commentTopBarText, CommentTopBarText commentTopBarText2, CommentTopBarText commentTopBarText3) {
        C03D4 c03d4 = this.LLILLJJLI;
        if (c03d4 != null) {
            C786410Ut5.A(c03d4, 8);
        }
        if (commentTopBarText != null && C123100dR.LIZ(commentTopBarText.content)) {
            C03D4 c03d42 = this.LLILLJJLI;
            if (c03d42 != null) {
                C786410Ut5.A(c03d42, 0);
            }
            C03D4 c03d43 = this.LLILLJJLI;
            if (c03d43 != null) {
                c03d43.LJJJJJ(commentTopBarText);
            }
        }
        C03D4 c03d44 = this.LLILLL;
        if (c03d44 != null) {
            C786410Ut5.A(c03d44, 8);
        }
        if (commentTopBarText3 != null && C123100dR.LIZ(commentTopBarText3.content)) {
            C03D4 c03d45 = this.LLILLL;
            if (c03d45 != null) {
                C786410Ut5.A(c03d45, 0);
            }
            C03D4 c03d46 = this.LLILLL;
            if (c03d46 != null) {
                c03d46.LJJJJJ(commentTopBarText3);
            }
        }
        C03D4 c03d47 = this.LLILZ;
        if (c03d47 != null) {
            C786410Ut5.A(c03d47, 8);
        }
        if (commentTopBarText2 != null && C123100dR.LIZ(commentTopBarText2.content)) {
            C03D4 c03d48 = this.LLILZ;
            if (c03d48 != null) {
                C786410Ut5.A(c03d48, 0);
            }
            C03D4 c03d49 = this.LLILZ;
            if (c03d49 != null) {
                c03d49.LJJJJJ(commentTopBarText2);
            }
        }
    }

    public final void LIZIZ(CommentTopBarText commentTopBarText, CommentTopBarText commentTopBarText2, CommentTopBarText commentTopBarText3, CommentTopBarIcon commentTopBarIcon, CommentTopBarText commentTopBarText4) {
        String str;
        View view = this.LL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C03D4 c03d4 = this.LLILZIL;
        if (c03d4 != null) {
            C786410Ut5.A(c03d4, 8);
        }
        C03D4 c03d42 = this.LLIZ;
        if (c03d42 != null) {
            C786410Ut5.A(c03d42, 8);
        }
        C03D4 c03d43 = this.LLILZLL;
        if (c03d43 != null) {
            C786410Ut5.A(c03d43, 8);
        }
        C03EX c03ex = this.LLJIJIL;
        if (c03ex != null) {
            int visibility = c03ex.getVisibility();
            c03ex.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c03ex);
        }
        C03D4 c03d44 = this.LLJILJIL;
        if (c03d44 != null) {
            C786410Ut5.A(c03d44, 8);
        }
        String str2 = null;
        if (commentTopBarText != null) {
            str2 = commentTopBarText.content;
        }
        if ((str2 == null || str2.length() == 0) && (commentTopBarText2 == null || (str = commentTopBarText2.content) == null || str.length() == 0)) {
            return;
        }
        View view2 = this.LL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        if (commentTopBarText != null && C123100dR.LIZ(commentTopBarText.content)) {
            C03D4 c03d45 = this.LLILZIL;
            if (c03d45 != null) {
                C786410Ut5.A(c03d45, 0);
            }
            C03D4 c03d46 = this.LLILZIL;
            if (c03d46 != null) {
                c03d46.LJJJJJ(commentTopBarText);
            }
        }
        if (commentTopBarText3 != null && C123100dR.LIZ(commentTopBarText3.content)) {
            C03D4 c03d47 = this.LLIZ;
            if (c03d47 != null) {
                C786410Ut5.A(c03d47, 0);
            }
            C03D4 c03d48 = this.LLIZ;
            if (c03d48 != null) {
                c03d48.LJJJJJ(commentTopBarText3);
            }
        }
        if (commentTopBarText2 != null && C123100dR.LIZ(commentTopBarText2.content)) {
            C03D4 c03d49 = this.LLILZLL;
            if (c03d49 != null) {
                C786410Ut5.A(c03d49, 0);
            }
            C03D4 c03d410 = this.LLILZLL;
            if (c03d410 != null) {
                c03d410.LJJJJJ(commentTopBarText2);
            }
        }
        if (commentTopBarIcon != null) {
            Boolean boolIsLocal = commentTopBarIcon.isLocal();
            Boolean bool = Boolean.TRUE;
            if ((Intrinsics.LJFF(boolIsLocal, bool) && commentTopBarIcon.localType != null) || (!Intrinsics.LJFF(commentTopBarIcon.isLocal(), bool) && commentTopBarIcon.iconUrl != null)) {
                C03EX c03ex2 = this.LLJIJIL;
                if (c03ex2 != null) {
                    c03ex2.LIZ(commentTopBarIcon);
                }
                C03EX c03ex3 = this.LLJIJIL;
                if (c03ex3 != null) {
                    int visibility2 = c03ex3.getVisibility();
                    c03ex3.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, c03ex3);
                }
            }
        }
        if (commentTopBarText4 != null && C123100dR.LIZ(commentTopBarText4.content)) {
            C03D4 c03d411 = this.LLJILJIL;
            if (c03d411 != null) {
                C786410Ut5.A(c03d411, 0);
            }
            C03D4 c03d412 = this.LLJILJIL;
            if (c03d412 != null) {
                c03d412.LJJJJJ(commentTopBarText4);
            }
        }
    }
}
