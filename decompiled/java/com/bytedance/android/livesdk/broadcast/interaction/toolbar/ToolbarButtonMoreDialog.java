package com.bytedance.android.livesdk.broadcast.interaction.toolbar;

import X.C1548820qPI;
import X.C1871910yoP;
import X.C262100zr;
import X.C389001fE;
import X.C497740JfY;
import X.C500980Jkm;
import X.EnumC1088870eRR;
import X.EnumC1088900eRU;
import X.EnumC1102750enp;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import Y.AUListenerS217S0200000_7;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.CppSeeDetailsClickEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public final class ToolbarButtonMoreDialog extends LiveDialogFragment implements InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZyY9HELIOSPCA+KCwnISoiZzs8JykuKD19HCojJS0yOgc5PTs8JggjOyoXISQgJig=";
    public final List<EnumC1102750enp> LL;
    public final DataChannel LLILLJJLI;
    public LinearLayout LLILLL;
    public LinearLayout LLILZ;
    public ValueAnimator LLILZIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g8s);
        c500980Jkm.LIZIZ = 2;
        c500980Jkm.LIZJ = R.style.ai0;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 50;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
    }

    public final void MR(C262100zr c262100zr) {
        float fLIZLLL;
        ValueAnimator duration;
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.sur);
            } else {
                viewFindViewById = null;
            }
            this.LLILZ = (LinearLayout) viewFindViewById;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null) {
            fLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "height", 160);
        } else {
            fLIZLLL = 160.0f;
        }
        ValueAnimator valueAnimatorOfInt = ObjectAnimator.ofInt(layoutParams.height, (int) C497740JfY.LIZIZ(fLIZLLL));
        this.LLILZIL = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.addUpdateListener(new AUListenerS217S0200000_7(layoutParams, this, 2));
        }
        ValueAnimator valueAnimator = this.LLILZIL;
        if (valueAnimator != null && (duration = valueAnimator.setDuration(300L)) != null) {
            duration.start();
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws JSONException {
        Boolean boolValueOf;
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (Intrinsics.LJFF(c262100zr.LIZ, "anchor_center_request_room_info")) {
            MR(c262100zr);
            JSONObject jSONObject = new JSONObject();
            w.LIZ.getClass();
            jSONObject.put("room_id", String.valueOf(w.LJIJJ()));
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                boolValueOf = Boolean.valueOf(roomAuthStatus.isEnableGift());
            } else {
                boolValueOf = null;
            }
            jSONObject.put("gift_permission", boolValueOf);
            C389001fE.LIZ("anchor_center_response_room_info", jSONObject, System.currentTimeMillis(), false);
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "anchor_center_receive_flash_card")) {
            MR(c262100zr);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.LLILLJJLI;
        dataChannel.BQ2(this, DismissToolbarPopEvent.class, new AwS586S0100000_7(this, 23));
        dataChannel.BQ2(this, CppSeeDetailsClickEvent.class, new AwS586S0100000_7(this, 24));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        EnumC1088870eRR.POPUP.release(this.dataChannel);
        C1548820qPI.LJIIIIZZ("anchor_center_request_room_info", this);
        C1548820qPI.LJIIIIZZ("anchor_center_receive_flash_card", this);
    }

    public ToolbarButtonMoreDialog(DataChannel dataChannel, List list) {
        this.LL = list;
        this.LLILLJJLI = dataChannel;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EnumC1088870eRR enumC1088870eRR = EnumC1088870eRR.POPUP;
        DataChannel dataChannel = this.LLILLJJLI;
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.y6v);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (LinearLayout) viewFindViewById;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        if (viewGroup == null) {
            return;
        }
        enumC1088870eRR.createHolder(dataChannel, viewGroup, this.LL, EnumC1088900eRU.ICON_TITLE_HORIZONTAL);
        C1548820qPI.LIZLLL("anchor_center_request_room_info", this);
        C1548820qPI.LIZLLL("anchor_center_receive_flash_card", this);
    }
}
