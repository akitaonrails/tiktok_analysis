package com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui;

import X.AbstractC1236404sc;
import X.C01GW;
import X.C07Y6;
import X.C0I3V;
import X.C0I40;
import X.C0I4H;
import X.C0I4Y;
import X.C0I5F;
import X.C0I5G;
import X.C0I5H;
import X.C0I5I;
import X.C0I5J;
import X.C0I5K;
import X.C0I5T;
import X.C0I5X;
import X.C0I62;
import X.C0I66;
import X.C0I6E;
import X.C0I6K;
import X.C0I6M;
import X.C0I6Y;
import X.C0I7V;
import X.C0I97;
import X.C0I9I;
import X.C0QSJ;
import X.C0ZDX;
import X.C0ZQZ;
import X.C1236504sd;
import X.C1308910kAL;
import X.C1320330kSl;
import X.C1331070kk5;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332130kln;
import X.C1383370m6R;
import X.C13LE;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1826440xd4;
import X.C1954807lC;
import X.C1EEZ;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2277911EEb;
import X.C2441009hQ;
import X.C389930FQp;
import X.C418310Gaj;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C438710HIf;
import X.C452501pT;
import X.C454440Hru;
import X.C460270I3d;
import X.C460460I3w;
import X.C460510I4b;
import X.C460520I4c;
import X.C460530I4d;
import X.C460620I4m;
import X.C460810I5f;
import X.C460970I5v;
import X.C461000I5y;
import X.C461640I8k;
import X.C462520IBu;
import X.C463050IDv;
import X.C687700QyG;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C892130YzD;
import X.C913380ZsO;
import X.EnumC21568119ax;
import X.InterfaceC1146704e9;
import X.InterfaceC1320380kSq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC460300I3g;
import X.InterfaceC460950I5t;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import X.InterfaceC911210Zot;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.BidiFormatter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleLayoutSetting;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.longpress.LongPressBubbleAnimUtil;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListLongPressAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.model.SkeletonLayoutCellAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem;
import com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView;
import com.ss.android.ugc.aweme.views.InterceptingConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import wh6.AbS323S0300000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class QuotedAreaReusedAssem2 extends ReusedSkeletonUIContentAssem<QuotedAreaReusedAssem2, C461000I5y> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public LinearLayout LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public LinearLayout LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public C0I6K LLJLL;
    public SmartImageView LLJLLIL;
    public TuxIconView LLJLLL;
    public View LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public C418310Gaj LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public volatile InterfaceC911210Zot LLLIIII;
    public InterfaceC665370Q7z LLLIIIIL;
    public C0QSJ LLLIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QuotedAreaReusedAssem2.class, "messageListFMPTracker", "getMessageListFMPTracker()Lcom/ss/android/ugc/aweme/im/messagelist/perf/IMMessageListFMPTracker;", 0);
        C13LE.LIZ.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    public final InterfaceC911210Zot tp() {
        InterfaceC911210Zot interfaceC911210Zot = this.LLLIIII;
        if (interfaceC911210Zot == null) {
            synchronized (this) {
                interfaceC911210Zot = this.LLLIIII;
                if (interfaceC911210Zot == null) {
                    InterfaceC911210Zot interfaceC911210ZotOp = op();
                    this.LLLIIII = interfaceC911210ZotOp;
                    return interfaceC911210ZotOp;
                }
            }
        }
        return interfaceC911210Zot;
    }

    public QuotedAreaReusedAssem2() {
        super(C462520IBu.LIZ);
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 206));
        this.LLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 208));
        this.LLLF = C452501pT.LIZIZ(new AwS550S0100000_6(this, 207));
        this.LLLFF = C452501pT.LIZIZ(new AwS550S0100000_6(this, 204));
        this.LLLFFI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 203));
        this.LLLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 202));
        this.LLLII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 205));
    }

    public final InterfaceC911210Zot op() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLLIIIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLIIIIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLLIIIIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLLIIIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC911210Zot interfaceC911210Zot = (InterfaceC911210Zot) c0qsjLIZLLL.getAbility(InterfaceC911210Zot.class);
        C687700QyG.LJ(interfaceC911210Zot, InterfaceC911210Zot.class);
        return interfaceC911210Zot;
    }

    public final int sp() {
        return ((Number) this.LLLFFI.getValue()).intValue();
    }

    public final int lp(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, LJJIJL().getContext());
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.k8y);
        this.LLJJJJJIL = linearLayout;
        if (linearLayout == null) {
            this.LLJJJJJIL = (LinearLayout) view.findViewById(R.id.soy);
        }
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.k96);
        this.LLJJL = view.findViewById(R.id.k93);
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.k95);
        this.LLJL = (LinearLayout) view.findViewById(R.id.k8x);
        IMMessageBubbleLayoutSetting.BubbleLayoutSetting bubbleLayoutSettingLIZ = IMMessageBubbleLayoutSetting.LIZ();
        LinearLayout linearLayout2 = this.LLJL;
        if (linearLayout2 != null) {
            linearLayout2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(bubbleLayoutSettingLIZ.quotedPaddingStartDp))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(bubbleLayoutSettingLIZ.quotedPaddingTopDp))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(bubbleLayoutSettingLIZ.quotedPaddingEndDp))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(bubbleLayoutSettingLIZ.quotedPaddingBottomDp))));
        }
        this.LLJLIL = (LinearLayout) view.findViewById(R.id.k94);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.k97);
        this.LLJLL = (C0I6K) view.findViewById(R.id.k91);
        this.LLJLLIL = (SmartImageView) view.findViewById(R.id.k8z);
        this.LLJLLL = (TuxIconView) view.findViewById(R.id.k90);
        this.LLJZ = view.findViewById(R.id.k92);
        View view2 = this.LLJJL;
        if (view2 != null) {
            view2.setBackground(new C389930FQp(C418440Gaw.LIZIZ(2), sp()));
        }
        View view3 = this.LLJJLIIIJLLLLLLLZ;
        if (view3 != null) {
            view3.setBackground(new C389930FQp(C418440Gaw.LIZIZ(2), sp()));
        }
        LinearLayout linearLayout3 = this.LLJL;
        if (linearLayout3 != null) {
            linearLayout3.setBackground(new C389930FQp(C418440Gaw.LIZIZ(12), sp()));
        }
        int iLJIIJ = C2441009hQ.LJIIJ(lp(R.attr.a1k), lp(R.attr.a1e));
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(iLJIIJ);
        }
        SkeletonLayoutCellAbility skeletonLayoutCellAbility = (SkeletonLayoutCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SkeletonLayoutCellAbility.class, null);
        if (skeletonLayoutCellAbility != null) {
            skeletonLayoutCellAbility.dM(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v56, types: [X.0Gaj, android.view.View] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem
    public final void ep(final C869590Y9l c869590Y9l, C461000I5y c461000I5y) {
        QuotedAreaOverlapLinearLayout quotedAreaOverlapLinearLayout;
        EnumC21568119ax enumC21568119ax;
        C0I5G c0i5g;
        C0I5H c0i5h;
        int iLIZIZ;
        C461000I5y c461000I5y2 = c461000I5y;
        if (c461000I5y2.LL.LLILZLL) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            C0I6K c0i6k = this.LLJLL;
            if (c0i6k != null) {
                c0i6k.setStyle(new C07Y6(C418440Gaw.LIZIZ(4)));
            }
            if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                View view = this.LLJJL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                View view2 = this.LLJJLIIIJLLLLLLLZ;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(0, view2);
                }
                LinearLayout linearLayout = this.LLJJJJJIL;
                if (linearLayout != null) {
                    linearLayout.setGravity(8388613);
                }
            } else {
                View view3 = this.LLJJL;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
                View view4 = this.LLJJLIIIJLLLLLLLZ;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(8, view4);
                }
                LinearLayout linearLayout2 = this.LLJJJJJIL;
                if (linearLayout2 != null) {
                    linearLayout2.setGravity(8388611);
                }
            }
            C460810I5f c460810I5f = c461000I5y2.LL;
            IMUser iMUser = c460810I5f.LL;
            boolean z = c460810I5f.LLILLJJLI;
            C0I4Y<InterfaceC460300I3g> c0i4y = c460810I5f.LLILLL;
            C0I5T c0i5t = c460810I5f.LLILZ;
            final C0I40 c0i40 = c460810I5f.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(hashCode());
            sbLIZ.append(" binding uiState=");
            sbLIZ.append(c0i5t);
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(hashCode());
            sbLIZ2.append(" binding tagUiState=");
            sbLIZ2.append(c0i4y);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (!Intrinsics.LJFF(c0i4y, C460510I4b.LIZ) && !Intrinsics.LJFF(c0i4y, C0I4H.LIZ)) {
                if (c0i4y instanceof C0I3V) {
                    TuxTextView tuxTextView = this.LLJJJJLIIL;
                    if (tuxTextView != null) {
                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                    }
                    TuxTextView tuxTextView2 = this.LLJJJJLIIL;
                    if (tuxTextView2 != null) {
                        C460270I3d c460270I3d = InterfaceC460300I3g.LIZ;
                        InterfaceC460300I3g interfaceC460300I3g = (InterfaceC460300I3g) ((C0I3V) c0i4y).LIZ;
                        Context context = LJJIJL().getContext();
                        c460270I3d.getClass();
                        tuxTextView2.setText(C460270I3d.LIZ(interfaceC460300I3g, context));
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                TuxTextView tuxTextView3 = this.LLJJJJLIIL;
                if (tuxTextView3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 8);
                }
            }
            LinearLayout linearLayout3 = this.LLJJJJJIL;
            if (linearLayout3 != null) {
                linearLayout3.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0I5z
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view5) {
                        ReferenceInfo referenceInfo;
                        View view6;
                        C0I60 c0i60;
                        if ((c0i40 instanceof C0I3R) || (referenceInfo = c869590Y9l.getReferenceInfo()) == null || referenceInfo.referenced_message_id == null || (view6 = this.LLJJJJJIL) == null) {
                            return true;
                        }
                        while (!(view6 instanceof InterceptingConstraintLayout)) {
                            Object parent = view6.getParent();
                            if (!(parent instanceof View) || (view6 = (View) parent) == null) {
                                return true;
                            }
                        }
                        LongPressBubbleAnimUtil longPressBubbleAnimUtil = (LongPressBubbleAnimUtil) PluggableExtentionKt.pluggableSpiForReal(LongPressBubbleAnimUtil.class);
                        if (longPressBubbleAnimUtil != null) {
                            longPressBubbleAnimUtil.LIZ(this.LLJJJJJIL);
                        }
                        MessageListLongPressAbility messageListLongPressAbility = (MessageListLongPressAbility) this.LLLI.getValue();
                        if (messageListLongPressAbility != null) {
                            if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                                c0i60 = C0I60.END;
                            } else {
                                c0i60 = C0I60.START;
                            }
                            messageListLongPressAbility.Ug1(new C0I6C(view6, c0i60, Collections.singletonList(C1558650qf9.LIZIZ("quote_see_original_message", C0ZL0.QUOTE_SEE_ORIGINAL_MESSAGE, null, 2131831617, false, new AwS372S0200000_6(this, c869590Y9l, 59), 48)), C1697810uHb.LJIIJJI(Integer.valueOf(R.id.biz), Integer.valueOf(R.id.pd8), Integer.valueOf(R.id.k6p), Integer.valueOf(R.id.o_5), Integer.valueOf(R.id.pd9), Integer.valueOf(R.id.z95), Integer.valueOf(R.id.eu1), Integer.valueOf(R.id.apb), Integer.valueOf(R.id.k_e), Integer.valueOf(R.id.ncm)), C1697810uHb.LJIIJJI(Integer.valueOf(R.id.pd8), Integer.valueOf(R.id.o_5), Integer.valueOf(R.id.eu1), Integer.valueOf(R.id.o9p)), C1697810uHb.LJIIJJI(Integer.valueOf(R.id.pd9), Integer.valueOf(R.id.z95))));
                            return true;
                        }
                        return true;
                    }
                });
            }
            LinearLayout linearLayout4 = this.LLJJJJJIL;
            if (linearLayout4 != null) {
                C786410Ut5.I7(new AbS323S0300000_6(this, c0i5t, c0i40, c869590Y9l, 2), linearLayout4);
            }
            LinearLayout linearLayout5 = this.LLJL;
            if (linearLayout5 != null) {
                linearLayout5.setBackground((Drawable) this.LLLFF.getValue());
            }
            ((C0ZQZ) this.LLL.getValue()).LIZIZ();
            LinearLayout linearLayout6 = this.LLJJJJJIL;
            Object obj = null;
            if (linearLayout6 instanceof QuotedAreaOverlapLinearLayout) {
                quotedAreaOverlapLinearLayout = (QuotedAreaOverlapLinearLayout) linearLayout6;
            } else {
                quotedAreaOverlapLinearLayout = null;
            }
            if (quotedAreaOverlapLinearLayout != null) {
                if (c0i5t instanceof C0I5X) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                } else {
                    iLIZIZ = 0;
                }
                quotedAreaOverlapLinearLayout.setOverlap(iLIZIZ);
            }
            if (!Intrinsics.LJFF(c0i5t, C460520I4c.LIZ) && !Intrinsics.LJFF(c0i5t, C460530I4d.LIZ)) {
                if (c0i5t instanceof InterfaceC460950I5t) {
                    LinearLayout linearLayout7 = this.LLJLIL;
                    if (linearLayout7 != null) {
                        C786410Ut5.LJZL(0, linearLayout7);
                    }
                    InterfaceC460950I5t interfaceC460950I5t = (InterfaceC460950I5t) c0i5t;
                    int i = C0I5F.LIZ[interfaceC460950I5t.LJIILLIIL().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c0i5g = C0I5G.EYE_SLASH;
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            c0i5g = C0I5G.PLAY;
                        }
                    } else {
                        c0i5g = C0I5G.NONE;
                    }
                    int i2 = C0I5F.LIZIZ[interfaceC460950I5t.LJIILJJIL().ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            c0i5h = C0I5H.CIRCLE;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        c0i5h = C0I5H.ROUNDED_CORNER;
                    }
                    if (interfaceC460950I5t instanceof C0I5K) {
                        C0I5K c0i5k = (C0I5K) c0i5t;
                        Ap(this, z, kp(iMUser, c0i5k.LIZJ(), c869590Y9l), c0i5k.LIZLLL(), c0i5k.LJ, c0i5k.LJIIL, c0i5k.LJIIJJI, c0i5g, c0i5h, c0i5k.LIZ(), c0i5k.LIZIZ(), c0i5k.LJ(), 768);
                        return;
                    }
                    if (interfaceC460950I5t instanceof C0I5J) {
                        C0I5J c0i5j = (C0I5J) c0i5t;
                        String strKp = kp(iMUser, c0i5j.LJ, c869590Y9l);
                        UrlModel urlModel = c0i5j.LIZ;
                        Function1<C0I66, C0I66> function1 = c0i5j.LIZLLL;
                        mp(z, strKp, c0i5j.LJIIIZ, c0i5j.LJIIIIZZ, c0i5g, c0i5h, null, null, c0i5j.LIZJ);
                        C0I66 c0i66 = new C0I66();
                        c0i66.LIZ = urlModel;
                        c0i66.LIZIZ = this.LLJLLIL;
                        c0i66.LJ = new C0I9I() { // from class: X.0I5w
                            @Override // X.C0I9I
                            public final void LIZIZ(String str, Throwable th) {
                            }

                            @Override // X.C0I9I
                            public final void LIZJ(String str) {
                            }

                            @Override // X.C0I9I
                            public final boolean LIZLLL() {
                                return false;
                            }

                            @Override // X.C0I9I
                            public final void LIZ(String str, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
                                this.LIZ.tp().LIZLLL(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(this.LIZ)).getUuid(), C2277911EEb.LIZ);
                            }
                        };
                        if (function1 != null) {
                            function1.invoke(c0i66);
                        }
                        new C0I97(c0i66).LIZ();
                        return;
                    }
                    if (interfaceC460950I5t instanceof C0I5I) {
                        c0i5t.getClass();
                        zp(z, kp(iMUser, null, c869590Y9l), 0, 0, c0i5g, c0i5h, InterfaceC1320380kSq.LIZ);
                        return;
                    }
                    if (interfaceC460950I5t instanceof C460460I3w) {
                        C460460I3w c460460I3w = (C460460I3w) c0i5t;
                        zp(z, kp(iMUser, c460460I3w.LIZIZ, c869590Y9l), c460460I3w.LJI, c460460I3w.LJFF, c0i5g, c0i5h, InterfaceC1320380kSq.LIZ);
                        return;
                    }
                    throw new C1954807lC();
                }
                if (c0i5t instanceof C460970I5v) {
                    LinearLayout linearLayout8 = this.LLJLIL;
                    if (linearLayout8 != null) {
                        C786410Ut5.LJZL(0, linearLayout8);
                    }
                    C460970I5v c460970I5v = (C460970I5v) c0i5t;
                    Ap(this, z, c460970I5v.LJI, c460970I5v.LIZ, c460970I5v.LIZLLL, 0, 0, C0I5G.NONE, C0I5H.ROUNDED_CORNER, null, InterfaceC1320380kSq.LIZ, false, 5936);
                    return;
                }
                if (c0i5t instanceof AbstractC1236404sc) {
                    LinearLayout linearLayout9 = this.LLJLIL;
                    if (linearLayout9 != null) {
                        C786410Ut5.LJZL(0, linearLayout9);
                    }
                    C460270I3d c460270I3d2 = InterfaceC460300I3g.LIZ;
                    InterfaceC460300I3g interfaceC460300I3gLIZ = ((AbstractC1236404sc) c0i5t).LIZ();
                    Context context2 = LJJIJL().getContext();
                    c460270I3d2.getClass();
                    yp(ip(c869590Y9l, iMUser, C460270I3d.LIZ(interfaceC460300I3gLIZ, context2).toString()), z);
                    tp().LIZLLL(c869590Y9l.getUuid(), C2277911EEb.LIZ);
                    return;
                }
                if (c0i5t instanceof C460620I4m) {
                    LinearLayout linearLayout10 = this.LLJLIL;
                    if (linearLayout10 != null) {
                        C786410Ut5.LJZL(0, linearLayout10);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(up(c869590Y9l, iMUser));
                    sbLIZ3.append(':');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    String str = ((C460620I4m) c0i5t).LIZ;
                    LinearLayout linearLayout11 = this.LLJJJJJIL;
                    if (linearLayout11 != null) {
                        C786410Ut5.LJZL(0, linearLayout11);
                    }
                    TuxTextView tuxTextView4 = this.LLJLILLLLZIIL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setMaxWidth((C461640I8k.LIZIZ(LJJIJL().getContext(), z) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(57)));
                    }
                    TuxTextView tuxTextView5 = this.LLJLILLLLZIIL;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setText(strLIZIZ);
                    }
                    C0I6K c0i6k2 = this.LLJLL;
                    if (c0i6k2 != null) {
                        C786410Ut5.e0(c0i6k2, 8);
                    }
                    C418310Gaj c418310Gaj = this.LLLFZ;
                    C418310Gaj c418310Gaj2 = c418310Gaj;
                    if (c418310Gaj == null) {
                        final Context context3 = LJJIJL().getContext();
                        ?? r1 = new LinearLayout(context3) { // from class: X.0Gaj
                            public final View LL;
                            public final TuxTextView LLILLJJLI;

                            {
                                super(context3, null, 0);
                                LinearLayout.inflate(context3, R.layout.clk, this);
                                View viewFindViewById = findViewById(R.id.k99);
                                this.LL = viewFindViewById;
                                this.LLILLJJLI = (TuxTextView) findViewById(R.id.k98);
                                float fLIZIZ = C418440Gaw.LIZIZ(12);
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, getContext());
                                if (numLIZJ != null) {
                                    viewFindViewById.setBackground(new C389930FQp(fLIZIZ, numLIZJ.intValue()));
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }

                            public final void setDuration(String str2) {
                                this.LLILLJJLI.setText(str2);
                            }
                        };
                        LinearLayout linearLayout12 = this.LLJL;
                        if (linearLayout12 != 0) {
                            linearLayout12.addView(r1);
                        }
                        this.LLLFZ = r1;
                        c418310Gaj2 = r1;
                    }
                    int visibility = c418310Gaj2.getVisibility();
                    c418310Gaj2.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c418310Gaj2);
                    c418310Gaj2.setDuration(str);
                    tp().LIZLLL(c869590Y9l.getUuid(), C1EEZ.LIZ);
                    return;
                }
                if (c0i5t instanceof C1236504sd) {
                    LinearLayout linearLayout13 = this.LLJLIL;
                    if (linearLayout13 != null) {
                        C786410Ut5.LJZL(0, linearLayout13);
                    }
                    yp(ip(c869590Y9l, iMUser, ((C1236504sd) c0i5t).LIZ), z);
                    return;
                }
                if (c0i5t instanceof C0I5X) {
                    LinearLayout linearLayout14 = this.LLJLIL;
                    if (linearLayout14 != null) {
                        C786410Ut5.LJZL(8, linearLayout14);
                    }
                    SocialThoughtBaseBubbleBackgroundView socialThoughtBaseBubbleBackgroundView = (SocialThoughtBaseBubbleBackgroundView) ((C0ZQZ) this.LLL.getValue()).LIZ();
                    if (socialThoughtBaseBubbleBackgroundView != null) {
                        socialThoughtBaseBubbleBackgroundView.setBodyMinWidthOverrideDp(C418440Gaw.LIZIZ(12));
                        if (C426750GoL.LIZLLL(socialThoughtBaseBubbleBackgroundView.getContext())) {
                            if (z) {
                                enumC21568119ax = EnumC21568119ax.RIGHT_BOTTOM_MEDIUM;
                            } else {
                                enumC21568119ax = EnumC21568119ax.LEFT_BOTTOM_MEDIUM;
                            }
                        } else if (z) {
                            enumC21568119ax = EnumC21568119ax.LEFT_BOTTOM_MEDIUM;
                        } else {
                            enumC21568119ax = EnumC21568119ax.RIGHT_BOTTOM_MEDIUM;
                        }
                        socialThoughtBaseBubbleBackgroundView.setBubbleShape(enumC21568119ax);
                        socialThoughtBaseBubbleBackgroundView.setFillColor(lp(R.attr.zo));
                        C786410Ut5.LJLLLLLL(0, socialThoughtBaseBubbleBackgroundView);
                        socialThoughtBaseBubbleBackgroundView.LIZJ();
                    }
                    C1826440xd4 c1826440xd4 = (C1826440xd4) ((C0ZQZ) this.LLLF.getValue()).LIZ();
                    if (c1826440xd4 != null) {
                        c1826440xd4.setMaxContentWidth(C461640I8k.LIZIZ(LJJIJL().getContext(), z) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                        c1826440xd4.setMaxNumberOfLines(2);
                        c1826440xd4.setText(((C0I5X) c0i5t).LIZ.text);
                        c1826440xd4.setTextColor(C1383370m6R.LJFF(R.attr.a1k));
                    }
                    tp().LIZLLL(c869590Y9l.getUuid(), C1EEZ.LIZ);
                    return;
                }
                throw new C1954807lC();
            }
            LinearLayout linearLayout15 = this.LLJLIL;
            if (linearLayout15 != null) {
                C786410Ut5.LJZL(8, linearLayout15);
            }
            InterfaceC911210Zot interfaceC911210ZotTp = tp();
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            interfaceC911210ZotTp.LIZLLL(C0I6Y.LIZ((InterfaceC461380I7k) obj).getUuid(), C1EEZ.LIZ);
            return;
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    public final String up(C869590Y9l c869590Y9l, IMUser iMUser) {
        IIMContactUtilService.LIZ.getClass();
        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
        if (iIMContactUtilServiceLIZ != null && iIMContactUtilServiceLIZ.LJIIIZ(iMUser)) {
            return LJJIJL().getContext().getString(2131835771);
        }
        if (iMUser != null) {
            return C892130YzD.LIZ(iMUser, c869590Y9l.getConversationId());
        }
        return "";
    }

    public final void yp(String str, boolean z) {
        LinearLayout linearLayout = this.LLJJJJJIL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        if (tuxTextView != null) {
            tuxTextView.setMaxWidth(C461640I8k.LIZIZ(LJJIJL().getContext(), z) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        }
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(str);
        }
        C0I6K c0i6k = this.LLJLL;
        if (c0i6k != null) {
            C786410Ut5.e0(c0i6k, 8);
        }
        C418310Gaj c418310Gaj = this.LLLFZ;
        if (c418310Gaj != null) {
            int visibility = c418310Gaj.getVisibility();
            c418310Gaj.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c418310Gaj);
        }
    }

    public final String ip(C869590Y9l c869590Y9l, IMUser iMUser, String str) {
        if (iMUser != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(up(c869590Y9l, iMUser));
            sbLIZ.append(": ");
            sbLIZ.append(str);
            return BidiFormatter.getInstance().unicodeWrap(u.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ), "\u200f", "", false));
        }
        return str;
    }

    public final String kp(IMUser iMUser, InterfaceC460300I3g interfaceC460300I3g, C869590Y9l c869590Y9l) {
        C460270I3d c460270I3d = InterfaceC460300I3g.LIZ;
        Context context = LJJIJL().getContext();
        c460270I3d.getClass();
        return ip(c869590Y9l, iMUser, C460270I3d.LIZ(interfaceC460300I3g, context).toString());
    }

    public final void zp(boolean z, String str, int i, int i2, C0I5G c0i5g, C0I5H c0i5h, C1320330kSl c1320330kSl) {
        mp(z, str, i, i2, c0i5g, c0i5h, null, null, c1320330kSl);
        C0I6K c0i6k = this.LLJLL;
        if (c0i6k != null) {
            C786410Ut5.e0(c0i6k, 8);
        }
        View view = this.LLJZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public final void mp(boolean z, String str, int i, int i2, C0I5G c0i5g, C0I5H c0i5h, Integer num, Integer num2, InterfaceC1320380kSq interfaceC1320380kSq) {
        C1331070kk5 hierarchy;
        C0I6M c07y6;
        C1331070kk5 hierarchy2;
        LinearLayout linearLayout = this.LLJJJJJIL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        C418310Gaj c418310Gaj = this.LLLFZ;
        if (c418310Gaj != null) {
            int visibility = c418310Gaj.getVisibility();
            c418310Gaj.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c418310Gaj);
        }
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setMaxWidth((C461640I8k.LIZIZ(LJJIJL().getContext(), z) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)));
        }
        View view = this.LLJZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        SmartImageView smartImageView = this.LLJLLIL;
        if (smartImageView != null) {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                if (num != null && num2 != null) {
                    layoutParams.width = num.intValue();
                    layoutParams.height = num2.intValue();
                } else if (i > 0 && i2 > 0) {
                    if (i > i2) {
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                        layoutParams.height = (int) ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)) / i) * i2);
                    } else {
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                        layoutParams.width = (int) ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)) / i2) * i);
                    }
                } else {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                }
                C786410Ut5.W5(smartImageView, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        SmartImageView smartImageView2 = this.LLJLLIL;
        if (smartImageView2 != null && (hierarchy2 = smartImageView2.getHierarchy()) != null) {
            hierarchy2.LJIIZILJ(interfaceC1320380kSq);
        }
        C0I6K c0i6k = this.LLJLL;
        if (c0i6k != null) {
            C786410Ut5.e0(c0i6k, 0);
        }
        C0I6K c0i6k2 = this.LLJLL;
        if (c0i6k2 != null) {
            int i3 = C0I5F.LIZJ[c0i5h.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    c07y6 = C0I62.LIZ;
                } else {
                    throw new C1954807lC();
                }
            } else {
                c07y6 = new C07Y6(C418440Gaw.LIZIZ(4));
            }
            c0i6k2.setStyle(c07y6);
        }
        int i4 = C0I5F.LIZLLL[c0i5g.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    TuxIconView tuxIconView = this.LLJLLL;
                    if (tuxIconView != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    }
                    TuxIconView tuxIconView2 = this.LLJLLL;
                    if (tuxIconView2 != null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_eye_slash;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        tuxIconView2.setImageDrawable(c419910GdJ.LIZ(LJJIJL().getContext()));
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                TuxIconView tuxIconView3 = this.LLJLLL;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                }
                TuxIconView tuxIconView4 = this.LLJLLL;
                if (tuxIconView4 != null) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_play_fill;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.zi);
                    c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    tuxIconView4.setImageDrawable(c419910GdJ2.LIZ(LJJIJL().getContext()));
                }
            }
        } else {
            TuxIconView tuxIconView5 = this.LLJLLL;
            if (tuxIconView5 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
            }
        }
        SmartImageView smartImageView3 = this.LLJLLIL;
        if (smartImageView3 != null) {
            smartImageView3.setPlaceholderImage(new C389930FQp(C418440Gaw.LIZIZ(4), lp(R.attr.a03)));
        }
        SmartImageView smartImageView4 = this.LLJLLIL;
        if (smartImageView4 != null && (hierarchy = smartImageView4.getHierarchy()) != null) {
            hierarchy.LJIJ(new C389930FQp(C418440Gaw.LIZIZ(4), lp(R.attr.a03)), 5);
        }
    }

    public static void Ap(QuotedAreaReusedAssem2 quotedAreaReusedAssem2, boolean z, String str, UrlModel urlModel, Function1 function1, int i, int i2, C0I5G c0i5g, C0I5H c0i5h, String str2, InterfaceC1320380kSq interfaceC1320380kSq, boolean z2, int i3) {
        String uuid = str2;
        int iLIZIZ = i2;
        int iLIZIZ2 = i;
        if ((i3 & 16) != 0) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        }
        if ((i3 & 32) != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        }
        Object obj = null;
        if ((i3 & 1024) != 0) {
            uuid = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z2 = false;
        }
        quotedAreaReusedAssem2.mp(z, str, iLIZIZ2, iLIZIZ, c0i5g, c0i5h, null, null, interfaceC1320380kSq);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LJJJJLI = C454440Hru.LIZ();
        c1331670kl3LJIIIIZZ.LJJ(quotedAreaReusedAssem2.LLJLLIL);
        if (function1 != null) {
            function1.invoke(c1331670kl3LJIIIIZZ);
        }
        if (z2) {
            c1331670kl3LJIIIIZZ.LJJIJIL(new C0I7V(quotedAreaReusedAssem2.LJJIJL().getContext(), 25));
        }
        if (uuid == null) {
            C724270Sb3 c724270Sb3 = quotedAreaReusedAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            uuid = C0I6Y.LIZ((InterfaceC461380I7k) obj).getUuid();
        }
        C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "QuotedAreaResuedAssem2#titleWithLightenImage", new C463050IDv(quotedAreaReusedAssem2, 1), false, new C0I6E(uuid), null, null, 52);
    }
}
