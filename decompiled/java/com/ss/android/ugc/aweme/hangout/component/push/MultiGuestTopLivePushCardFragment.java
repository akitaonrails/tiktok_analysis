package com.ss.android.ugc.aweme.hangout.component.push;

import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0IVR;
import X.C11JF;
import X.C11NZ;
import X.C1295960jpS;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C452501pT;
import X.C477860Ioa;
import X.C477870Iob;
import X.C479300Iqu;
import X.C786410Ut5;
import X.C814420VxA;
import Y.AAListenerS169S0000000_7;
import Y.ACListenerS141S0100000_6;
import Y.ACListenerS142S0100000_7;
import Y.ATListenerS441S0100000_7;
import Y.AfS175S0100000_6;
import Y.AfS176S0100000_7;
import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestTopLivePushCardConfig;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.hangout.component.push.MultiGuestTopLivePushCardFragment;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestTopLivePushCardFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi0tJyg8PTFiKiA+OCoiLCHELIOSEnZjU5Oid9BTAgPSYUPSA/PRs8OAklPyoDPTYkCi4hLAM+KCg+LSs4";
    public final Room LL;
    public C11JF LLILLJJLI;
    public C11JF LLILLL;
    public View LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C1295960jpS LLJ;
    public float LLJI;
    public boolean LLJIJIL;
    public final float LLJILJIL = 150.0f;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 274));
    public final ATListenerS441S0100000_7 LLJILLL = new ATListenerS441S0100000_7(this, 7);

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C11JF c11jf = this.LLILLJJLI;
        if (c11jf == null || c11jf.isDisposed()) {
            return;
        }
        C11JF c11jf2 = this.LLILLJJLI;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setBackgroundDrawableResource(R.color.transparent);
            window2.setDimAmount(0.0f);
            window2.setFlags(32, 32);
            window2.clearFlags(2);
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.width = -1;
            attributes.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(233));
            attributes.gravity = 49;
            window2.setAttributes(attributes);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, this);
    }

    public MultiGuestTopLivePushCardFragment(Room room) {
        this.LL = room;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String str;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        String str2;
        MultiLiveUserSettings multiLiveUserSettings2;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        super.onViewCreated(view, bundle);
        C20441214yg.LIZIZ("MultiGuestTopLivePushCardFragment", "onViewCreated");
        this.LLILZ = view.findViewById(com.zhiliaoapp.musically.R.id.ybe);
        this.LLILZIL = (TuxIconView) view.findViewById(com.zhiliaoapp.musically.R.id.e1v);
        this.LLILZLL = (TuxTextView) view.findViewById(com.zhiliaoapp.musically.R.id.tql);
        this.LLIZ = (TuxTextView) view.findViewById(com.zhiliaoapp.musically.R.id.tqx);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(com.zhiliaoapp.musically.R.id.crd);
        this.LLJ = (C1295960jpS) view.findViewById(com.zhiliaoapp.musically.R.id.bhg);
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            Room room = this.LL;
            if (room != null && (multiLiveUserSettings2 = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings2 = multiLiveUserSettings2.multiLiveUserApplySettings) != null) {
                str2 = multiLiveUserApplySettings2.topLiveGuide;
            } else {
                str2 = null;
            }
            tuxTextView.setText(str2);
        }
        TuxTextView tuxTextView2 = this.LLIZ;
        if (tuxTextView2 != null) {
            Room room2 = this.LL;
            if (room2 != null && (multiLiveUserSettings = room2.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null) {
                str = multiLiveUserApplySettings.topLiveTitle;
            } else {
                str = null;
            }
            tuxTextView2.setText(str);
        }
        view.setOnTouchListener(this.LLJILLL);
        final View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
            HandlerHook.viewPost(view2, new Runnable() { // from class: X.0Iqq
                public final void LIZ() {
                    User owner;
                    MultiGuestTopLivePushCardFragment multiGuestTopLivePushCardFragment = this.LL;
                    View view3 = view2;
                    TuxTextView tuxTextView3 = multiGuestTopLivePushCardFragment.LLILZLL;
                    Float fValueOf = tuxTextView3 != null ? Float.valueOf(tuxTextView3.getTranslationY()) : null;
                    TuxTextView tuxTextView4 = multiGuestTopLivePushCardFragment.LLIZ;
                    Float fValueOf2 = tuxTextView4 != null ? Float.valueOf(tuxTextView4.getTranslationY()) : null;
                    if (fValueOf != null && fValueOf2 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("originY:");
                        sbLIZ.append(0.0f);
                        C20441214yg.LIZIZ("MultiGuestTopLivePushCardFragment", C2188811AlT.LIZIZ(sbLIZ));
                        C786410Ut5.LJLLLLLL(0, view3);
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_Y, 0.0f - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + 0.0f);
                        objectAnimatorOfFloat.setDuration(450L);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_Y, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + 0.0f, 0.0f);
                        objectAnimatorOfFloat2.setDuration(450L);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                        animatorSet.setInterpolator(C1619980sG4.LIZLLL());
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_X, 0.2f, 1.05f);
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_Y, 0.2f, 1.05f);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                        animatorSet2.setDuration(450L);
                        animatorSet2.setStartDelay(50L);
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_X, 1.05f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_Y, 1.05f, 1.0f);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        animatorSet3.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6);
                        animatorSet3.setDuration(450L);
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        animatorSet4.playSequentially(animatorSet2, animatorSet3);
                        animatorSet4.setInterpolator(C1619980sG4.LIZLLL());
                        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(multiGuestTopLivePushCardFragment.LLILZIL, (Property<TuxIconView, Float>) View.ALPHA, 0.0f, 1.0f);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        animatorSet5.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8);
                        animatorSet5.setDuration(400L);
                        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(multiGuestTopLivePushCardFragment.LLILZLL, (Property<TuxTextView, Float>) View.TRANSLATION_Y, fValueOf.floatValue() - 15.0f, fValueOf.floatValue() + 5.0f);
                        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(multiGuestTopLivePushCardFragment.LLIZ, (Property<TuxTextView, Float>) View.TRANSLATION_Y, fValueOf2.floatValue() - 20.0f, fValueOf2.floatValue() + 10.0f);
                        AnimatorSet animatorSet6 = new AnimatorSet();
                        animatorSet6.playTogether(objectAnimatorOfFloat9, objectAnimatorOfFloat10);
                        animatorSet6.setDuration(420L);
                        animatorSet6.setStartDelay(80L);
                        ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(multiGuestTopLivePushCardFragment.LLILZLL, (Property<TuxTextView, Float>) View.TRANSLATION_Y, fValueOf.floatValue() + 5.0f, fValueOf.floatValue());
                        ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(multiGuestTopLivePushCardFragment.LLIZ, (Property<TuxTextView, Float>) View.TRANSLATION_Y, fValueOf2.floatValue() + 10.0f, fValueOf2.floatValue());
                        AnimatorSet animatorSet7 = new AnimatorSet();
                        animatorSet7.playTogether(objectAnimatorOfFloat11, objectAnimatorOfFloat12);
                        animatorSet7.setDuration(600L);
                        AnimatorSet animatorSet8 = new AnimatorSet();
                        animatorSet8.playSequentially(animatorSet6, animatorSet7);
                        animatorSet8.setInterpolator(C1619980sG4.LIZLLL());
                        ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(multiGuestTopLivePushCardFragment.LLILZLL, (Property<TuxTextView, Float>) View.ALPHA, 0.0f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(multiGuestTopLivePushCardFragment.LLIZ, (Property<TuxTextView, Float>) View.ALPHA, 0.0f, 1.0f);
                        AnimatorSet animatorSet9 = new AnimatorSet();
                        animatorSet9.playTogether(objectAnimatorOfFloat13, objectAnimatorOfFloat14);
                        animatorSet9.setDuration(1020L);
                        animatorSet9.setStartDelay(80L);
                        ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(multiGuestTopLivePushCardFragment.LLIZLLLIL, (Property<TuxTextView, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat15.setDuration(420L);
                        AnimatorSet animatorSet10 = new AnimatorSet();
                        animatorSet10.play(objectAnimatorOfFloat15);
                        animatorSet10.setDuration(420L);
                        animatorSet10.setStartDelay(80L);
                        ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(multiGuestTopLivePushCardFragment.LLIZLLLIL, (Property<TuxTextView, Float>) View.SCALE_X, 0.8f, 1.03f);
                        ObjectAnimator objectAnimatorOfFloat17 = ObjectAnimator.ofFloat(multiGuestTopLivePushCardFragment.LLIZLLLIL, (Property<TuxTextView, Float>) View.SCALE_Y, 0.8f, 1.03f);
                        AnimatorSet animatorSet11 = new AnimatorSet();
                        animatorSet11.playTogether(objectAnimatorOfFloat16, objectAnimatorOfFloat17);
                        animatorSet11.setDuration(450L);
                        animatorSet11.setStartDelay(80L);
                        ObjectAnimator objectAnimatorOfFloat18 = ObjectAnimator.ofFloat(multiGuestTopLivePushCardFragment.LLIZLLLIL, (Property<TuxTextView, Float>) View.SCALE_X, 1.03f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat19 = ObjectAnimator.ofFloat(multiGuestTopLivePushCardFragment.LLIZLLLIL, (Property<TuxTextView, Float>) View.SCALE_Y, 1.03f, 1.0f);
                        AnimatorSet animatorSet12 = new AnimatorSet();
                        animatorSet12.playTogether(objectAnimatorOfFloat18, objectAnimatorOfFloat19);
                        animatorSet12.setDuration(600L);
                        AnimatorSet animatorSet13 = new AnimatorSet();
                        animatorSet13.playSequentially(animatorSet11, animatorSet12);
                        animatorSet13.setInterpolator(C1619980sG4.LIZLLL());
                        AnimatorSet animatorSet14 = new AnimatorSet();
                        animatorSet14.playTogether(animatorSet, animatorSet4, animatorSet5, animatorSet8, animatorSet9, animatorSet10, animatorSet13);
                        animatorSet14.addListener(new AAListenerS169S0000000_7(2));
                        animatorSet14.start();
                    }
                    MultiGuestTopLivePushCardFragment multiGuestTopLivePushCardFragment2 = this.LL;
                    multiGuestTopLivePushCardFragment2.getClass();
                    ImageModel avatarThumb = UserService.getInstance().user().getCurrentUser().getAvatarThumb();
                    Room room3 = multiGuestTopLivePushCardFragment2.LL;
                    ImageModel avatarThumb2 = (room3 == null || (owner = room3.getOwner()) == null) ? null : owner.getAvatarThumb();
                    if (avatarThumb == null || avatarThumb2 == null) {
                        C20441214yg.LJIIL("MultiGuestTopLivePushCardFragment", "Avatar model is null, skipping load.");
                    } else {
                        C11JF c11jf = multiGuestTopLivePushCardFragment2.LLILLL;
                        if (c11jf != null) {
                            c11jf.dispose();
                        }
                        multiGuestTopLivePushCardFragment2.LLILLL = (C11JF) C1121670fIL.LJ(avatarThumb).LJLLL(C1121670fIL.LJ(avatarThumb2), new InterfaceC500500Jk0() { // from class: X.0Jjm
                            @Override // X.InterfaceC500500Jk0
                            public final Object apply(Object obj, Object obj2) {
                                return new Pair(obj, obj2);
                            }
                        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.01BS
                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object obj) {
                                Pair pair = (Pair) obj;
                                return new Pair(C2476009n4.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), (Bitmap) pair.getFirst()), C2476009n4.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), (Bitmap) pair.getSecond()));
                            }
                        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(multiGuestTopLivePushCardFragment2, 246), new C09JN() { // from class: X.00KV
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("MultiGuestTopLivePushCardFragment@df29.loadBitmap$4");
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Failed to load avatars ");
                                sbLIZ2.append(Unit.LIZ);
                                C20441214yg.LJ("MultiGuestTopLivePushCardFragment", C2188811AlT.LIZIZ(sbLIZ2));
                                C1C7U.LIZIZ("MultiGuestTopLivePushCardFragment@df29.loadBitmap$4");
                            }
                        });
                    }
                    MultiGuestTopLivePushCardFragment multiGuestTopLivePushCardFragment3 = this.LL;
                    multiGuestTopLivePushCardFragment3.getClass();
                    Context contextLJII = C497740JfY.LJII();
                    if (contextLJII != null) {
                        try {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 31) {
                                Context context = multiGuestTopLivePushCardFragment3.getContext();
                                ((VibratorManager) (context != null ? C786410Ut5.H2(context, "vibrator_manager") : null)).getDefaultVibrator().vibrate(VibrationEffect.createOneShot(200L, -1));
                                return;
                            }
                            Context context2 = multiGuestTopLivePushCardFragment3.getContext();
                            Vibrator vibrator = (Vibrator) (context2 != null ? C786410Ut5.H2(context2, "vibrator") : null);
                            if (i >= 26) {
                                vibrator.vibrate(VibrationEffect.createOneShot(200L, -1));
                            } else {
                                vibrator.vibrate(200L);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("show vibrate error: ");
                            sbLIZ2.append(e.getMessage());
                            C20441214yg.LJ("MultiGuestTopLivePushCardFragment", C2188811AlT.LIZIZ(sbLIZ2));
                            try {
                                ((Vibrator) C786410Ut5.H2(contextLJII, "vibrator")).cancel();
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("cancelVibrate, error: ");
                                sbLIZ3.append(e2.getMessage());
                                C20441214yg.LIZIZ("MultiGuestTopLivePushCardFragment", C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MultiGuestTopLivePushCardFragment@df29.onViewCreated$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MultiGuestTopLivePushCardFragment@df29.onViewCreated$1$1");
                }
            });
        }
        TuxTextView tuxTextView3 = this.LLIZLLLIL;
        if (tuxTextView3 != null) {
            C786410Ut5.h9(tuxTextView3, new ACListenerS142S0100000_7(this, 135));
        }
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 26));
        }
        C479300Iqu.LIZ.getClass();
        C479300Iqu.LIZ().storeString("multi_guest_top_live_push_card_last_show_date", C479300Iqu.LIZIZ());
        C479300Iqu.LIZ().storeInt("multi_guest_top_live_push_card_not_consume_count", C479300Iqu.LIZ().getInt("multi_guest_top_live_push_card_not_consume_count", 0) + 1);
        C479300Iqu.LIZ().storeLong("multi_guest_top_live_push_card_not_consume_timestamp", System.currentTimeMillis());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPushCard date:");
        sbLIZ.append(C479300Iqu.LIZ().getString("multi_guest_top_live_push_card_last_show_date", ""));
        sbLIZ.append(",not_consume_count:");
        sbLIZ.append(C479300Iqu.LIZ().getInt("multi_guest_top_live_push_card_not_consume_count", 0));
        C20441214yg.LIZIZ("MultiGuestTopLivePushCardControlUtil", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = (C11JF) C11NZ.LJLJJLL(MultiGuestTopLivePushCardConfig.INSTANCE.getResidenceSeconds(), TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS175S0100000_6(this, 16), new C09JN() { // from class: X.00KW
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiGuestTopLivePushCardFragment@df29.autoDestroy$2");
                C20441214yg.LJ("MultiGuestTopLivePushCardFragment", ((Throwable) obj).getMessage());
                C1C7U.LIZIZ("MultiGuestTopLivePushCardFragment@df29.autoDestroy$2");
            }
        });
        C477860Ioa.LJIIJ((C477870Iob) this.LLJILJILJ.getValue(), null);
        Room room3 = this.LL;
        Uri.Builder builderAuthority = new Uri.Builder().scheme("sslocal").authority("webcast_room");
        if (room3 != null) {
            string = Long.valueOf(room3.getId()).toString();
        } else {
            string = null;
        }
        Uri uriBuild = builderAuthority.appendQueryParameter("room_id", string).appendQueryParameter("enter_from", "live_merge").appendQueryParameter("enter_method", "hangout_mg_push_join").appendQueryParameter("enter_from_merge", "live_merge").appendQueryParameter("is_from_mg_toplive", "1").build();
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C0IVR.LJII(enterRoomConfig, uriBuild, true);
        C477860Ioa.LJFF(enterRoomConfig, room3, "MultiGuestTopLivePushCardFragment#logLiveShow", null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C20441214yg.LIZIZ("MultiGuestTopLivePushCardFragment", "onCreateView");
        View viewTd = C786410Ut5.Td(layoutInflater, com.zhiliaoapp.musically.R.layout.diy, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, this);
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
