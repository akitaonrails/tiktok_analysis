package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo;

import X.AbstractC1585810rMx;
import X.C01GW;
import X.C03DO;
import X.C09RD;
import X.C09RE;
import X.C0AIO;
import X.C0DXR;
import X.C0N0Y;
import X.C0OB8;
import X.C0S7E;
import X.C0SDJ;
import X.C109100bB;
import X.C1206504nn;
import X.C1308910kAL;
import X.C1361230lWj;
import X.C1386160mAw;
import X.C13DA;
import X.C13LE;
import X.C13LP;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1588330rR1;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C1845507Kr;
import X.C1888107aR;
import X.C19364210pM;
import X.C1954807lC;
import X.C20600815jK;
import X.C2097608Jq;
import X.C21613119iD;
import X.C21689219uU;
import X.C21694819vO;
import X.C21695119vR;
import X.C21696019va;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C278600Avy;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C452501pT;
import X.C584850Mwl;
import X.C628500Oky;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C705700RmC;
import X.C714800S2c;
import X.C720360SNm;
import X.C721220SQu;
import X.C723830SaL;
import X.C724270Sb3;
import X.C725890Sdf;
import X.C729510SjV;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19364110pL;
import X.EnumC714820S2e;
import X.InterfaceC1361270lWn;
import X.InterfaceC1588310rQz;
import X.InterfaceC1588320rR0;
import X.InterfaceC1608300rxE;
import X.InterfaceC1891350zJl;
import X.InterfaceC21613319iF;
import X.InterfaceC21676519sR;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS3S0202000_16;
import Y.AsS58S0100000_33;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.friendstab.detail.FriendsV3CellDetailNavigateAbility;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3PhotoListScrollConfig;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3SharedElementSourceAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.IFriendsV3GestureHandleAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo.ui.PhotoModeCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3DetailBridgeAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AwS107S1200000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendV3PhotoAssem extends BaseFriendsV3CellUISlotAssem<FriendV3PhotoAssem, InterfaceC1361270lWn> implements FriendsV3CellPlayHostAbility, InterfaceC1588320rR0, FriendsV3CellDetailNavigateAbility, FriendsV3SharedElementSourceAbility, FriendsV3ViewStateProtocol, InterfaceC1608300rxE {
    public ViewOnAttachStateChangeListenerC20604515jv LLJLL;
    public C21696019va LLJZ;
    public RadiusLayout LLJZIJLIL;
    public C21613119iD LLL;
    public LinearLayout LLLF;
    public View LLLFZ;
    public View LLLI;
    public boolean LLLII;
    public long LLLIIII;
    public long LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS563S0100000_19(this, 1457));
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2208));
    public final C01GW LLJLILLLLZIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS279S0000000_33.get$arr$(138));
    public String LLJLLIL = "";
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2211));
    public final List<FrameLayout> LLLFF = new ArrayList();
    public final List<C21696019va> LLLFFI = new ArrayList();
    public final C630740Ooa LLLIL = C628500Oky.LIZ(new AwS563S0100000_19(this, 1459));
    public final C630740Ooa LLLILZ = C628500Oky.LIZ(new AwS577S0100000_33(this, 2207));
    public final C630740Ooa LLLILZJ = C628500Oky.LIZ(new AwS577S0100000_33(this, 2209));
    public final C630740Ooa LLLILZLLLI = C628500Oky.LIZ(new AwS563S0100000_19(this, 1458));
    public final C630740Ooa LLLIZZ = C628500Oky.LIZ(new AwS577S0100000_33(this, 2213));
    public final C630740Ooa LLLJ = C628500Oky.LIZ(new AwS577S0100000_33(this, 2212));
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2214));
    public final C01GW LLLJL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(324));

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final boolean E6() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void Hh(AwS107S1200000_24 awS107S1200000_24) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cb5;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3SharedElementSourceAbility
    public final View W8() {
        return findViewByPosition(0);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void bk() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final Surface getSurface() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final View kG2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void onPlaying(String str, C1480430ocz c1480430ocz) {
    }

    public final boolean Bp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return (c724270Sb3 != null ? c724270Sb3.LL : null) instanceof C1361230lWj;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cb5, new AwS577S0100000_33(this, 2210));
    }

    public final Aweme LJIIIIZZ() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C0OB8) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.detail.FriendsV3CellDetailNavigateAbility
    public final void SH1() {
        Pair<Integer, View> pair;
        C724270Sb3 c724270Sb3 = this.LLJI;
        int i = C19364210pM.LIZ[up((InterfaceC1361270lWn) (c724270Sb3 != null ? c724270Sb3.LL : null)).ordinal()];
        if (i == 1) {
            pair = new Pair<>(0, this.LLJZ);
        } else if (i == 2) {
            pair = sp(this.LLL, new AwS595S0100000_16(this, 225));
        } else {
            if (i != 3) {
                throw new C1954807lC();
            }
            pair = sp(this.LLJLL, new AwS608S0100000_29(this, 595));
        }
        Ep(pair.getFirst().intValue(), pair.getSecond());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        ((ArrayList) this.LLLFF).clear();
        ((ArrayList) this.LLLFFI).clear();
        FriendsV3FeedListAbility friendsV3FeedListAbility = (FriendsV3FeedListAbility) this.LLLIL.getValue();
        if (friendsV3FeedListAbility != null) {
            friendsV3FeedListAbility.f52((AbstractC1585810rMx) this.LLLJIL.getValue());
        }
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3CellPlayHostAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3CellDetailNavigateAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3SharedElementSourceAbility.class, null);
        }
        InterfaceC665370Q7z interfaceC665370Q7z2 = (InterfaceC665370Q7z) this.LLJL.getValue();
        if (interfaceC665370Q7z2 != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7z2, FriendsV3ViewStateProtocol.class, this);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        C20600815jK<InterfaceC1891350zJl> state;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return;
        }
        state.LJFF(null);
    }

    public final FrameLayout yp() {
        return (FrameLayout) this.LLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final List<View> AG0() {
        return Collections.singletonList(yp());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final FrameLayout M4() {
        return yp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7z, FriendsV3ViewStateProtocol.class, C1697810uHb.LJIILJJIL(this));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3CellPlayHostAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3SharedElementSourceAbility.class, null, null);
        }
    }

    public static EnumC19364110pL up(InterfaceC1361270lWn interfaceC1361270lWn) {
        if (C729510SjV.LJJIJIL(interfaceC1361270lWn.getAweme())) {
            return EnumC19364110pL.SINGLE_PHOTO;
        }
        int iLIZ = C0S7E.LIZ(interfaceC1361270lWn.getAweme());
        if (iLIZ == 1) {
            return EnumC19364110pL.SINGLE_PHOTO;
        }
        if (iLIZ <= 4) {
            return EnumC19364110pL.HORIZONTAL_SCROLL_VIEW;
        }
        return EnumC19364110pL.POWER_LIST;
    }

    @Override // X.InterfaceC1588320rR0
    public final void LLJ(int i) {
        Object obj;
        LinearLayout linearLayout;
        FrameLayout frameLayoutTp;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scrollToPosition,position:");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i < 0) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        int i2 = C19364210pM.LIZ[up((InterfaceC1361270lWn) obj).ordinal()];
        if (i2 != 2) {
            if (i2 == 3 && (viewOnAttachStateChangeListenerC20604515jv = this.LLJLL) != null) {
                Gp(viewOnAttachStateChangeListenerC20604515jv, i, 64);
                return;
            }
            return;
        }
        C21613119iD c21613119iD = this.LLL;
        if (c21613119iD == null || (linearLayout = this.LLLF) == null || (frameLayoutTp = tp(i, linearLayout)) == null) {
            return;
        }
        c21613119iD.scrollBy((frameLayoutTp.getRight() - c21613119iD.getScrollX()) - (c21613119iD.getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64))), 0);
    }

    @Override // X.InterfaceC1588320rR0
    public final View findViewByPosition(int i) {
        Object obj;
        RecyclerView.LayoutManager layoutManager;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        int i2 = C19364210pM.LIZ[up((InterfaceC1361270lWn) obj).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJLL;
                    if (viewOnAttachStateChangeListenerC20604515jv == null || (layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager()) == null) {
                        return null;
                    }
                    return layoutManager.findViewByPosition(i);
                }
                throw new C1954807lC();
            }
            LinearLayout linearLayout = this.LLLF;
            if (linearLayout == null) {
                return null;
            }
            return tp(i, linearLayout);
        }
        return this.LLJZ;
    }

    @Override // X.InterfaceC1608300rxE
    public final boolean o5(MotionEvent motionEvent) {
        Object obj;
        ViewGroup viewGroup;
        int i = 0;
        if (motionEvent == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldHandleSingleTap, x:");
        sbLIZ.append(motionEvent.getRawX());
        sbLIZ.append(",y:");
        sbLIZ.append(motionEvent.getRawY());
        C2188811AlT.LIZIZ(sbLIZ);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        int i2 = C19364210pM.LIZ[up((InterfaceC1361270lWn) obj).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJLL;
                    if (viewOnAttachStateChangeListenerC20604515jv == null) {
                        return false;
                    }
                    RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager) || layoutManager == null) {
                        return false;
                    }
                    int[] iArr = new int[2];
                    viewOnAttachStateChangeListenerC20604515jv.getLocationOnScreen(iArr);
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    float rawX = motionEvent.getRawX() - i3;
                    float rawY = motionEvent.getRawY() - i4;
                    View viewFindChildViewUnder = viewOnAttachStateChangeListenerC20604515jv.findChildViewUnder(rawX, rawY);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("shouldHandleSingleTap for photo in recyclerView, eventX:");
                    sbLIZ2.append(rawX);
                    sbLIZ2.append(", eventY:");
                    sbLIZ2.append(rawY);
                    sbLIZ2.append(", childView=");
                    sbLIZ2.append(viewFindChildViewUnder);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (viewFindChildViewUnder != null) {
                        Ep(layoutManager.getPosition(viewFindChildViewUnder), viewFindChildViewUnder);
                        return true;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                C21613119iD c21613119iD = this.LLL;
                if (c21613119iD == null) {
                    return false;
                }
                int leftFirstVisibleChildPosition = c21613119iD.getLeftFirstVisibleChildPosition();
                int rightMostChildPosition = c21613119iD.getRightMostChildPosition();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("shouldHandleSingleTap for photo in scrollable view,firstIndex:");
                sbLIZ3.append(leftFirstVisibleChildPosition);
                sbLIZ3.append(",endIndex:");
                sbLIZ3.append(rightMostChildPosition);
                C2188811AlT.LIZIZ(sbLIZ3);
                View childAt = c21613119iD.getChildAt(0);
                if (!(childAt instanceof ViewGroup) || (viewGroup = (ViewGroup) childAt) == null) {
                    return false;
                }
                int childCount = viewGroup.getChildCount();
                if (leftFirstVisibleChildPosition > rightMostChildPosition || leftFirstVisibleChildPosition < 0 || leftFirstVisibleChildPosition > childCount || rightMostChildPosition < 0 || rightMostChildPosition > childCount) {
                    return false;
                }
                Iterator<View> it2 = new C09RD(viewGroup).iterator();
                int i5 = 0;
                while (true) {
                    C09RE c09re = (C09RE) it2;
                    if (!c09re.hasNext()) {
                        return false;
                    }
                    Object next = c09re.next();
                    if (i5 >= 0) {
                        if (next instanceof C21696019va) {
                            if (leftFirstVisibleChildPosition <= rightMostChildPosition) {
                                while (true) {
                                    View childAt2 = viewGroup.getChildAt(leftFirstVisibleChildPosition);
                                    if (childAt2 == null) {
                                        return false;
                                    }
                                    if ((childAt2 instanceof C21696019va) && C1386160mAw.LIZLLL(motionEvent, childAt2)) {
                                        int i6 = leftFirstVisibleChildPosition - i5;
                                        if (i6 >= 0) {
                                            i = i6;
                                        }
                                        Ep(i, childAt2);
                                        return true;
                                    }
                                    if (leftFirstVisibleChildPosition == rightMostChildPosition) {
                                        break;
                                    }
                                    leftFirstVisibleChildPosition++;
                                }
                            }
                        } else {
                            i5++;
                        }
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        } else {
            C21696019va c21696019va = this.LLJZ;
            if (c21696019va != null && C1386160mAw.LIZLLL(motionEvent, c21696019va)) {
                Ep(0, c21696019va);
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 400));
        view.findViewById(R.id.ng8);
        this.LLJZ = (C21696019va) view.findViewById(R.id.vcd);
        RadiusLayout radiusLayout = (RadiusLayout) view.findViewById(R.id.lqs);
        if (radiusLayout != null) {
            radiusLayout.LIZ(0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            C1386160mAw.LIZ(radiusLayout);
        } else {
            radiusLayout = null;
        }
        this.LLJZIJLIL = radiusLayout;
        C21613119iD c21613119iD = (C21613119iD) view.findViewById(R.id.jrp);
        this.LLL = c21613119iD;
        if (c21613119iD != null) {
            c21613119iD.setScrollListener(new InterfaceC21613319iF() { // from class: X.19iE
                @Override // X.InterfaceC21613319iF
                public final void LIZIZ() {
                    this.LIZ.LLLIIL = true;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
                @Override // X.InterfaceC21613319iF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.EnumC1087340eOy r7, X.EnumC21612919iB r8) {
                    /*
                        r6 = this;
                        com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo.FriendV3PhotoAssem r5 = r6.LIZ
                        long r3 = r5.LLLIIIIL
                        r1 = 0
                        int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                        if (r0 != 0) goto L13
                        long r2 = java.lang.System.currentTimeMillis()
                        long r0 = r5.LLLIIII
                        long r2 = r2 - r0
                        r5.LLLIIIIL = r2
                    L13:
                        X.0eOy r0 = X.EnumC1087340eOy.IDLE
                        if (r7 != r0) goto L55
                        if (r8 == 0) goto L33
                        int[] r1 = X.C21613019iC.LIZ
                        int r0 = r8.ordinal()
                        r1 = r1[r0]
                        r0 = 1
                        if (r1 == r0) goto L30
                        r0 = 2
                        if (r1 == r0) goto L36
                        r0 = 3
                        if (r1 == r0) goto L33
                        X.07lC r0 = new X.07lC
                        r0.<init>()
                        throw r0
                    L30:
                        java.lang.String r3 = "left"
                        goto L38
                    L33:
                        java.lang.String r3 = ""
                        goto L38
                    L36:
                        java.lang.String r3 = "right"
                    L38:
                        X.19iB r0 = X.EnumC21612919iB.LEFT
                        if (r8 != r0) goto L56
                        com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo.FriendV3PhotoAssem r0 = r6.LIZ
                        X.19iD r0 = r0.LLL
                        if (r0 == 0) goto L61
                        int r2 = r0.getLeftFirstVisibleChildPosition()
                    L46:
                        com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo.FriendV3PhotoAssem r1 = r6.LIZ
                        boolean r0 = r1.Bp()
                        if (r0 != 0) goto L50
                        int r2 = r2 + 1
                    L50:
                        java.lang.String r0 = "manual_click"
                        r1.Fp(r2, r3, r0)
                    L55:
                        return
                    L56:
                        com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo.FriendV3PhotoAssem r0 = r6.LIZ
                        X.19iD r0 = r0.LLL
                        if (r0 == 0) goto L61
                        int r2 = r0.getRightMostChildPosition()
                        goto L46
                    L61:
                        r2 = -1
                        goto L46
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C21613219iE.LIZ(X.0eOy, X.19iB):void");
                }
            });
        }
        this.LLLF = (LinearLayout) view.findViewById(R.id.jr8);
        if (C278600Avy.LIZ()) {
            View viewLIZ = C03DO.LIZ(yp(), null);
            C786410Ut5.LJLLLLLL(8, viewLIZ);
            this.LLLFZ = viewLIZ;
            yp().addView(this.LLLFZ);
            LinearLayout linearLayout = this.LLLF;
            if (linearLayout != null) {
                View viewLIZ2 = C03DO.LIZ(linearLayout, null);
                C786410Ut5.LJLLLLLL(8, viewLIZ2);
                this.LLLI = viewLIZ2;
                linearLayout.addView(viewLIZ2);
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.qcz);
        this.LLJLL = viewOnAttachStateChangeListenerC20604515jv2;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PhotoModeCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.setTag(R.id.rnd, C1558520qew.LJIIL(this));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.setNestedScrollingEnabled(false);
        }
        Context context = getContext();
        if (context != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLJLL) != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new CustomPageLimitLinearLayoutManager(((FriendsV3PhotoListScrollConfig) C21695119vR.LIZIZ.getValue()).idleExtraLayoutSpaceFactor, context));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
            viewOnAttachStateChangeListenerC20604515jv5.setOnScrollListener((AbstractC1585810rMx) this.LLLJL.getValue());
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLJLL;
        final C21689219uU c21689219uU = new C21689219uU(viewOnAttachStateChangeListenerC20604515jv6);
        c21689219uU.LIZIZ = new AwS577S0100000_33(this, 3861);
        viewOnAttachStateChangeListenerC20604515jv6.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.19uT
            @Override // X.InterfaceC21676519sR
            public final void m3(View view2) {
            }

            @Override // X.InterfaceC21676519sR
            public final void g5(View view2) {
                Function0<Unit> function0;
                C21689219uU c21689219uU2 = c21689219uU;
                int childAdapterPosition = c21689219uU2.LIZ.getChildAdapterPosition(view2);
                if (c21689219uU2.LIZ.getAdapter() != null && childAdapterPosition == r0.getItemCount() - 1 && (function0 = c21689219uU2.LIZIZ) != null) {
                    function0.invoke();
                }
            }
        });
        FriendsV3FeedListAbility friendsV3FeedListAbility = (FriendsV3FeedListAbility) this.LLLIL.getValue();
        if (friendsV3FeedListAbility != null) {
            friendsV3FeedListAbility.OD((AbstractC1585810rMx) this.LLLJIL.getValue());
        }
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3CellDetailNavigateAbility.class, null, null);
        }
        IFriendsV3GestureHandleAbility iFriendsV3GestureHandleAbility = (IFriendsV3GestureHandleAbility) this.LLLILZJ.getValue();
        if (iFriendsV3GestureHandleAbility != null) {
            iFriendsV3GestureHandleAbility.AY1(this);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv7 = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20604515jv7 != null) {
            viewOnAttachStateChangeListenerC20604515jv7.addOnScrollListener(new AsS58S0100000_33(this, 2));
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLILLLLZIIL.getValue(), new C2217381BqS() { // from class: X.19vP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SDJ) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS321S0000000_33.get$arr$(23), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        Object obj2;
        PhotoModeImage photoModeImage;
        boolean z;
        boolean z2;
        int i;
        String aid;
        Aweme awemeLIZIZ;
        UserStory userStory;
        Long lValueOf;
        boolean z3;
        int iLIZ;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int iLIZ2;
        int iLIZIZ;
        int iLIZIZ2;
        boolean z8;
        boolean z9;
        int iLIZIZ3;
        int iLIZIZ4;
        boolean z10;
        boolean z11;
        int iLIZ3;
        C20600815jK<InterfaceC1891350zJl> state;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImage photoModeImage2;
        boolean z12;
        final int iIntValue;
        int i2;
        int i3;
        int i4;
        View view;
        LinearLayout linearLayout;
        InterfaceC1361270lWn interfaceC1361270lWn = (InterfaceC1361270lWn) obj;
        this.LLLIILIL = false;
        this.LLLIIIL = false;
        C21613119iD c21613119iD = this.LLL;
        if (c21613119iD != null) {
            c21613119iD.LLILZ = false;
        }
        if (C278600Avy.LIZ()) {
            View view2 = this.LLLFZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            View view3 = this.LLLI;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
        } else {
            View viewFindViewWithTag = yp().findViewWithTag("repost_line_tag");
            if (viewFindViewWithTag != null) {
                C786410Ut5.LJJJZ(viewFindViewWithTag, yp());
            }
        }
        C01GW c01gw = C0AIO.LIZ;
        if (!((Boolean) c01gw.getValue()).booleanValue()) {
            LinearLayout linearLayout2 = this.LLLF;
            if (linearLayout2 != null) {
                C786410Ut5.LJJJJJL(linearLayout2);
            }
            if (C278600Avy.LIZ() && (view = this.LLLI) != null && (linearLayout = this.LLLF) != null) {
                linearLayout.addView(view);
            }
        }
        C21613119iD c21613119iD2 = this.LLL;
        if (c21613119iD2 != null) {
            c21613119iD2.scrollTo(0, 0);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        AttributeSet attributeSet = null;
        if (c724270Sb3 != null) {
            obj2 = c724270Sb3.LL;
        } else {
            obj2 = null;
        }
        C1845507Kr.LIZ.remove(((C0OB8) obj2).getAweme().getAid());
        EnumC19364110pL enumC19364110pLUp = up(interfaceC1361270lWn);
        C21696019va c21696019va = this.LLJZ;
        if (c21696019va != null) {
            if (EnumC19364110pL.SINGLE_PHOTO == enumC19364110pLUp) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            C786410Ut5.c0(c21696019va, i4);
        }
        C21613119iD c21613119iD3 = this.LLL;
        if (c21613119iD3 != null) {
            if (EnumC19364110pL.HORIZONTAL_SCROLL_VIEW == enumC19364110pLUp) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            int visibility = c21613119iD3.getVisibility();
            c21613119iD3.setVisibility(i3);
            C1602160rnK.LIZIZ(visibility, i3, c21613119iD3);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            if (EnumC19364110pL.POWER_LIST == enumC19364110pLUp) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLF(i2, viewOnAttachStateChangeListenerC20604515jv2);
        }
        RadiusLayout radiusLayout = this.LLJZIJLIL;
        if (radiusLayout != null) {
            C786410Ut5.LLZZ(radiusLayout, 8);
        }
        int i5 = C19364210pM.LIZ[enumC19364110pLUp.ordinal()];
        int i6 = -1;
        int i7 = 80;
        if (i5 != 1) {
            int i8 = 3;
            if (i5 != 2) {
                if (i5 == 3) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJLL;
                    if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                        C20600815jK<InterfaceC1891350zJl> state2 = viewOnAttachStateChangeListenerC20604515jv3.getState();
                        if (state2 != null) {
                            state2.LJFF(null);
                        }
                        if (!Bp()) {
                            i7 = 68;
                        }
                        viewOnAttachStateChangeListenerC20604515jv3.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i7))), viewOnAttachStateChangeListenerC20604515jv3.getPaddingTop(), viewOnAttachStateChangeListenerC20604515jv3.getPaddingRight(), viewOnAttachStateChangeListenerC20604515jv3.getPaddingBottom());
                        if (viewOnAttachStateChangeListenerC20604515jv3.getItemDecorationCount() > 0) {
                            viewOnAttachStateChangeListenerC20604515jv3.removeItemDecorationAt(0);
                        }
                        if (Bp()) {
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, viewOnAttachStateChangeListenerC20604515jv3.getContext());
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            viewOnAttachStateChangeListenerC20604515jv3.addItemDecoration(new C0DXR(iIntValue) { // from class: X.03oc
                                public final int LL = 4;
                                public final int LLILLJJLI = 8;
                                public final Paint LLILLL;

                                {
                                    Paint paint = new Paint();
                                    paint.setAntiAlias(true);
                                    paint.setStyle(Paint.Style.FILL);
                                    paint.setColor(iIntValue);
                                    this.LLILLL = paint;
                                }

                                @Override // X.C0DXR
                                public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                                    if (recyclerView.getChildCount() == 0) {
                                        return;
                                    }
                                    View childAt = recyclerView.getChildAt(0);
                                    if (recyclerView.getChildAdapterPosition(childAt) != 0) {
                                        return;
                                    }
                                    int left = childAt.getLeft() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLJJLI))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL))));
                                    canvas.drawRect(left, 0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL))) + left, recyclerView.getHeight(), this.LLILLL);
                                }
                            });
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    PhotoModeImageInfo photoModeImageInfo = interfaceC1361270lWn.getAweme().getPhotoModeImageInfo();
                    if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                        Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
                        int i9 = 0;
                        while (it2.hasNext()) {
                            it2.next();
                            int i10 = i9 + 1;
                            if (i9 >= 0) {
                                PhotoModeImageInfo photoModeImageInfo2 = interfaceC1361270lWn.getAweme().getPhotoModeImageInfo();
                                if (photoModeImageInfo2 != null) {
                                    photoModeImage2 = (PhotoModeImage) C13LP.LJJJLZIJ(i9, C720360SNm.LIZLLL(photoModeImageInfo2));
                                } else {
                                    photoModeImage2 = null;
                                }
                                C0S7E.LIZ(interfaceC1361270lWn.getAweme());
                                C721220SQu.LJFF(i9, interfaceC1361270lWn.getAweme());
                                Aweme aweme = interfaceC1361270lWn.getAweme();
                                if (Bp() && i9 == 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                arrayList.add(new C21694819vO(photoModeImage2, i9, aweme, interfaceC1361270lWn, z12));
                                i9 = i10;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJLL;
                    if (viewOnAttachStateChangeListenerC20604515jv4 != null && (state = viewOnAttachStateChangeListenerC20604515jv4.getState()) != null) {
                        state.LIZLLL(arrayList, null);
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            PhotoModeImageInfo photoModeImageInfo3 = interfaceC1361270lWn.getAweme().getPhotoModeImageInfo();
            if (photoModeImageInfo3 != null) {
                List<PhotoModeImage> listLIZLLL = C720360SNm.LIZLLL(photoModeImageInfo3);
                int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
                zp(iLIZIZ5, this.LLLF);
                boolean zBooleanValue = ((Boolean) c01gw.getValue()).booleanValue();
                int i11 = -2;
                int i12 = 17;
                int i13 = 30;
                int i14 = R.id.u3f;
                if (zBooleanValue) {
                    LinearLayout linearLayout3 = this.LLLF;
                    if (linearLayout3 != null) {
                        int size = listLIZLLL.size();
                        while (((ArrayList) this.LLLFFI).size() > size) {
                            List<C21696019va> list = this.LLLFFI;
                            C786410Ut5.LJJL((View) ListProtector.remove(list, C1697810uHb.LJIIJ(list)), linearLayout3);
                        }
                        while (((ArrayList) this.LLLFFI).size() < size) {
                            List<C21696019va> list2 = this.LLLFFI;
                            C21696019va c21696019va2 = new C21696019va(30, LJJIJL().getContext(), null);
                            c21696019va2.setId(R.id.u3f);
                            linearLayout3.addView(c21696019va2);
                            ((ArrayList) list2).add(c21696019va2);
                        }
                        int i15 = 0;
                        for (PhotoModeImage photoModeImage3 : listLIZLLL) {
                            int i16 = i15 + 1;
                            if (i15 >= 0) {
                                PhotoModeImage photoModeImage4 = photoModeImage3;
                                int iIntValue2 = ((Number) C714800S2c.LIZ(photoModeImage4.aspectRatio, iLIZIZ5, EnumC714820S2e.MULTI).getFirst()).intValue();
                                if (C1206504nn.LIZ() && C1386160mAw.LJ(interfaceC1361270lWn.getAweme())) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (C1206504nn.LIZ() && Bp() && i15 == 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                C21696019va c21696019va3 = (C21696019va) ListProtector.get(this.LLLFFI, i15);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("positon_");
                                sbLIZ.append(i15);
                                c21696019va3.setTag(C2188811AlT.LIZIZ(sbLIZ));
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
                                layoutParams.gravity = i12;
                                if (i15 == 0) {
                                    iLIZIZ3 = 0;
                                } else {
                                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i8)));
                                }
                                if (i15 == C0S7E.LIZ(interfaceC1361270lWn.getAweme()) - 1) {
                                    iLIZIZ4 = 0;
                                } else {
                                    iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i8)));
                                }
                                layoutParams.setMargins(iLIZIZ3, 0, iLIZIZ4, 0);
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21696019va3);
                                c21696019va3.setLayoutParams(layoutParams);
                                Pair pair = new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(iLIZIZ5));
                                Aweme aweme2 = interfaceC1361270lWn.getAweme();
                                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                if (Bp() && i15 == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if ((!z8 || i15 != 0) && !z9) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (z8) {
                                    iLIZ3 = C0S7E.LIZ(interfaceC1361270lWn.getAweme());
                                } else {
                                    iLIZ3 = 0;
                                }
                                C21696019va.LIZJ(c21696019va3, photoModeImage4, i15, pair, aweme2, scaleType, z10, this, z11, iLIZ3, false, z9, 512);
                                c21696019va3.setTransitionName(C1888107aR.LIZIZ(Integer.valueOf(i15), interfaceC1361270lWn.getAweme().getAid()));
                                i15 = i16;
                                i8 = 3;
                                i12 = 17;
                                i11 = -2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        return;
                    }
                    return;
                }
                int i17 = 0;
                for (PhotoModeImage photoModeImage5 : listLIZLLL) {
                    int i18 = i17 + 1;
                    if (i17 >= 0) {
                        PhotoModeImage photoModeImage6 = photoModeImage5;
                        C21696019va c21696019va4 = new C21696019va(i13, LJJIJL().getContext(), attributeSet);
                        c21696019va4.setId(i14);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("positon_");
                        sbLIZ2.append(i17);
                        c21696019va4.setTag(C2188811AlT.LIZIZ(sbLIZ2));
                        if (C1206504nn.LIZ() && C1386160mAw.LJ(interfaceC1361270lWn.getAweme())) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        C21696019va c21696019va5 = (C21696019va) c21696019va4.findViewById(i14);
                        if (Bp() && i17 == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (C1206504nn.LIZ() && z5) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        Pair pair2 = new Pair(Integer.valueOf(((Number) C714800S2c.LIZ(photoModeImage6.aspectRatio, iLIZIZ5, EnumC714820S2e.MULTI).getFirst()).intValue()), Integer.valueOf(iLIZIZ5));
                        Aweme aweme3 = interfaceC1361270lWn.getAweme();
                        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
                        if ((!z4 || i17 != 0) && !z6) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (z4) {
                            iLIZ2 = C0S7E.LIZ(interfaceC1361270lWn.getAweme());
                        } else {
                            iLIZ2 = 0;
                        }
                        int i19 = i17;
                        C21696019va.LIZJ(c21696019va5, photoModeImage6, i19, pair2, aweme3, scaleType2, z5, this, z7, iLIZ2, false, z6, 512);
                        c21696019va4.setTransitionName(C1888107aR.LIZIZ(Integer.valueOf(i19), interfaceC1361270lWn.getAweme().getAid()));
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 17;
                        if (i19 == 0) {
                            iLIZIZ = 0;
                        } else {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
                        }
                        if (i19 == C0S7E.LIZ(interfaceC1361270lWn.getAweme()) - 1) {
                            iLIZIZ2 = 0;
                        } else {
                            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
                        }
                        layoutParams2.setMargins(iLIZIZ, 0, iLIZIZ2, 0);
                        LinearLayout linearLayout4 = this.LLLF;
                        if (linearLayout4 != null) {
                            linearLayout4.addView(c21696019va4, layoutParams2);
                        }
                        i17 = i18;
                        i13 = 30;
                        i14 = R.id.u3f;
                        attributeSet = null;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        if (!Bp()) {
            i7 = 68;
        }
        C725890Sdf.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i7))), this.LLJZ);
        PhotoModeImageInfo photoModeImageInfo4 = interfaceC1361270lWn.getAweme().getPhotoModeImageInfo();
        if (photoModeImageInfo4 != null && (photoModeImage = (PhotoModeImage) C13LP.LJJJLZIJ(0, C720360SNm.LIZLLL(photoModeImageInfo4))) != null) {
            Float f = photoModeImage.aspectRatio;
            int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(237));
            if (f != null && f.floatValue() > 0.0f) {
                iLIZIZ6 = f.floatValue() > 1.0f ? C714800S2c.LIZJ() : C714800S2c.LIZLLL();
            }
            int iIntValue3 = ((Number) C714800S2c.LIZ(photoModeImage.aspectRatio, iLIZIZ6, EnumC714820S2e.SINGLE).getSecond()).intValue();
            zp(iIntValue3, yp());
            if (C1206504nn.LIZ() && C1386160mAw.LJ(interfaceC1361270lWn.getAweme())) {
                z = true;
            } else {
                z = false;
            }
            if (C1206504nn.LIZ() && Bp()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C21696019va c21696019va6 = this.LLJZ;
            if (c21696019va6 != null) {
                Pair pair3 = new Pair(Integer.valueOf(iLIZIZ6), Integer.valueOf(iIntValue3));
                Aweme aweme4 = interfaceC1361270lWn.getAweme();
                ImageView.ScaleType scaleType3 = ImageView.ScaleType.FIT_CENTER;
                boolean zBp = Bp();
                if (!z && !z2) {
                    z3 = false;
                } else {
                    z3 = true;
                    if (z) {
                        iLIZ = C0S7E.LIZ(interfaceC1361270lWn.getAweme());
                    }
                    i = 8;
                    C21696019va.LIZJ(c21696019va6, photoModeImage, 0, pair3, aweme4, scaleType3, zBp, this, z3, iLIZ, false, z2, 512);
                }
                iLIZ = 0;
                i = 8;
                C21696019va.LIZJ(c21696019va6, photoModeImage, 0, pair3, aweme4, scaleType3, zBp, this, z3, iLIZ, false, z2, 512);
            } else {
                i = 8;
            }
            C21696019va c21696019va7 = this.LLJZ;
            if (c21696019va7 != null) {
                c21696019va7.setTransitionName(C1888107aR.LIZIZ(0, interfaceC1361270lWn.getAweme().getAid()));
            }
            Aweme aweme5 = interfaceC1361270lWn.getAweme();
            RadiusLayout radiusLayout2 = this.LLJZIJLIL;
            if (radiusLayout2 != null) {
                if (aweme5 != null && (aid = aweme5.getAid()) != null && (awemeLIZIZ = C1588330rR1.LIZIZ(aid)) != null && (userStory = awemeLIZIZ.getUserStory()) != null && (lValueOf = Long.valueOf(userStory.getTotalCount())) != null && lValueOf.longValue() > 1) {
                    ViewGroup.LayoutParams layoutParams3 = radiusLayout2.getLayoutParams();
                    layoutParams3.height = (int) (iIntValue3 * 0.9f);
                    C786410Ut5.b7(radiusLayout2, layoutParams3);
                    if (!C444960Hcc.LIZIZ()) {
                        i6 = 1;
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(radiusLayout2);
                    radiusLayout2.setTranslationX((r4 + iLIZIZ6) * i6);
                    C786410Ut5.yd(radiusLayout2, (iIntValue3 - r1) / 2.0f);
                    C786410Ut5.LLZZ(radiusLayout2, 0);
                    return;
                }
                C786410Ut5.LLZZ(radiusLayout2, i);
            }
        }
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    public static FrameLayout tp(int i, LinearLayout linearLayout) {
        int childCount = linearLayout.getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = linearLayout.getChildAt(i3);
            if (childAt instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) childAt;
                if (frameLayout.getId() != R.id.u3f) {
                    continue;
                } else {
                    if (i2 == i) {
                        return frameLayout;
                    }
                    i2++;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final void EK2(View view, boolean z) {
        if (z) {
            this.LLLIIII = System.currentTimeMillis();
            this.LLLIIIIL = 0L;
        }
    }

    public final void Ep(int i, View view) {
        Object obj;
        View viewFindViewById;
        FriendsV3DetailBridgeAbility friendsV3DetailBridgeAbility = (FriendsV3DetailBridgeAbility) this.LLLILZLLLI.getValue();
        if (friendsV3DetailBridgeAbility != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            View view2 = null;
            Object obj2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            InterfaceC1361270lWn interfaceC1361270lWn = (InterfaceC1361270lWn) obj;
            C0N0Y c0n0y = (C0N0Y) this.LLLIZZ.getValue();
            if (view != null) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                if (C729510SjV.LJJIJIL(((C0OB8) obj2).getAweme()) && (viewFindViewById = view.findViewById(R.id.vmb)) != null) {
                    view = viewFindViewById;
                }
                view2 = view;
            }
            friendsV3DetailBridgeAbility.wz1(interfaceC1361270lWn, c0n0y, null, view2, Intrinsics.LJFF(((C0SDJ) ((AssemViewModel) this.LLJLILLLLZIIL.getValue()).getState()).LL, Boolean.TRUE), Integer.valueOf(i), this, (InterfaceC1588310rQz) this.LLJLIL.getValue());
        }
    }

    public final Pair<Integer, View> sp(View view, Function1<? super Integer, ? extends View> function1) {
        Pair<Integer, View> pair = new Pair<>(0, function1.invoke(0));
        if (view == null) {
            return pair;
        }
        int iLIZ = C0S7E.LIZ(LJIIIIZZ());
        View view2 = null;
        int i = -1;
        for (int i2 = 0; i2 < iLIZ; i2++) {
            View viewInvoke = function1.invoke(Integer.valueOf(i2));
            if (viewInvoke != null) {
                if (Ap(view, viewInvoke, true)) {
                    return new Pair<>(Integer.valueOf(i2), viewInvoke);
                }
                if (i == -1 && Ap(view, viewInvoke, false)) {
                    i = i2;
                    view2 = viewInvoke;
                }
            }
        }
        if (i != -1 && view2 != null) {
            return new Pair<>(Integer.valueOf(i), view2);
        }
        return pair;
    }

    public final void zp(int i, ViewGroup viewGroup) {
        View view;
        if (viewGroup == null) {
            return;
        }
        if (C278600Avy.LIZ()) {
            if (viewGroup == yp()) {
                view = this.LLLFZ;
            } else {
                view = this.LLLI;
            }
            if (Bp()) {
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                    C725890Sdf.LIZLLL(i, view);
                    return;
                }
                return;
            }
            if (view == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, view);
            return;
        }
        if (Bp()) {
            View viewFindViewWithTag = viewGroup.findViewWithTag("repost_line_tag");
            if (viewFindViewWithTag != null) {
                C725890Sdf.LIZLLL(i, viewFindViewWithTag);
                return;
            } else {
                viewGroup.addView(C03DO.LIZ(viewGroup, Integer.valueOf(i)));
                return;
            }
        }
        View viewFindViewWithTag2 = viewGroup.findViewWithTag("repost_line_tag");
        if (viewFindViewWithTag2 == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(viewFindViewWithTag2, viewGroup);
    }

    public static boolean Ap(View view, View view2, boolean z) {
        int scrollX = view.getScrollX();
        int width = view.getWidth();
        int left = view2.getLeft();
        int right = view2.getRight();
        if (z) {
            if (left >= scrollX && right <= scrollX + width) {
                return true;
            }
            return false;
        }
        if (left <= width + scrollX && right >= scrollX) {
            return true;
        }
        return false;
    }

    public final void Fp(int i, String str, String str2) {
        String authorUid;
        Integer numValueOf;
        String requestId;
        String aid;
        C109100bB c109100bB = C109100bB.LIZ;
        C13DA c13da = new C13DA();
        Pair[] pairArr = new Pair[12];
        pairArr[0] = new Pair("enter_from", "homepage_friends");
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        Integer numValueOf2 = null;
        if (awemeLJIIIIZZ != null) {
            authorUid = AwemeExtKt.getAuthorUid(awemeLJIIIIZZ);
        } else {
            authorUid = null;
        }
        pairArr[1] = new Pair("author_id", authorUid);
        Aweme awemeLJIIIIZZ2 = LJIIIIZZ();
        if (awemeLJIIIIZZ2 != null) {
            numValueOf = Integer.valueOf(awemeLJIIIIZZ2.getAwemeType());
        } else {
            numValueOf = null;
        }
        pairArr[2] = new Pair("aweme_type", numValueOf);
        Aweme awemeLJIIIIZZ3 = LJIIIIZZ();
        if (awemeLJIIIIZZ3 != null) {
            requestId = awemeLJIIIIZZ3.getRequestId();
        } else {
            requestId = null;
        }
        pairArr[3] = new Pair("request_id", requestId);
        Aweme awemeLJIIIIZZ4 = LJIIIIZZ();
        if (awemeLJIIIIZZ4 != null) {
            aid = awemeLJIIIIZZ4.getAid();
        } else {
            aid = null;
        }
        pairArr[4] = new Pair("group_id", aid);
        Aweme awemeLJIIIIZZ5 = LJIIIIZZ();
        if (awemeLJIIIIZZ5 != null) {
            numValueOf2 = Integer.valueOf(C0S7E.LIZ(awemeLJIIIIZZ5));
        }
        pairArr[5] = new Pair("pic_cnt", numValueOf2);
        pairArr[6] = new Pair("log_pb", C584850Mwl.LIZ.LIZIZ(LJIIIIZZ().getRequestId()));
        pairArr[7] = new Pair("pic_location", Integer.valueOf(i));
        pairArr[8] = new Pair("action_type", str);
        pairArr[9] = new Pair("is_detail_page", CardStruct.IStatusCode.DEFAULT);
        pairArr[10] = new Pair("enter_method", str2);
        pairArr[11] = new Pair("first_manual_click_duration", Long.valueOf(this.LLLIIIIL));
        c13da.putAll(C2097608Jq.LJIIIIZZ(pairArr));
        Map mapBuild = c13da.build();
        c109100bB.getClass();
        C109100bB.LIZ("multi_photo_slide", mapBuild);
    }

    public final void Gp(RecyclerView recyclerView, int i, int i2) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
            View viewFindViewByPosition = layoutManager.findViewByPosition(i);
            if (viewFindViewByPosition == null) {
                recyclerView.scrollToPosition(i);
                HandlerHook.viewPost(recyclerView, new ARunnableS3S0202000_16(this, recyclerView, i, i2, 0));
            } else {
                recyclerView.smoothScrollBy(-((recyclerView.getWidth() - viewFindViewByPosition.getRight()) - iLIZIZ), 0);
            }
        }
    }
}
