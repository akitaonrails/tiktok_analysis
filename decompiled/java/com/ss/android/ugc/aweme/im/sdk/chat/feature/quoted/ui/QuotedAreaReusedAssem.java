package com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui;

import X.AbstractC1236404sc;
import X.AbstractC455680Htu;
import X.C01GW;
import X.C09R3;
import X.C09RD;
import X.C09RE;
import X.C0HHT;
import X.C0I3L;
import X.C0I3R;
import X.C0I3V;
import X.C0I40;
import X.C0I4H;
import X.C0I4Y;
import X.C0I5I;
import X.C0I5J;
import X.C0I5K;
import X.C0I5T;
import X.C0I5X;
import X.C0I66;
import X.C0I68;
import X.C0I6E;
import X.C0I6Y;
import X.C0I73;
import X.C0I7V;
import X.C0I97;
import X.C0I9I;
import X.C0QSJ;
import X.C0ZDX;
import X.C0ZQZ;
import X.C1236504sd;
import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332130kln;
import X.C1378990lzN;
import X.C1383370m6R;
import X.C13LE;
import X.C1558520qew;
import X.C1609580rzI;
import X.C1637806bA;
import X.C1826440xd4;
import X.C1954807lC;
import X.C19719912Dl;
import X.C1EEZ;
import X.C2217381BqS;
import X.C2441009hQ;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C438710HIf;
import X.C449301ox;
import X.C452501pT;
import X.C454440Hru;
import X.C460270I3d;
import X.C460450I3v;
import X.C460460I3w;
import X.C460510I4b;
import X.C460520I4c;
import X.C460530I4d;
import X.C460620I4m;
import X.C460770I5b;
import X.C460810I5f;
import X.C460970I5v;
import X.C461000I5y;
import X.C461640I8k;
import X.C462520IBu;
import X.C462630ICf;
import X.C463050IDv;
import X.C687700QyG;
import X.C723830SaL;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.C869590Y9l;
import X.EnumC21568119ax;
import X.EnumC452301pR;
import X.EnumC714850S2h;
import X.InterfaceC1146704e9;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC460300I3g;
import X.InterfaceC460900I5o;
import X.InterfaceC460950I5t;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import X.InterfaceC911210Zot;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleLayoutSetting;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.model.SkeletonLayoutCellAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.QuotedAreaReusedAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem;
import com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutCL;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS323S0300000_6;
import wh6.AbS498S0200000_6;

