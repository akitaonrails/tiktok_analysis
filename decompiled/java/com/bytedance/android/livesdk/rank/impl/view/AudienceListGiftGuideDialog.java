package com.bytedance.android.livesdk.rank.impl.view;

import X.AbstractViewOnClickListenerC1105820esm;
import X.C0IJT;
import X.C0TZM;
import X.C1105370es3;
import X.C16F5;
import X.C16FS;
import X.C187500np;
import X.C354201Zc;
import X.C420660GeW;
import X.C465640INu;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import X.EnumC187400no;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGiftGuideSetting;
import com.bytedance.android.livesdk.rank.impl.view.AudienceListGiftGuideDialog;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import qo2.w;

/* JADX INFO: loaded from: classes.dex */
public final class AudienceListGiftGuideDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiQiImE6HELIOSJTUgZzk6LTJiCDo3ISAiKiofITY4DiY1PAI5ICs2DCwtJSA0";
    public ImageView LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;
    public C16FS LLILZ;
    public View LLILZIL;
    public int LLILZLL = -1;
    public EnumC187400no LLIZ = EnumC187400no.TOP_VIEWER;
    public boolean LLIZLLLIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        DataChannel dataChannel = this.dataChannel;
        boolean zLJJIJIL = C500260Jjc.LJJIJIL(dataChannel != null ? (Boolean) dataChannel.gg0(C0TZM.class) : null);
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g4r);
        c500980Jkm.LIZJ = zLJJIJIL ? R.style.ahb : C497740JfY.LJJ() ? R.style.ahf : R.style.ahg;
        c500980Jkm.LJII = zLJJIJIL ? 80 : C497740JfY.LJJ() ? 3 : 5;
        c500980Jkm.LJI = 0.0f;
        int iLIZIZ = C465640INu.LIZIZ(getContext());
        c500980Jkm.LJIIIZ = zLJJIJIL ? -1 : iLIZIZ;
        if (zLJJIJIL) {
            iLIZIZ = -1;
        }
        c500980Jkm.LJIIJ = iLIZIZ;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long ownerUserId;
        long ownerUserId2;
        String strLIZ;
        String str;
        Room room;
        LiveMode streamType;
        Room room2;
        Room room3;
        Room room4;
        String strValueOf;
        ImageView imageView;
        int i;
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        this.LL = (ImageView) view.findViewById(R.id.l9c);
        Context context = getContext();
        if (context != null && (imageView = this.LL) != null) {
            Resources resources = context.getResources();
            if (this.LLILZLL + 1 != 1) {
                i = R.drawable.et0;
            } else {
                i = R.drawable.esz;
            }
            imageView.setImageDrawable(C420660GeW.LIZ(resources, i, null));
        }
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.z_8);
        this.LLILLL = (C16F5) view.findViewById(R.id.z_7);
        EnumC187400no enumC187400no = this.LLIZ;
        int[] iArr = C187500np.LIZ;
        if (iArr[enumC187400no.ordinal()] == 1) {
            C16F5 c16f5 = this.LLILLJJLI;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131832632));
            }
            if (!this.LLIZLLLIL) {
                strValueOf = "1";
            } else {
                strValueOf = String.valueOf(this.LLILZLL + 1);
            }
            C16F5 c16f52 = this.LLILLL;
            if (c16f52 != null) {
                c16f52.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131832631), Arrays.copyOf(new Object[]{strValueOf}, 1)));
            }
        } else {
            C16F5 c16f53 = this.LLILLJJLI;
            if (c16f53 != null) {
                c16f53.setText(C497740JfY.LJIJI(2131844556));
            }
            C16F5 c16f54 = this.LLILLL;
            if (c16f54 != null) {
                c16f54.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131841013), Arrays.copyOf(new Object[]{String.valueOf(this.LLILZLL + 1)}, 1)));
            }
        }
        this.LLILZ = (C16FS) view.findViewById(R.id.cuw);
        if (iArr[this.LLIZ.ordinal()] == 1) {
            C16FS c16fs = this.LLILZ;
            if (c16fs != null) {
                c16fs.setText(C497740JfY.LJIJI(2131832636));
            }
            C16FS c16fs2 = this.LLILZ;
            if (c16fs2 != null) {
                C786410Ut5.h8(c16fs2, new AbstractViewOnClickListenerC1105820esm() { // from class: X.01vp
                    @Override // X.AbstractViewOnClickListenerC1105820esm
                    public final void LIZ() {
                        AudienceListGiftGuideDialog audienceListGiftGuideDialog = this.LLILZIL;
                        C1105370es3.LIZJ(audienceListGiftGuideDialog.dataChannel, audienceListGiftGuideDialog.LLILZLL, audienceListGiftGuideDialog.LLIZ);
                        this.LLILZIL.dismiss();
                    }

                    {
                        super(1200L);
                    }
                });
            }
        } else {
            C16FS c16fs3 = this.LLILZ;
            if (c16fs3 != null) {
                c16fs3.setText(C497740JfY.LJIJI(2131841011));
            }
            C16FS c16fs4 = this.LLILZ;
            if (c16fs4 != null) {
                C786410Ut5.h8(c16fs4, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0es7
                    @Override // X.AbstractViewOnClickListenerC1105820esm
                    public final void LIZ() {
                        AudienceListGiftGuideDialog audienceListGiftGuideDialog = this.LLILZIL;
                        C1105370es3.LIZJ(audienceListGiftGuideDialog.dataChannel, audienceListGiftGuideDialog.LLILZLL, audienceListGiftGuideDialog.LLIZ);
                        AudienceListGiftGuideDialog audienceListGiftGuideDialog2 = this.LLILZIL;
                        audienceListGiftGuideDialog2.getClass();
                        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).sendGiftInternal(audienceListGiftGuideDialog2.getContext(), new C1129400fUo(OnlineAudienceGiftGuideSetting.INSTANCE.getValue().giftId, 1, new InterfaceC1125350fOH() { // from class: X.0esM
                            @Override // X.InterfaceC1125350fOH
                            public final void LIZ(Throwable th) {
                            }

                            @Override // X.InterfaceC1125350fOH
                            public final void LIZIZ(SendGiftResult sendGiftResult) {
                            }
                        }, 0, "top2_empty_slot_page", true, 0, 0, null, 15392));
                        this.LLILZIL.dismiss();
                    }

                    {
                        super(1200L);
                    }
                });
            }
        }
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.jux);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new AbstractViewOnClickListenerC1105820esm() { // from class: X.01vq
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    this.LLILZIL.dismiss();
                }

                {
                    super(1200L);
                }
            });
        }
        View viewFindViewById = view.findViewById(R.id.yg_);
        this.LLILZIL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1105820esm() { // from class: X.01vr
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    this.LLILZIL.dismiss();
                }

                {
                    super(1200L);
                }
            }, viewFindViewById);
        }
        DataChannel dataChannel = this.dataChannel;
        int i2 = this.LLILZLL;
        EnumC187400no enumC187400no2 = this.LLIZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_top2_empty_slot_page_show");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        long id = 0;
        if (dataChannel != null && (room4 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room4.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        if (dataChannel != null && (room3 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId2 = room3.getOwnerUserId();
        } else {
            ownerUserId2 = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(ownerUserId2), "author_id");
        if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room2.getId();
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = "";
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            c474500IjALIZ.LJJII("null", "user_rank");
        } else {
            c474500IjALIZ.LJJII(Long.valueOf(C1105370es3.LIZ()), "user_rank");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i2 + 1), "slot_rank");
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LJJII(enumC187400no2.getRankingName(), "rank_type");
        c474500IjALIZ.LIZ();
    }
}
