package com.bytedance.android.livesdk.broadcast;

import X.C01GW;
import X.C098200Yq;
import X.C0IEN;
import X.C0IGQ;
import X.C0IJR;
import X.C0IP3;
import X.C0IR5;
import X.C0TZL;
import X.C1087000eOQ;
import X.C1119920fFW;
import X.C1148310fzJ;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C292401Bi;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748420TXk;
import X.C786410Ut5;
import X.C931200aL8;
import X.EnumC748580TYa;
import X.InterfaceC337570DLf;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.moderator.IModeratorService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBroadcastEndSafetyToolsFragment extends BaseFragment implements InterfaceC337570DLf, C0IP3 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTHELIOSY4ZwM6PiAOOyAyLCYtOjsWJiEfKCk2PDwYJiA/OwM+KCg+LSs4";
    public C0IGQ LL;
    public final C01GW LLILLJJLI = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(48));
    public final C01GW LLILLL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(47));
    public final C01GW LLILZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(46));
    public DataChannel LLILZIL;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.SX0(C0TZL.class, Boolean.FALSE);
        }
    }

    @Override // X.C0IP3
    public final DataChannel provideDataChannel() {
        return this.LLILZIL;
    }

    public final CharSequence NR(int i) {
        String strLJIJI;
        String strLJIJJ;
        String strLJIJI2 = C497740JfY.LJIJI(2131842704);
        if (i != 0) {
            strLJIJI = C497740JfY.LJIJI(i);
        } else {
            strLJIJI = null;
        }
        int iLJJJ = 0;
        if (strLJIJI == null) {
            strLJIJJ = C497740JfY.LJIJJ(2131840986, strLJIJI2);
        } else {
            strLJIJJ = C497740JfY.LJIJJ(2131840986, strLJIJI2, strLJIJI);
        }
        SpannableString spannableString = new SpannableString(strLJIJJ);
        int iLJJJ2 = a0.LJJJ(strLJIJJ, strLJIJI2, 0, false, 6);
        if (strLJIJI != null) {
            iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
        }
        if (iLJJJ2 >= 0) {
            C1119920fFW.LJ(getContext(), spannableString, iLJJJ2, iLJJJ2 + strLJIJI2.length(), 33, 8, 500);
        }
        if (strLJIJI != null && iLJJJ >= 0) {
            C1119920fFW.LJ(getContext(), spannableString, iLJJJ, iLJJJ + strLJIJI.length(), 33, 8, 500);
        }
        return spannableString;
    }

    public final Fragment OR(EnumC748580TYa enumC748580TYa) {
        int i = C748420TXk.LIZ[enumC748580TYa.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return ((IModeratorService) C1161920gLG.LIZJ(IModeratorService.class)).kk2();
                }
                return (Fragment) this.LLILZ.getValue();
            }
            return (Fragment) this.LLILLL.getValue();
        }
        return (Fragment) this.LLILLJJLI.getValue();
    }

    public final void PR(Fragment fragment) {
        CharSequence charSequenceNR;
        View viewFindViewById;
        TextView textView;
        View viewFindViewById2;
        if (Intrinsics.LJFF(fragment, this.LLILLJJLI.getValue())) {
            charSequenceNR = NR(2131842728);
        } else if (Intrinsics.LJFF(fragment, this.LLILLL.getValue())) {
            charSequenceNR = NR(2131842673);
        } else {
            charSequenceNR = "";
        }
        if (!TextUtils.isEmpty(charSequenceNR)) {
            View view = getView();
            if (view != null && (viewFindViewById2 = view.findViewById(R.id.xyz)) != null) {
                C500260Jjc.LLFFF(viewFindViewById2);
            }
            View view2 = getView();
            if (view2 != null && (textView = (TextView) view2.findViewById(R.id.woo)) != null) {
                textView.setText(charSequenceNR);
                return;
            }
            return;
        }
        View view3 = getView();
        if (view3 == null || (viewFindViewById = view3.findViewById(R.id.xyz)) == null) {
            return;
        }
        C500260Jjc.LJIILIIL(viewFindViewById);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            super.onViewCreated(r5, r6)
            android.os.Bundle r1 = r4.getArguments()
            if (r1 == 0) goto L96
            java.lang.String r0 = "scheme"
            android.os.Parcelable r1 = r1.getParcelable(r0)
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L96
            java.lang.String r0 = "page"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
            if (r2 == 0) goto L96
            int r1 = r2.hashCode()
            r0 = -1252562792(0xffffffffb5576898, float:-8.0245945E-7)
            if (r1 == r0) goto L87
            r0 = -1172077849(0xffffffffba2382e7, float:-6.2374625E-4)
            if (r1 == r0) goto L78
            r0 = 1072421660(0x3febdb1c, float:1.8426242)
            if (r1 != r0) goto L96
            java.lang.String r0 = "block_keywords"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L96
            X.0TYa r0 = X.EnumC748580TYa.BLOCK_KEYWORDS
            androidx.fragment.app.Fragment r2 = r4.OR(r0)
        L3c:
            if (r2 == 0) goto L96
            r4.PR(r2)
            androidx.fragment.app.FragmentManager r0 = r4.getChildFragmentManager()
            X.19EH r1 = r0.LJIIJ()
            r0 = 2131373640(0x7f0a2e48, float:1.8367377E38)
            r1.LIZIZ(r0, r2)
            r1.LJIIJ()
        L52:
            boolean r0 = r4.isAdded()
            if (r0 == 0) goto L6a
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = X.C475510Ikn.LJ(r4)
            if (r3 == 0) goto L6a
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel> r2 = com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel.class
            kotlin.jvm.internal.AwS591S0100000_12 r1 = new kotlin.jvm.internal.AwS591S0100000_12
            r0 = 162(0xa2, float:2.27E-43)
            r1.<init>(r4, r0)
            r3.BQ2(r4, r2, r1)
        L6a:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = X.C475510Ikn.LJ(r4)
            if (r2 == 0) goto L77
            java.lang.Class<X.0TZL> r1 = X.C0TZL.class
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.SX0(r1, r0)
        L77:
            return
        L78:
            java.lang.String r0 = "add_moderator"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L96
            X.0TYa r0 = X.EnumC748580TYa.MANAGE_MODERATOR
            androidx.fragment.app.Fragment r2 = r4.OR(r0)
            goto L3c
        L87:
            java.lang.String r0 = "filter_comment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L96
            X.0TYa r0 = X.EnumC748580TYa.FILTER_COMMENT
            androidx.fragment.app.Fragment r2 = r4.OR(r0)
            goto L3c
        L96:
            X.19EG r0 = r4.getActivity()
            if (r0 == 0) goto L52
            r0.finish()
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.LiveBroadcastEndSafetyToolsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Long lValueOf;
        long id;
        DataChannel dataChannel;
        this.LLILZIL = C0IJR.LIZ(new ViewModelProvider(this), this);
        C0IEN c0ien = new C0IEN();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C931200aL8.class);
        c0ien.LIZIZ = room;
        c0ien.LIZ = "autosuggest";
        C19GS c19gs = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c0ien.LIZLLL = lValueOf;
        C0IR5 c0ir5LIZ = c0ien.LIZ();
        DataChannel dataChannel2 = this.LLILZIL;
        if (dataChannel2 != null) {
            dataChannel2.SX0(C1087000eOQ.class, c0ir5LIZ);
        }
        dataChannelGlobal.JQ2(C1148310fzJ.class, c0ir5LIZ);
        Room room2 = c0ien.LIZIZ;
        if (room2 != null && (dataChannel = this.LLILZIL) != null) {
            dataChannel.zW(RoomChannel.class, room2);
        }
        DataChannel dataChannel3 = this.LLILZIL;
        if (dataChannel3 != null) {
            dataChannel3.zW(UserIsAnchorChannel.class, Boolean.TRUE);
        }
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        DataChannel dataChannel4 = this.LLILZIL;
        Room room3 = c0ien.LIZIZ;
        if (room3 != null) {
            id = room3.getId();
        } else {
            id = 0;
        }
        iRoomFunctionService.MO1(id, dataChannel4);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ggl, viewGroup, false);
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