/* JADX INFO: loaded from: classes7.dex */
public class QuotedAreaReusedAssem extends ReusedSkeletonUIContentAssem<QuotedAreaReusedAssem, C461000I5y> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public C460810I5f LLLI;
    public final InterfaceC1731706qJ LLLII;
    public final C463050IDv LLLIIII;
    public volatile InterfaceC911210Zot LLLIIIIL;
    public InterfaceC665370Q7z LLLIIIL;
    public C0QSJ LLLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QuotedAreaReusedAssem.class, "quotedAreaViewModel", "getQuotedAreaViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/quoted/ui/QuotedAreaViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(QuotedAreaReusedAssem.class, "messageListFMPTracker", "getMessageListFMPTracker()Lcom/ss/android/ugc/aweme/im/messagelist/perf/IMMessageListFMPTracker;", 0);
        c09r3.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    public final InterfaceC911210Zot kp() {
        InterfaceC911210Zot interfaceC911210Zot = this.LLLIIIIL;
        if (interfaceC911210Zot == null) {
            synchronized (this) {
                interfaceC911210Zot = this.LLLIIIIL;
                if (interfaceC911210Zot == null) {
                    InterfaceC911210Zot interfaceC911210ZotIp = ip();
                    this.LLLIIIIL = interfaceC911210ZotIp;
                    return interfaceC911210ZotIp;
                }
            }
        }
        return interfaceC911210Zot;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem, X.InterfaceC712990Rxx
    public void unBind() {
        this.LLLI = null;
    }

    public QuotedAreaReusedAssem() {
        super(C462520IBu.LIZ);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJJJJIL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 185));
        this.LLJJJJLIIL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 191));
        this.LLJJL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 196));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 197));
        this.LLJL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 198));
        this.LLJLIL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 199));
        this.LLJLILLLLZIIL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 188));
        this.LLJLL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 189));
        this.LLJLLIL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 186));
        this.LLJLLL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 187));
        this.LLJZ = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 190));
        this.LLJZIJLIL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 192));
        this.LLL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 195));
        this.LLLF = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 193));
        this.LLLFF = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 194));
        this.LLLFFI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 201));
        this.LLLFZ = C452501pT.LIZ(enumC452301pR, new AwS558S0100000_14(this, 611));
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedAreaViewModel.class);
        this.LLLII = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 200), null, AFwS236S0000000_6.get$arr$(109));
        this.LLLIIII = new C463050IDv(this, 0);
    }

    public final InterfaceC911210Zot ip() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLLIIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLIIIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLLIIIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLLIIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC911210Zot interfaceC911210Zot = (InterfaceC911210Zot) c0qsjLIZLLL.getAbility(InterfaceC911210Zot.class);
        C687700QyG.LJ(interfaceC911210Zot, InterfaceC911210Zot.class);
        return interfaceC911210Zot;
    }

    public final QuotedAreaViewModel lp() {
        return (QuotedAreaViewModel) this.LLLII.getValue(this, LLLIILIL[0]);
    }

    public final FrameLayout mp() {
        return (FrameLayout) this.LLJLLIL.getValue();
    }

    public final SmartImageView op() {
        return (SmartImageView) this.LLJLILLLLZIIL.getValue();
    }

    public final TuxTextView sp() {
        return (TuxTextView) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(final View view) {
        C723830SaL.LIZ(this, null, new AwS585S0100000_6(this, 92));
        ((FrameLayout) this.LLJJJJLIIL.getValue()).setMeasureAllChildren(false);
        ViewStub viewStub = (ViewStub) LJJIJL().findViewById(R.id.view_stub_im_item_msg_quoted_text);
        if (viewStub != null) {
            viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.0I5u
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub2, View view2) {
                    QuotedAreaReusedAssem quotedAreaReusedAssem = this;
                    C384050F3z c384050F3z = new C384050F3z();
                    Context context = quotedAreaReusedAssem.getContext();
                    if (context != null) {
                        c384050F3z.LIZ = C451040HmQ.LIZ(R.attr.a03, context);
                    } else {
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                    }
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                    this.sp().setBackground(c384050F3z.LIZ(view.getContext()));
                    IMMessageBubbleLayoutSetting.BubbleLayoutSetting bubbleLayoutSettingLIZ = IMMessageBubbleLayoutSetting.LIZ();
                    this.sp().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(bubbleLayoutSettingLIZ.quotedPaddingStartDp))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(bubbleLayoutSettingLIZ.quotedPaddingTopDp))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(bubbleLayoutSettingLIZ.quotedPaddingEndDp))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(bubbleLayoutSettingLIZ.quotedPaddingBottomDp))));
                }
            });
        }
        SkeletonLayoutCellAbility skeletonLayoutCellAbility = (SkeletonLayoutCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SkeletonLayoutCellAbility.class, null);
        if (skeletonLayoutCellAbility != null) {
            skeletonLayoutCellAbility.dM(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    public void ep(C869590Y9l c869590Y9l, C461000I5y c461000I5y) {
        int i;
        int i2;
        int i3;
        QuotedAreaOverlapLinearLayout quotedAreaOverlapLinearLayout;
        Object obj;
        EnumC21568119ax enumC21568119ax;
        int iIntValue;
        Object obj2;
        Object obj3;
        Object obj4;
        int iIntValue2;
        Object obj5;
        Integer numLIZJ;
        Integer numLIZJ2;
        float f;
        int iIntValue3;
        int iLIZIZ;
        FrameLayout.LayoutParams layoutParams;
        int i4;
        FrameLayout.LayoutParams layoutParams2;
        int i5;
        if (c461000I5y.LL.LLILZLL) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        int iIntValue4 = 0;
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        View viewSp = null;
        if (!(c461000I5y.LLILLJJLI.LL instanceof C0I68)) {
            C723830SaL.LJ(this, C13LE.LIZ(QuotedReactionReusedAssem.class), true, null);
        }
        C460810I5f c460810I5f = c461000I5y.LL;
        if (Intrinsics.LJFF(c460810I5f, this.LLLI)) {
            return;
        }
        this.LLLI = c460810I5f;
        boolean zLJJJJIZL = C0ZDX.LJJJJIZL(c869590Y9l);
        boolean z = c460810I5f.LLILLJJLI;
        C0I4Y<InterfaceC460300I3g> c0i4y = c460810I5f.LLILLL;
        C0I5T c0i5t = c460810I5f.LLILZ;
        C0I40 c0i40 = c460810I5f.LLILZIL;
        LinearLayout linearLayout = (LinearLayout) this.LLJJJJJIL.getValue();
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
            if (z) {
                i5 = 8388613;
            } else {
                i5 = 8388611;
            }
            layoutParams2.gravity = i5;
        }
        if (z) {
            i = 8388613;
        } else {
            i = 8388611;
        }
        linearLayout.setGravity(i);
        Iterator<View> it2 = new C09RD(mp()).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                break;
            }
            View view = (View) c09re.next();
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
                if (z) {
                    i4 = 8388613;
                } else {
                    i4 = 8388611;
                }
                layoutParams.gravity = i4;
            }
            view.requestLayout();
        }
        View view2 = (View) this.LLJJL.getValue();
        if (z) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2)));
        if (z) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        C426750GoL.LJIIL(view2, numValueOf, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i3))), null, 26);
        if (c0i4y instanceof C0I3V) {
            Context context = getContext();
            if (context != null) {
                TextView textView = (TextView) this.LLJJL.getValue();
                C460270I3d c460270I3d = InterfaceC460300I3g.LIZ;
                InterfaceC460300I3g interfaceC460300I3g = (InterfaceC460300I3g) ((C0I3V) c0i4y).LIZ;
                c460270I3d.getClass();
                textView.setText(C460270I3d.LIZ(interfaceC460300I3g, context));
                C786410Ut5.LJLLLLLL(0, (View) this.LLJJL.getValue());
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            if (!Intrinsics.LJFF(c0i4y, C460510I4b.LIZ) && !Intrinsics.LJFF(c0i4y, C0I4H.LIZ)) {
                throw new C1954807lC();
            }
            C786410Ut5.LJLLLLLL(8, (View) this.LLJJL.getValue());
        }
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof QuotedAreaOverlapLinearLayout) {
            quotedAreaOverlapLinearLayout = (QuotedAreaOverlapLinearLayout) viewLJJIJL;
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
        boolean z2 = c0i5t instanceof InterfaceC460950I5t;
        if (z2) {
            ViewStub viewStub = (ViewStub) LJJIJL().findViewById(R.id.view_stub_im_item_msg_quoted_media);
            if (viewStub != null) {
                C786410Ut5.LJLLLL(viewStub);
            }
            ((ViewAnimator) this.LLJJJJLIIL.getValue()).setDisplayedChild(2);
            lp().LL = (View) this.LLJLLL.getValue();
            C786410Ut5.LJLLLLLL(0, mp());
            SmartImageView smartImageViewOp = op();
            InterfaceC460950I5t interfaceC460950I5t = (InterfaceC460950I5t) c0i5t;
            if (interfaceC460950I5t.LJIILIIL()) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.fc(smartImageViewOp, f);
            C1383370m6R.LJIILJJIL(interfaceC460950I5t.getWidth(), interfaceC460950I5t.getHeight(), smartImageViewOp);
            TuxIconView tuxIconView = (TuxIconView) this.LLJZ.getValue();
            InterfaceC460900I5o interfaceC460900I5oLJIILL = interfaceC460950I5t.LJIILL();
            if (interfaceC460900I5oLJIILL instanceof C460450I3v) {
                C460450I3v c460450I3v = (C460450I3v) interfaceC460900I5oLJIILL;
                C449301ox c449301ox = new C449301ox(c460450I3v.LIZ, c460450I3v.LIZIZ);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c449301ox.invoke(c419910GdJ);
                tuxIconView.setTuxIcon(c419910GdJ);
                C786410Ut5.LJLLLLLL(0, tuxIconView);
            } else {
                C786410Ut5.LJLLLLLL(8, tuxIconView);
            }
            if (interfaceC460950I5t.LJIIJJI() != null) {
                C1378990lzN.LIZIZ(op(), Float.valueOf(r6.intValue()), null, null, null, null, 30);
            }
            if (interfaceC460950I5t.LJIIL() == null) {
                C786410Ut5.LJLLLLLL(8, (View) this.LLJLL.getValue());
            } else {
                View view3 = (View) this.LLJLL.getValue();
                Integer numLJIIL = interfaceC460950I5t.LJIIL();
                if (numLJIIL != null) {
                    iIntValue3 = numLJIIL.intValue();
                } else {
                    iIntValue3 = 0;
                }
                view3.setBackgroundResource(iIntValue3);
                C1383370m6R.LJIILJJIL(interfaceC460950I5t.getWidth(), interfaceC460950I5t.getHeight(), view3);
                C786410Ut5.LJLLLLLL(0, view3);
            }
            if (interfaceC460950I5t instanceof C0I5I) {
                SmartImageView smartImageViewOp2 = op();
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(null);
                c1331670kl3LJIIIIZZ.LJJ(op());
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                c0i5t.getClass();
                smartImageViewOp2.setBackground(null);
            } else if (interfaceC460950I5t instanceof C460460I3w) {
                SmartImageView smartImageViewOp3 = op();
                C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(null);
                c1331670kl3LJIIIIZZ2.LJJ(op());
                C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
                smartImageViewOp3.setBackgroundResource(((C460460I3w) c0i5t).LIZ);
            } else if (interfaceC460950I5t instanceof C0I5K) {
                C0I5K c0i5k = (C0I5K) c0i5t;
                SmartImageView smartImageViewOp4 = op();
                Integer num = c0i5k.LIZJ;
                if (num != null) {
                    iIntValue4 = num.intValue();
                }
                smartImageViewOp4.setBackgroundResource(iIntValue4);
                C1331670kl3 c1331670kl3LJIIIIZZ3 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c0i5k.LIZLLL()));
                Integer num2 = c0i5k.LIZIZ;
                if (num2 != null) {
                    int iIntValue5 = num2.intValue();
                    c1331670kl3LJIIIIZZ3.LJIL(C800330VaR.LIZIZ(op().getContext(), iIntValue5));
                    c1331670kl3LJIIIIZZ3.LJJIIZI(C800330VaR.LIZIZ(op().getContext(), iIntValue5));
                }
                Function1<C1331670kl3, C1331670kl3> function1 = c0i5k.LJ;
                if (function1 != null) {
                    function1.invoke(c1331670kl3LJIIIIZZ3);
                }
                if (c0i5k.LJ()) {
                    c1331670kl3LJIIIIZZ3.LJJIJIL(new C0I7V(op().getContext(), 25));
                }
                c1331670kl3LJIIIIZZ3.LJJ(op());
                C1332130kln.LJFF(c1331670kl3LJIIIIZZ3, String.valueOf(C13LE.LIZ(c0i5k.getClass()).LJI()), this.LLLIIII, false, null, null, null, 60);
            } else if (interfaceC460950I5t instanceof C0I5J) {
                C0I5J c0i5j = (C0I5J) c0i5t;
                op().setBackground(null);
                C0I66 c0i66 = new C0I66();
                Integer num3 = c0i5j.LIZIZ;
                if (num3 != null) {
                    int iIntValue6 = num3.intValue();
                    op().setPlaceholderImage(iIntValue6);
                    C1331070kk5 hierarchy = op().getHierarchy();
                    hierarchy.LJIJ(hierarchy.LIZIZ.getDrawable(iIntValue6), 5);
                }
                Function1<C0I66, C0I66> function12 = c0i5j.LIZLLL;
                if (function12 != null) {
                    function12.invoke(c0i66);
                }
                c0i66.LIZ = c0i5j.LIZ;
                c0i66.LIZIZ = op();
                c0i66.LJ = new C0I9I() { // from class: X.0I5x
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
                        this.LIZ.kp().LIZLLL(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(this.LIZ)).getUuid(), C2277911EEb.LIZ);
                    }
                };
                new C0I97(c0i66).LIZ();
            } else {
                throw new C1954807lC();
            }
        } else if (c0i5t instanceof AbstractC1236404sc) {
            ViewStub viewStub2 = (ViewStub) LJJIJL().findViewById(R.id.view_stub_im_item_msg_quoted_text);
            if (viewStub2 != null) {
                C786410Ut5.LJLLLL(viewStub2);
            }
            ((ViewAnimator) this.LLJJJJLIIL.getValue()).setDisplayedChild(1);
            Context context2 = getContext();
            if (context2 != null) {
                sp().setMaxWidth(C461640I8k.LIZIZ(context2, zLJJJJIZL) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                TuxTextView tuxTextViewSp = sp();
                C460270I3d c460270I3d2 = InterfaceC460300I3g.LIZ;
                InterfaceC460300I3g interfaceC460300I3gLIZ = ((AbstractC1236404sc) c0i5t).LIZ();
                c460270I3d2.getClass();
                tuxTextViewSp.setText(C460270I3d.LIZ(interfaceC460300I3gLIZ, context2));
                TuxTextView tuxTextViewSp2 = sp();
                Context context3 = tuxTextViewSp2.getContext();
                if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context3)) != null) {
                    int iIntValue7 = numLIZJ.intValue();
                    Context context4 = tuxTextViewSp2.getContext();
                    if (context4 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context4)) != null) {
                        int iLJI = C2441009hQ.LJI(0.4f, iIntValue7, numLIZJ2.intValue());
                        tuxTextViewSp2.setTextColor((((int) (((((Color.alpha(iLJI) / 255.0f) * Color.green(iLJI)) / 255.0f) * 255.0f) + 0.5f)) << 8) | (((int) (((((Color.alpha(iLJI) / 255.0f) * Color.red(iLJI)) / 255.0f) * 255.0f) + 0.5f)) << 16) | (-16777216) | ((int) (((((Color.alpha(iLJI) / 255.0f) * Color.blue(iLJI)) / 255.0f) * 255.0f) + 0.5f)));
                    }
                }
                lp().LL = sp();
                C786410Ut5.LJLLLLLL(0, mp());
                InterfaceC911210Zot interfaceC911210ZotKp = kp();
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj5 = c724270Sb3.LL;
                } else {
                    obj5 = null;
                }
                interfaceC911210ZotKp.LIZLLL(C0I6Y.LIZ((InterfaceC461380I7k) obj5).getUuid(), C1EEZ.LIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (c0i5t instanceof C460970I5v) {
            ViewStub viewStub3 = (ViewStub) LJJIJL().findViewById(R.id.view_stub_im_item_msg_quoted_preview);
            if (viewStub3 != null) {
                C786410Ut5.LJLLLL(viewStub3);
            }
            ((TuxTextView) this.LLLFF.getValue()).LJJJJI(12.0f);
            ((ViewAnimator) this.LLJJJJLIIL.getValue()).setDisplayedChild(3);
            lp().LL = (View) this.LLJZIJLIL.getValue();
            C460970I5v c460970I5v = (C460970I5v) c0i5t;
            View view4 = (View) this.LLL.getValue();
            Integer num4 = c460970I5v.LIZJ;
            if (num4 != null) {
                iIntValue2 = num4.intValue();
            } else {
                iIntValue2 = 0;
            }
            view4.setBackgroundResource(iIntValue2);
            C1331670kl3 c1331670kl3LJIIIIZZ4 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c460970I5v.LIZ));
            Integer num5 = c460970I5v.LIZIZ;
            if (num5 != null) {
                int iIntValue8 = num5.intValue();
                c1331670kl3LJIIIIZZ4.LJIL(C800330VaR.LIZIZ(((View) this.LLL.getValue()).getContext(), iIntValue8));
                c1331670kl3LJIIIIZZ4.LJJIIZI(C800330VaR.LIZIZ(((View) this.LLL.getValue()).getContext(), iIntValue8));
            }
            Function1<C1331670kl3, C1331670kl3> function13 = c460970I5v.LIZLLL;
            if (function13 != null) {
                function13.invoke(c1331670kl3LJIIIIZZ4);
            }
            c1331670kl3LJIIIIZZ4.LJJ((SmartImageView) this.LLL.getValue());
            C1332130kln.LJFF(c1331670kl3LJIIIIZZ4, String.valueOf(C13LE.LIZ(C460970I5v.class).LJI()), this.LLLIIII, false, null, null, null, 60);
            int i6 = C460770I5b.LIZ[c460970I5v.LJII.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    C1609580rzI c1609580rzI = (C1609580rzI) ((C0ZQZ) this.LLLFFI.getValue()).LIZ();
                    if (c1609580rzI != null) {
                        StoryFeature storyFeatureLIZ = StoryFeature.LIZ.LIZ();
                        if (storyFeatureLIZ != null) {
                            storyFeatureLIZ.LIZJ(c1609580rzI);
                        }
                        C786410Ut5.LJLLLLLL(0, c1609580rzI);
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                ((C0ZQZ) this.LLLFFI.getValue()).LIZIZ();
            }
            ((TextView) this.LLLFF.getValue()).setText(c460970I5v.LJI);
            C1331670kl3 c1331670kl3LJIIIIZZ5 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c460970I5v.LJFF));
            c1331670kl3LJIIIIZZ5.LJJJJLI = C454440Hru.LIZ();
            c1331670kl3LJIIIIZZ5.LJJIIZ = EnumC714850S2h.SMALL;
            c1331670kl3LJIIIIZZ5.LJJ((SmartImageView) this.LLLF.getValue());
            String str = c460970I5v.LJ;
            C1332130kln.LJ(c1331670kl3LJIIIIZZ5, "QuotedPreviewAvatarView", str, 0, false, new C0I6E(str), null, 220);
            C786410Ut5.LJLLLLLL(0, mp());
        } else if (!Intrinsics.LJFF(c0i5t, C460520I4c.LIZ) && !Intrinsics.LJFF(c0i5t, C460530I4d.LIZ)) {
            if (c0i5t instanceof C1236504sd) {
                InterfaceC911210Zot interfaceC911210ZotKp2 = kp();
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj4 = c724270Sb32.LL;
                } else {
                    obj4 = null;
                }
                interfaceC911210ZotKp2.LIZLLL(C0I6Y.LIZ((InterfaceC461380I7k) obj4).getUuid(), C1EEZ.LIZ);
            } else if (c0i5t instanceof C460620I4m) {
                InterfaceC911210Zot interfaceC911210ZotKp3 = kp();
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                } else {
                    obj3 = null;
                }
                interfaceC911210ZotKp3.LIZLLL(C0I6Y.LIZ((InterfaceC461380I7k) obj3).getUuid(), C1EEZ.LIZ);
            } else if (c0i5t instanceof C0I5X) {
                ViewStub viewStub4 = (ViewStub) LJJIJL().findViewById(R.id.view_stub_im_item_msg_quoted_thought);
                if (viewStub4 != null) {
                    C786410Ut5.LJLLLL(viewStub4);
                }
                ((ViewAnimator) this.LLJJJJLIIL.getValue()).setDisplayedChild(4);
                Context context5 = getContext();
                if (context5 != null) {
                    SocialThoughtBaseBubbleBackgroundView socialThoughtBaseBubbleBackgroundView = (SocialThoughtBaseBubbleBackgroundView) this.LLJL.getValue();
                    socialThoughtBaseBubbleBackgroundView.setBodyMinWidthOverrideDp(C418440Gaw.LIZIZ(12));
                    if (C426750GoL.LIZLLL(socialThoughtBaseBubbleBackgroundView.getContext())) {
                        if (zLJJJJIZL) {
                            enumC21568119ax = EnumC21568119ax.RIGHT_BOTTOM_MEDIUM;
                        } else {
                            enumC21568119ax = EnumC21568119ax.LEFT_BOTTOM_MEDIUM;
                        }
                    } else if (zLJJJJIZL) {
                        enumC21568119ax = EnumC21568119ax.LEFT_BOTTOM_MEDIUM;
                    } else {
                        enumC21568119ax = EnumC21568119ax.RIGHT_BOTTOM_MEDIUM;
                    }
                    socialThoughtBaseBubbleBackgroundView.setBubbleShape(enumC21568119ax);
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zo, context5);
                    if (numLIZJ3 != null) {
                        iIntValue = numLIZJ3.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    socialThoughtBaseBubbleBackgroundView.setFillColor(iIntValue);
                    C786410Ut5.LJLLLLLL(0, socialThoughtBaseBubbleBackgroundView);
                    socialThoughtBaseBubbleBackgroundView.LIZJ();
                    ((C1826440xd4) this.LLJLIL.getValue()).setMaxContentWidth(C461640I8k.LIZIZ(context5, zLJJJJIZL) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    ((C1826440xd4) this.LLJLIL.getValue()).setMaxNumberOfLines(2);
                    ((TextView) this.LLJLIL.getValue()).setText(((C0I5X) c0i5t).LIZ.text);
                    ((TextView) this.LLJLIL.getValue()).setTextColor(C1383370m6R.LJFF(R.attr.a1k));
                    lp().LL = (View) this.LLJL.getValue();
                    C786410Ut5.LJLLLLLL(0, mp());
                    InterfaceC911210Zot interfaceC911210ZotKp4 = kp();
                    C724270Sb3 c724270Sb34 = this.LLJI;
                    if (c724270Sb34 != null) {
                        obj2 = c724270Sb34.LL;
                    } else {
                        obj2 = null;
                    }
                    interfaceC911210ZotKp4.LIZLLL(C0I6Y.LIZ((InterfaceC461380I7k) obj2).getUuid(), C1EEZ.LIZ);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            C786410Ut5.LJLLLLLL(8, mp());
            InterfaceC911210Zot interfaceC911210ZotKp5 = kp();
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj = c724270Sb35.LL;
            } else {
                obj = null;
            }
            interfaceC911210ZotKp5.LIZLLL(C0I6Y.LIZ((InterfaceC461380I7k) obj).getUuid(), C1EEZ.LIZ);
        }
        boolean z3 = c0i5t instanceof C460970I5v;
        if (z3) {
            RoundingCornerLayoutCL roundingCornerLayoutCL = (RoundingCornerLayoutCL) this.LLJZIJLIL.getValue();
            float f2 = C0I73.LIZ;
            roundingCornerLayoutCL.setRoundingParams(new C462630ICf(f2, f2, f2, f2));
        }
        if (z2) {
            if (c0i40 instanceof AbstractC455680Htu) {
                View view5 = (View) this.LLJLLL.getValue();
                Context context6 = getContext();
                if (context6 != null) {
                    view5.setForeground(C800330VaR.LIZIZ(context6, R.drawable.cap));
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                ((View) this.LLJLLL.getValue()).setForeground(null);
            }
            viewSp = (View) this.LLJLLL.getValue();
        } else {
            if (c0i5t instanceof AbstractC1236404sc) {
                if (c0i40 instanceof AbstractC455680Htu) {
                    TuxTextView tuxTextViewSp3 = sp();
                    Context context7 = getContext();
                    if (context7 != null) {
                        tuxTextViewSp3.setForeground(C800330VaR.LIZIZ(context7, R.drawable.cap));
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    sp().setForeground(null);
                }
            } else if (z3) {
                if (c0i40 instanceof AbstractC455680Htu) {
                    View view6 = (View) this.LLJZIJLIL.getValue();
                    Context context8 = getContext();
                    if (context8 != null) {
                        view6.setForeground(C800330VaR.LIZIZ(context8, R.drawable.cap));
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    ((View) this.LLJZIJLIL.getValue()).setForeground(null);
                }
            }
            if (c0i5t instanceof AbstractC1236404sc) {
                viewSp = sp();
            } else if (z3) {
                viewSp = (View) this.LLJZIJLIL.getValue();
            }
        }
        if (c0i40 instanceof AbstractC455680Htu) {
            if (viewSp != null) {
                C786410Ut5.I7(new AbS323S0300000_6(this, c0i40, viewSp, 1), viewSp);
            }
        } else if (c0i40 instanceof C0I3R) {
            if (viewSp == null) {
                return;
            }
            C786410Ut5.I7(new AbS498S0200000_6(this, c0i40, 3), viewSp);
        } else if (Intrinsics.LJFF(c0i40, C0I3L.LIZ)) {
        } else {
            throw new C1954807lC();
        }
    }
}
