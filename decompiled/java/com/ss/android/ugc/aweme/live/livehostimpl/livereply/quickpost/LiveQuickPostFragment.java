package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost;

import X.C01GW;
import X.C098200Yq;
import X.C0H6K;
import X.C0OM1;
import X.C0PEM;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1355400lNK;
import X.C1361400lX0;
import X.C13LE;
import X.C1444390ngr;
import X.C1444460ngy;
import X.C1685300txQ;
import X.C176600m4;
import X.C1813740xIa;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1DFH;
import X.C20642515q3;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C23250099c;
import X.C419910GdJ;
import X.C444910HcX;
import X.C452070Ho5;
import X.C452501pT;
import X.C485260J1g;
import X.C497740JfY;
import X.C724750Sbp;
import X.C786120Usc;
import X.C786410Ut5;
import X.C930940aKi;
import X.EnumC1813540xIG;
import X.InterfaceC1355390lNJ;
import X.InterfaceC1355420lNM;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2262081DgM;
import X.InterfaceC344240DeY;
import X.InterfaceC497601wk;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.GeneralHighlightRoomEndEvent;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PublishParams;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.ui.LivePostTagCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel.LiveQuickPostViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.text.u;
import tikcast.api.anchor.HashTag;
import wh6.AbS706S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveQuickPostFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final C1813740xIa LLJJJJLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/HELIOSZiklPyohLTUgMGEiPSwvIj88OzFiBSYlLRQ5ICw4GCo/PQkhKSIhLCEn";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 407));
    public final AssemVMLazy LLIZLLLIL;
    public int LLJ;
    public Function2<? super PostConfigModel, ? super Boolean, Unit> LLJI;
    public Function1<? super Integer, Unit> LLJIJIL;
    public Function0<Unit> LLJILJIL;
    public int LLJILJILJ;
    public String LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0xIa] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveQuickPostFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/quickpost/viewmodel/LiveQuickPostViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJLIIL = new Object() { // from class: X.0xIa
        };
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        Integer numLIZJ;
        String string = getString(this.LLJILJILJ == 1 ? 2131852357 : 2131855482);
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        PostConfigModel postConfigModelVR = VR();
        if (C176600m4.LIZIZ(postConfigModelVR != null ? Boolean.valueOf(postConfigModelVR.forceDarkMode) : null)) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zq, new C1361400lX0(getContext(), R.style.y0));
            c0om1.LIZJ(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
        } else {
            Context context = getContext();
            c0om1.LIZJ((context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.zq, context)) == null) ? 0 : numLIZJ.intValue());
        }
        PostConfigModel postConfigModelVR2 = VR();
        if (C176600m4.LIZIZ(postConfigModelVR2 != null ? Boolean.valueOf(postConfigModelVR2.showBackPress) : null)) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LJIIIIZZ = getString(2131823350);
            c1251150ifB.LIZJ(new AwS571S0100000_27(this, 399));
            c0om1.LJ(c1251150ifB);
            return c0om1;
        }
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB2.LJIIIIZZ = getString(2131823353);
        c1251150ifB2.LIZJ(new AwS571S0100000_27(this, 400));
        c0om1.LIZIZ(c1251150ifB2);
        return c0om1;
    }

    public final C1355400lNK UR() {
        return (C1355400lNK) this.LLJJI.getValue();
    }

    public final PostConfigModel VR() {
        return (PostConfigModel) this.LLIZ.getValue();
    }

    public final LiveQuickPostViewModel aS() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (LiveQuickPostViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ImageView imageView = (ImageView) this.LLJJIJIIJIL.getValue();
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        super.onDestroyView();
    }

    public LiveQuickPostFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveQuickPostViewModel.class);
        this.LLIZLLLIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS571S0100000_27(c19719912DlLIZ, 409), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 410), AFwS269S0000000_27.get$arr$(87));
        this.LLJ = EnumC1813540xIG.PUBLIC.getValue();
        this.LLJILLL = "";
        this.LLJJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 401));
        this.LLJJIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 408));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 406));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 405));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 402));
        this.LLJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 412));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 404));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 403));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 411));
    }

    public final List<HashTag> SR() {
        List<String> arrayList;
        C1355400lNK c1355400lNKUR = UR();
        if (c1355400lNKUR == null || (arrayList = c1355400lNKUR.getTagSpan()) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            HashTag hashTag = new HashTag();
            hashTag.text = str;
            arrayList2.add(hashTag);
        }
        return arrayList2;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        PostConfigModel postConfigModelVR;
        Map<String, String> map;
        super.onDestroy();
        if (this.LLJJ || (postConfigModelVR = VR()) == null || (map = postConfigModelVR.reportParams) == null) {
            return;
        }
        C485260J1g.LIZ.getClass();
        C20684815ws.LJIILLIIL("livesdk_anchor_close_video_post_page", map);
    }

    public static int WR(int i) {
        if (i != EnumC1813540xIG.PUBLIC.getValue()) {
            if (i == EnumC1813540xIG.FRIENDS.getValue()) {
                return R.raw.icon_person_arrow_left;
            }
            if (i == EnumC1813540xIG.ONLY_YOU.getValue()) {
                return R.raw.icon_lock_small;
            }
            return R.raw.icon_earth_w;
        }
        return R.raw.icon_earth_w;
    }

    public static String ZR(int i) {
        if (i == EnumC1813540xIG.PUBLIC.getValue()) {
            return C20642515q3.LJI(2131844947);
        }
        if (i == EnumC1813540xIG.FRIENDS.getValue()) {
            return C20642515q3.LJI(2131844949);
        }
        if (i == EnumC1813540xIG.ONLY_YOU.getValue()) {
            return C20642515q3.LJI(2131844950);
        }
        return C20642515q3.LJI(2131844947);
    }

    public final void dS(int i) {
        if (i == EnumC1813540xIG.PUBLIC.getValue()) {
            cS(ZR(i), false);
            bS(WR(i), false);
        } else {
            cS(ZR(i), true);
            bS(WR(i), true);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        Window window;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        PostConfigModel postConfigModelVR = VR();
        if (postConfigModelVR != null && (map = postConfigModelVR.reportParams) != null) {
            C485260J1g.LIZ.getClass();
            C20684815ws.LJIILLIIL("livesdk_anchor_enter_video_post_page", map);
        }
    }

    public final void bS(int i, boolean z) {
        int i2;
        if (z) {
            i2 = R.attr.a04;
        } else {
            i2 = R.attr.a1h;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(i2);
        TuxIconView tuxIconView = (TuxIconView) this.LLJJIJIL.getValue();
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    public final void cS(String str, boolean z) {
        if (z) {
            C444910HcX c444910HcX = new C444910HcX(str);
            c444910HcX.LIZ(42);
            C786410Ut5.s2(c444910HcX, new ForegroundColorSpan(C497740JfY.LIZLLL(R.attr.a04, getContext())), 0, str.length(), 33);
            TextView textView = (TextView) this.LLJJJ.getValue();
            if (textView != null) {
                textView.setText(c444910HcX);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) this.LLJJJ.getValue();
        if (textView2 == null) {
            return;
        }
        textView2.setText(str);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        String str;
        PublishParams publishParams;
        List<C1444390ngr> list;
        PublishParams publishParams2;
        List<String> list2;
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        PublishParams publishParams3;
        List<String> list3;
        PublishParams publishParams4;
        String str2;
        C1355400lNK c1355400lNKUR;
        super.onViewCreated(view, bundle);
        if (this.LLJILJILJ == 1) {
            aS().LLILLJJLI = new C1444460ngy(VR(), this, getActivity());
            InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room == null || room.getOwnerUserId() != UserService.getInstance().user().getCurrentUserId()) {
                currentUser.getUserAttr();
            }
        }
        AssemViewModel.selectSubscribe$default(aS(), new C2217381BqS() { // from class: X.0gLm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159020gGa) obj).LL;
            }
        }, null, this, null, new AwS606S0100000_27(new AwS606S0100000_27(this, 640), 319), 10, null);
        AssemViewModel.selectSubscribe$default(aS(), new C2217381BqS() { // from class: X.0gLn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159020gGa) obj).LLILLJJLI;
            }
        }, null, this, null, new AwS606S0100000_27(new AwS606S0100000_27(this, 641), 320), 10, null);
        DataChannelGlobal.LLILZ.BQ2(this, this, GeneralHighlightRoomEndEvent.class, new AwS591S0100000_12(this, 1220));
        PostConfigModel postConfigModelVR = VR();
        if (postConfigModelVR != null && (publishParams4 = postConfigModelVR.publishParams) != null && (str2 = publishParams4.defaultText) != null && (c1355400lNKUR = UR()) != null) {
            c1355400lNKUR.setText(str2);
        }
        C1355400lNK c1355400lNKUR2 = UR();
        if (c1355400lNKUR2 != null) {
            c1355400lNKUR2.addTextChangedListener(new C786120Usc(this, 21));
        }
        C1355400lNK c1355400lNKUR3 = UR();
        if (c1355400lNKUR3 != null) {
            c1355400lNKUR3.setOnTouchListener(new View.OnTouchListener() { // from class: X.0GhX
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                    if ((motionEvent.getAction() & 255) == 1) {
                        view2.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    view2.onTouchEvent(motionEvent);
                    return true;
                }
            });
        }
        PostConfigModel postConfigModelVR2 = VR();
        if (postConfigModelVR2 != null && (publishParams3 = postConfigModelVR2.publishParams) != null && (list3 = publishParams3.challenges) != null) {
            Iterator<String> it2 = list3.iterator();
            while (it2.hasNext()) {
                it2.next();
                final C1355400lNK c1355400lNKUR4 = UR();
                if (c1355400lNKUR4 != null) {
                    c1355400lNKUR4.setHashTagListener(new InterfaceC1355390lNJ() { // from class: X.0xIe
                        @Override // X.InterfaceC1355390lNJ
                        public final void LIZ(String str3) {
                            C20600815jK<InterfaceC1891350zJl> state;
                            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
                            C20600815jK<InterfaceC1891350zJl> state2;
                            C1276004z0 c1276004z0 = new C1276004z0(str3);
                            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) this.LIZ.LLJJJJJIL.getValue();
                            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null && !((ArrayList) state.LJII()).contains(c1276004z0) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LIZ.LLJJJJJIL.getValue()) != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                                C20600815jK.LIZJ(state2, c1276004z0);
                            }
                        }
                    });
                    c1355400lNKUR4.setAddHashTagListener(new InterfaceC1355420lNM() { // from class: X.0xId
                        @Override // X.InterfaceC1355420lNM
                        public final void LIZ(String str3, boolean z) {
                            C20600815jK<InterfaceC1891350zJl> state;
                            if (z) {
                                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LIZ.LLJJJJJIL.getValue();
                                if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                                    C20600815jK.LJIIL(state, new C1276004z0(u.LJJIFFI(str3, "#", "", false)));
                                    return;
                                }
                                return;
                            }
                            C1389890mGx c1389890mGx = new C1389890mGx(c1355400lNKUR4);
                            c1389890mGx.LJIIJ(C497740JfY.LJIIL(2131755946, 400, 400));
                            c1389890mGx.LJIIJJI();
                        }
                    });
                }
            }
        }
        dS(this.LLJ);
        View view2 = (View) this.LLJJJIL.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new AbS706S0100000_27(this, 16, 42), view2);
        }
        if (this.LLJILJILJ == 1) {
            C1355400lNK c1355400lNKUR5 = UR();
            if (c1355400lNKUR5 != null) {
                layoutParams = c1355400lNKUR5.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams) != null) {
                layoutParams2.removeRule(16);
                layoutParams2.addRule(16, R.id.n4q);
                C1355400lNK c1355400lNKUR6 = UR();
                if (c1355400lNKUR6 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1355400lNKUR6);
                    c1355400lNKUR6.setLayoutParams(layoutParams2);
                }
            }
            CardView cardView = (CardView) this.LLJJIJI.getValue();
            if (cardView != null) {
                C786410Ut5.LLILLL(cardView, 0);
            }
            SmartImageView smartImageView = (SmartImageView) this.LLJJIII.getValue();
            if (smartImageView != null) {
                C786410Ut5.LLFF(8, smartImageView);
            }
            LiveQuickPostViewModel liveQuickPostViewModelAS = aS();
            AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(this, 638);
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(liveQuickPostViewModelAS);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C0H6K(awS606S0100000_27, liveQuickPostViewModelAS, null), 2);
        } else {
            CardView cardView2 = (CardView) this.LLJJIJI.getValue();
            if (cardView2 != null) {
                C786410Ut5.LLILLL(cardView2, 8);
            }
            SmartImageView smartImageView2 = (SmartImageView) this.LLJJIII.getValue();
            if (smartImageView2 != null) {
                C786410Ut5.LLFF(0, smartImageView2);
            }
            PostConfigModel postConfigModelVR3 = VR();
            if (postConfigModelVR3 != null && (str = postConfigModelVR3.publishImage) != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJ((SmartImageView) this.LLJJIII.getValue());
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJJJJIL.getValue();
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJJJJIL.getValue();
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(LivePostTagCell.class);
        }
        PostConfigModel postConfigModelVR4 = VR();
        if (postConfigModelVR4 != null && (publishParams2 = postConfigModelVR4.publishParams) != null && (list2 = publishParams2.challenges) != null) {
            for (String str3 : list2) {
                C1355400lNK c1355400lNKUR7 = UR();
                if (c1355400lNKUR7 != null) {
                    c1355400lNKUR7.LJIIJ(Boolean.TRUE, str3);
                }
            }
        }
        PostConfigModel postConfigModelVR5 = VR();
        if (postConfigModelVR5 != null && (publishParams = postConfigModelVR5.publishParams) != null && (list = publishParams.userTags) != null) {
            for (C1444390ngr c1444390ngr : list) {
                C1355400lNK c1355400lNKUR8 = UR();
                if (c1355400lNKUR8 != null) {
                    c1355400lNKUR8.LJIIIZ(c1444390ngr.LIZIZ);
                }
            }
        }
        View view3 = (View) this.LLJJJJ.getValue();
        if (view3 != null) {
            C786410Ut5.I7(new AbS706S0100000_27(this, 15, 42), view3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Boolean boolValueOf;
        int i;
        PostConfigModel postConfigModelVR = VR();
        C19GS c19gs = null;
        if (postConfigModelVR != null) {
            boolValueOf = Boolean.valueOf(postConfigModelVR.forceDarkMode);
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            i = R.style.y0;
        } else {
            i = R.style.my;
        }
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new C1361400lX0(getContext(), i)), R.layout.dd9, viewGroup, false);
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
