package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC1375550ltp;
import X.C01GW;
import X.C0M7Y;
import X.C0XQ7;
import X.C1106210etP;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1378990lzN;
import X.C1388190mED;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C259800zU;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C814420VxA;
import X.InterfaceC1361560lXG;
import X.InterfaceC1363540laS;
import X.InterfaceC1842140y2O;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.share.improve.channel.LiveRepostAddNoteChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveRepostAddNoteChannel extends PureLogicChannel {
    public final Context LL;
    public final C1106210etP LLILLJJLI;
    public boolean LLILLL;
    public View LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(321));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(322));

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LJJLIIIJJI() {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "live_repost_note";
    }

    public final Map<String, String> LIZ() {
        User owner;
        FollowInfo followInfo;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("enter_from_merge", this.LLILLJJLI.LJIL);
        pairArr[1] = new Pair("enter_method", this.LLILLJJLI.LJJ);
        pairArr[2] = new Pair("action_type", this.LLILLJJLI.LJIJI);
        pairArr[3] = new Pair("user_id", C0XQ7.LJFF().getCurUserId());
        Room room = this.LLILLJJLI.LJJIIZ;
        Long lValueOf = null;
        pairArr[4] = new Pair("anchor_id", String.valueOf(room != null ? Long.valueOf(room.getOwnerUserId()) : null));
        Room room2 = this.LLILLJJLI.LJJIIZ;
        pairArr[5] = new Pair("room_id", room2 != null ? room2.getIdStr() : null);
        pairArr[6] = new Pair("panel_source", "share_panel");
        Room room3 = this.LLILLJJLI.LJJIIZ;
        pairArr[7] = new Pair("button_status", (room3 == null || !room3.reposted) ? "repost" : "cancel_repost");
        Room room4 = this.LLILLJJLI.LJJIIZ;
        if (room4 != null && (owner = room4.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            lValueOf = Long.valueOf(followInfo.getFollowStatus());
        }
        pairArr[8] = new Pair("follow_status", String.valueOf(lValueOf));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        Context context = this.LL;
        InterfaceC1363540laS interfaceC1363540laS = (InterfaceC1363540laS) this.LLILZIL.getValue();
        return context.getString(interfaceC1363540laS != null ? interfaceC1363540laS.LIZLLL() : 0);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final void LJJIIJZLJL(int i) {
        if (!this.LLILLL) {
            C20684815ws.LJIILLIIL("livesdk_repost_notes_icon_show", LIZ());
            this.LLILLL = true;
        }
    }

    public LiveRepostAddNoteChannel(Context context, C1106210etP c1106210etP) {
        this.LL = context;
        this.LLILLJJLI = c1106210etP;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final void LJJIJIL(View view, boolean z) {
        C1295960jpS c1295960jpS;
        int i;
        float fFloatValue;
        int iIntValue;
        Integer numLIZJ;
        Float fValueOf;
        this.LLILZ = view;
        if ((view instanceof ViewGroup) && view != null && (c1295960jpS = (C1295960jpS) view.findViewById(R.id.av1)) != null) {
            if (z) {
                i = R.dimen.az;
            } else {
                i = R.dimen.b4;
            }
            try {
                fValueOf = Float.valueOf(this.LL.getResources().getDimensionPixelSize(i));
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (fValueOf == null) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = fValueOf.floatValue();
            }
            RadiusLayout radiusLayout = (RadiusLayout) view.findViewById(R.id.kc7);
            if (radiusLayout != null) {
                radiusLayout.LIZ(fFloatValue, fFloatValue, fFloatValue, fFloatValue);
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = ((InterfaceC1361560lXG) this.LLILZLL.getValue()).LJIIIZ();
            c419910GdJ.LJ = Integer.valueOf(R.attr.a0o);
            c1295960jpS.setImageDrawable(c419910GdJ.LIZ(c1295960jpS.getContext()));
            Context context = c1295960jpS.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bi, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c1295960jpS.setBackgroundColor(iIntValue);
            C1378990lzN.LIZIZ(c1295960jpS, Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), null, null, null, null, 30);
            c1295960jpS.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Integer] */
    @Override // X.InterfaceC1369790lkX
    public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        long id;
        Dialog dialog;
        Window window;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if ((activityLIZ instanceof C19GS) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            final Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("SKELETON_SHARE_FRAGMENT");
            C259800zU c259800zU = new C259800zU();
            if ((fragmentLJJJJZI instanceof DialogFragment) && (dialog = ((DialogFragment) fragmentLJJJJZI).getDialog()) != null && (window = dialog.getWindow()) != null) {
                c259800zU.element = Integer.valueOf(window.getAttributes().softInputMode);
                window.setSoftInputMode(48);
            }
            InterfaceC1363540laS interfaceC1363540laS = (InterfaceC1363540laS) this.LLILZIL.getValue();
            if (interfaceC1363540laS != null) {
                Room room = this.LLILLJJLI.LJJIIZ;
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                interfaceC1363540laS.LJI(supportFragmentManager, id, LIZ(), new InterfaceC1842140y2O() { // from class: X.0lfF
                    @Override // X.InterfaceC1842140y2O
                    public final void onFailure() {
                    }

                    @Override // X.InterfaceC1842140y2O
                    public final void onSuccess() {
                        Dialog dialog2;
                        Window window2;
                        View decorView;
                        View viewFindViewById;
                        ViewParent parent;
                        Fragment fragment = fragmentLJJJJZI;
                        if (!(fragment instanceof DialogFragment) || (dialog2 = ((DialogFragment) fragment).getDialog()) == null || (window2 = dialog2.getWindow()) == null || (decorView = window2.getDecorView()) == null || (viewFindViewById = decorView.findViewById(R.id.doe)) == null || (parent = viewFindViewById.getParent()) == null) {
                            return;
                        }
                        LiveRepostAddNoteChannel liveRepostAddNoteChannel = this;
                        if (parent instanceof C1369580lkC) {
                            C1369580lkC c1369580lkC = (C1369580lkC) parent;
                            List<InterfaceC1369790lkX> currentChannel = c1369580lkC.getCurrentChannel();
                            ArrayList arrayList = new ArrayList();
                            for (InterfaceC1369790lkX interfaceC1369790lkX : currentChannel) {
                                if (true ^ Intrinsics.LJFF(interfaceC1369790lkX, liveRepostAddNoteChannel)) {
                                    arrayList.add(interfaceC1369790lkX);
                                }
                            }
                            c1369580lkC.LJIIZILJ(arrayList, true);
                        }
                    }
                }, new AwS405S0200000_4(fragmentLJJJJZI, (Fragment) c259800zU, (C259800zU<Integer>) 25));
            }
            C20684815ws.LJIILLIIL("livesdk_repost_notes_icon_click", LIZ());
            return true;
        }
        return true;
    }
}
