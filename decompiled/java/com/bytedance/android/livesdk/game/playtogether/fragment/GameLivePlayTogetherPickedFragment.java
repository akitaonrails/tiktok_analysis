package com.bytedance.android.livesdk.game.playtogether.fragment;

import X.C0JBN;
import X.C1143680frq;
import X.C1324610kZf;
import X.C1819620xS4;
import X.C1864810ycx;
import X.C197039127h;
import X.C418440Gaw;
import X.C497740JfY;
import X.C498540Jgq;
import X.C500260Jjc;
import X.C500950Jkj;
import X.C786410Ut5;
import X.C814420VxA;
import X.C930940aKi;
import X.InterfaceC1118490fDD;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.game.GameLivePlayTogetherPickedCancelChannel;
import com.bytedance.android.livesdk.game.model.PlayTogetherBasicInfo;
import com.bytedance.android.livesdk.game.model.PlayTogetherPickInfo;
import com.bytedance.android.livesdk.game.model.PlayTogetherTemplateV2;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class GameLivePlayTogetherPickedFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGEjJCQ1PSA0LTEkLDHELIOS19LjctLiI2JjFiDi4+LQklPyoDJCQ1HSA0LTEkLD0DISYnLCsVOiQrJCo9PA==";
    public Room LL;
    public TuxTextView LLILLJJLI;
    public ImageView LLILLL;
    public C0JBN LLILZ;
    public PlayTogetherPickInfo LLILZIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C500980Jkm createParams() {
        /*
            r6 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            r2 = 1
            if (r1 == 0) goto L47
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L47
            boolean r1 = r0.booleanValue()
            if (r1 != 0) goto L48
            r5 = 2131887755(0x7f12068b, float:1.9410126E38)
        L18:
            boolean r0 = X.C497740JfY.LJJ()
            if (r0 == 0) goto L45
            r4 = 3
        L1f:
            r3 = -1
            if (r1 != r2) goto L39
            r2 = -1
            r3 = -2
            r0 = 2131567404(0x7f0d232c, float:1.8760377E38)
        L27:
            X.0Jkm r1 = new X.0Jkm
            r1.<init>(r0)
            r1.LIZJ = r5
            r0 = 48
            r1.LJIILIIL = r0
            r1.LJII = r4
            r1.LJIIIZ = r2
            r1.LJIIJ = r3
            return r1
        L39:
            r0 = 1136361472(0x43bb8000, float:375.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r2 = (int) r0
            r0 = 2131567405(0x7f0d232d, float:1.876038E38)
            goto L27
        L45:
            r4 = 5
            goto L1f
        L47:
            r1 = 1
        L48:
            r5 = 2131887753(0x7f120689, float:1.9410122E38)
            if (r1 != r2) goto L50
            r4 = 80
            goto L1f
        L50:
            if (r1 == 0) goto L18
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.playtogether.fragment.GameLivePlayTogetherPickedFragment.createParams():X.0Jkm");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC1118490fDD genLandscapeDialogProxy() {
        return new C500950Jkj(R.layout.g16);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C0JBN c0jbn = this.LLILZ;
        if (c0jbn != null) {
            c0jbn.LIZLLL(null);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setCustomSelectionActionModeCallback(null);
        }
        ImageView imageView = this.LLILLL;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        this.LLILLL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "livesdk_audience_play_together_picked_panel"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LL
            r3 = 0
            if (r0 == 0) goto Lc3
            long r0 = r0.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L13:
            java.lang.String r0 = "room_id"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LL
            if (r0 == 0) goto Lc0
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto Lc0
            long r0 = r0.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L2a:
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdk.game.model.PlayTogetherPickInfo r0 = r4.LLILZIL
            if (r0 == 0) goto Lbd
            com.bytedance.android.livesdk.game.model.PlayTogetherBasicInfo r0 = r0.basicInfo
            if (r0 == 0) goto Lbd
            java.lang.String r1 = r0.playTogetherId
        L39:
            java.lang.String r0 = "play_together_id"
            r2.LJJII(r1, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.dataChannel
            if (r0 == 0) goto Lbb
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = X.C751980Tee.LIZJ(r0)
            if (r0 == 0) goto Lbb
            java.lang.String r1 = r0.logStreamingType
        L4a:
            java.lang.String r0 = "live_type"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdk.game.model.PlayTogetherPickInfo r0 = r4.LLILZIL
            if (r0 == 0) goto Lb9
            com.bytedance.android.livesdk.game.model.PlayTogetherBasicInfo r0 = r0.basicInfo
            if (r0 == 0) goto Lb9
            com.bytedance.android.livesdk.game.model.PlayTogetherTemplateV2 r0 = r0.templateInfo
            if (r0 == 0) goto Lb9
            java.lang.String r1 = r0.templateId
        L5d:
            java.lang.String r0 = "theme_id"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdk.game.model.PlayTogetherPickInfo r0 = r4.LLILZIL
            if (r0 == 0) goto L74
            com.bytedance.android.livesdk.game.model.PlayTogetherBasicInfo r0 = r0.basicInfo
            if (r0 == 0) goto L74
            com.bytedance.android.livesdk.game.model.PlayTogetherTemplateV2 r0 = r0.templateInfo
            if (r0 == 0) goto L74
            int r0 = r0.templateConfigId
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L74:
            java.lang.String r0 = "config_id"
            r2.LJJII(r3, r0)
            com.bytedance.android.livesdk.game.model.PlayTogetherPickInfo r0 = r4.LLILZIL
            if (r0 == 0) goto Lb6
            com.bytedance.android.livesdk.game.model.PlayTogetherBasicInfo r0 = r0.basicInfo
            if (r0 == 0) goto Lb6
            int r1 = r0.applyLimitType
            r0 = 1
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb0
            r0 = 2
            if (r1 == r0) goto Lad
            r0 = 3
            if (r1 != r0) goto Lb6
            java.lang.String r1 = "subscriber"
        L90:
            java.lang.String r0 = "who_can_play"
            r2.LJJII(r1, r0)
            boolean r0 = X.C497740JfY.LJIL()
            r0 = r0 ^ 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_landscape"
            r2.LJJII(r1, r0)
            java.lang.String r0 = "action_type"
            r2.LJJII(r5, r0)
            r2.LIZ()
            return
        Lad:
            java.lang.String r1 = "creator_team"
            goto L90
        Lb0:
            java.lang.String r1 = "followers"
            goto L90
        Lb3:
            java.lang.String r1 = "all"
            goto L90
        Lb6:
            java.lang.String r1 = ""
            goto L90
        Lb9:
            r1 = r3
            goto L5d
        Lbb:
            r1 = r3
            goto L4a
        Lbd:
            r1 = r3
            goto L39
        Lc0:
            r1 = r3
            goto L2a
        Lc3:
            r1 = r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.playtogether.fragment.GameLivePlayTogetherPickedFragment.MR(java.lang.String):void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ImageView imageView;
        View viewFindViewById;
        C1324610kZf c1324610kZfLIZ;
        User owner;
        C498540Jgq c498540Jgq;
        PlayTogetherPickInfo playTogetherPickInfo;
        PlayTogetherBasicInfo playTogetherBasicInfo;
        PlayTogetherTemplateV2 playTogetherTemplateV2;
        String str2;
        String str3;
        PlayTogetherBasicInfo playTogetherBasicInfo2;
        PlayTogetherTemplateV2 playTogetherTemplateV22;
        PlayTogetherBasicInfo playTogetherBasicInfo3;
        PlayTogetherBasicInfo playTogetherBasicInfo4;
        PlayTogetherTemplateV2 playTogetherTemplateV23;
        Window window;
        View decorView;
        super.onViewCreated(view, bundle);
        MR("show");
        this.LL = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, GameLivePlayTogetherPickedCancelChannel.class, new AwS591S0100000_12(this, 568));
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(2050);
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131855137));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.xyz);
        PlayTogetherPickInfo playTogetherPickInfo2 = this.LLILZIL;
        ImageModel avatarThumb = null;
        if (playTogetherPickInfo2 != null && (playTogetherBasicInfo4 = playTogetherPickInfo2.basicInfo) != null && (playTogetherTemplateV23 = playTogetherBasicInfo4.templateInfo) != null) {
            str = playTogetherTemplateV23.sendMessage;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "") && (playTogetherPickInfo = this.LLILZIL) != null && (playTogetherBasicInfo = playTogetherPickInfo.basicInfo) != null && (playTogetherTemplateV2 = playTogetherBasicInfo.templateInfo) != null && playTogetherTemplateV2.sendMessage != null) {
            textView2.setText(C497740JfY.LJIJI(2131855135));
            TextView textView3 = (TextView) view.findViewById(R.id.imz);
            Object[] objArr = new Object[1];
            PlayTogetherPickInfo playTogetherPickInfo3 = this.LLILZIL;
            if (playTogetherPickInfo3 != null && (playTogetherBasicInfo3 = playTogetherPickInfo3.basicInfo) != null) {
                str2 = playTogetherBasicInfo3.creatorNickName;
            } else {
                str2 = null;
            }
            objArr[0] = str2;
            textView3.setText(C497740JfY.LJIJJ(2131855136, objArr));
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.eu1);
            this.LLILLJJLI = tuxTextView;
            if (tuxTextView != null) {
                PlayTogetherPickInfo playTogetherPickInfo4 = this.LLILZIL;
                if (playTogetherPickInfo4 != null && (playTogetherBasicInfo2 = playTogetherPickInfo4.basicInfo) != null && (playTogetherTemplateV22 = playTogetherBasicInfo2.templateInfo) != null) {
                    str3 = playTogetherTemplateV22.sendMessage;
                } else {
                    str3 = null;
                }
                tuxTextView.setText(str3);
            }
            C197039127h c197039127h = (C197039127h) view.findViewById(R.id.ey2);
            if (c197039127h != null) {
                C786410Ut5.U8(c197039127h, new ACListenerS147S0100000_12(this, 206));
            }
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            if (tuxTextView2 != null) {
                tuxTextView2.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: X.0yQz
                    @Override // android.view.ActionMode.Callback
                    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                        return true;
                    }

                    @Override // android.view.ActionMode.Callback
                    public final void onDestroyActionMode(ActionMode actionMode) {
                    }

                    @Override // android.view.ActionMode.Callback
                    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                        if (menuItem != null && menuItem.getItemId() == 16908321) {
                            this.LL.MR("copy");
                        }
                        return false;
                    }

                    @Override // android.view.ActionMode.Callback
                    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                        if (menu != null) {
                            menu.clear();
                            menu.add(0, android.R.id.copy, 0, android.R.string.copy);
                            return true;
                        }
                        return true;
                    }
                });
            }
        } else {
            textView2.setText(C497740JfY.LJIJI(2131855138));
            View viewFindViewById2 = view.findViewById(R.id.k5x);
            if (viewFindViewById2 != null) {
                C500260Jjc.LJIILIIL(viewFindViewById2);
            }
        }
        View view2 = getView();
        if (view2 != null && (c498540Jgq = (C498540Jgq) view2.findViewById(R.id.bk8)) != null) {
            c498540Jgq.setAvatar(UserService.getInstance().user().getCurrentUser().getAvatarThumb());
        }
        View view3 = getView();
        if (view3 != null) {
            imageView = (ImageView) view3.findViewById(R.id.bip);
        } else {
            imageView = null;
        }
        this.LLILLL = imageView;
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        this.LLILZ = c0jbnLIZ;
        if (c0jbnLIZ != null && (c1324610kZfLIZ = c0jbnLIZ.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)))) != null) {
            c1324610kZfLIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLIZ.LJIIIZ = R.drawable.eze;
            c1324610kZfLIZ.LJJI = true;
            c1324610kZfLIZ.LJIIL = new C1864810ycx(this, 0);
            Room room = this.LL;
            if (room != null && (owner = room.getOwner()) != null) {
                avatarThumb = owner.getAvatarThumb();
            }
            c1324610kZfLIZ.LJIIIZ(avatarThumb);
            c1324610kZfLIZ.LJJI(this.LLILLL);
        }
        View view4 = getView();
        if (view4 != null && (viewFindViewById = view4.findViewById(R.id.qno)) != null) {
            C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_game_demand_2", "live_game_play_together_icon.png");
        }
    }
}
