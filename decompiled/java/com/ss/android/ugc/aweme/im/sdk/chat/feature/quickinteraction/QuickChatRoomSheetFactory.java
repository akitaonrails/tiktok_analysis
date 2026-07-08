package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction;

import X.AbstractC1387200mCc;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1391850mK7;
import X.C1906580ziK;
import X.C19EG;
import X.C2211631BhB;
import X.C259800zU;
import X.C299110Bnx;
import X.C786410Ut5;
import X.C907030Zi9;
import X.C907050ZiB;
import X.DialogInterfaceOnDismissListenerC913920ZtG;
import X.InterfaceC913210Zs7;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.chatroom.api.IQuickChatRoomSheetFactory;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.common.view.IgnoreRecyclerAndPagerBottomSheetBehaviour;
import com.ss.android.ugc.aweme.im.common.view.TuxIgnoreRecyclerAndPagerSheetBehaviour;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;

/* JADX INFO: loaded from: classes15.dex */
public final class QuickChatRoomSheetFactory implements IQuickChatRoomSheetFactory {
    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IQuickChatRoomSheetFactory
    public final void LIZLLL() {
        C19EG c19egLIZIZ;
        DialogFragment dialogFragment;
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
            if (activityLIZIZ != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
                Fragment fragmentLJJJJZI = c19egLIZIZ.getSupportFragmentManager().LJJJJZI("quick_chat_sheet");
                if ((fragmentLJJJJZI instanceof TuxSheet) && (dialogFragment = (DialogFragment) fragmentLJJJJZI) != null) {
                    dialogFragment.dismissAllowingStateLoss();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IQuickChatRoomSheetFactory
    public final void LIZ(FragmentManager fragmentManager) {
        Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI("quick_chat_sheet");
        if (fragmentLJJJJZI instanceof DialogFragment) {
            ((DialogFragment) fragmentLJJJJZI).dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IQuickChatRoomSheetFactory
    public final boolean LIZJ(Fragment fragment) {
        return fragment instanceof BaseQuickChatRoomFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IQuickChatRoomSheetFactory
    public final TuxSheet LIZIZ(C19EG c19eg, EnterChatParams enterChatParams, InterfaceC913210Zs7 interfaceC913210Zs7) {
        boolean z;
        DialogFragment dialogFragment;
        if (enterChatParams.getSessionId() == null) {
            return null;
        }
        C907030Zi9.LJFF.getClass();
        C907050ZiB.LIZ().LIZJ(enterChatParams);
        IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJIL();
        Fragment fragmentLJJJJZI = c19eg.getSupportFragmentManager().LJJJJZI("quick_chat_sheet");
        if (!(fragmentLJJJJZI instanceof BaseQuickChatRoomFragment) || fragmentLJJJJZI == null) {
            fragmentLJJJJZI = new BaseQuickChatRoomFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "key_enter_chat_params", enterChatParams);
            bundle.putBoolean("key_expand_to_fullscreen", enterChatParams.getFullScreenByDefault());
            fragmentLJJJJZI.setArguments(bundle);
        }
        C259800zU c259800zU = new C259800zU();
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = fragmentLJJJJZI;
        c1390920mIc.LJIIIIZZ(4);
        c1390920mIc.LJI(48);
        if (enterChatParams.getDisableBackGroundMaskForQuickChat() == 0) {
            z = true;
        } else {
            z = false;
        }
        c1390920mIc.LIZ.LLJJIJIIJIL = z;
        boolean fullScreenByDefault = enterChatParams.getFullScreenByDefault();
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLL = fullScreenByDefault;
        tuxSheet.LLJLILLLLZIIL = false;
        if (C299110Bnx.LIZ()) {
            c1390920mIc.LIZ.LLLIIIIL = new TuxIgnoreRecyclerAndPagerSheetBehaviour();
        } else {
            c1390920mIc.LIZ.LLLIIII = new IgnoreRecyclerAndPagerBottomSheetBehaviour();
        }
        DialogInterfaceOnDismissListenerC913920ZtG dialogInterfaceOnDismissListenerC913920ZtG = new DialogInterfaceOnDismissListenerC913920ZtG(c259800zU, interfaceC913210Zs7, 1);
        ?? r0 = c1390920mIc.LIZ;
        r0.LLILLJJLI = dialogInterfaceOnDismissListenerC913920ZtG;
        c259800zU.element = r0;
        C2211631BhB.LJIIJ(r0);
        Object obj = c259800zU.element;
        if (obj == null) {
            obj = null;
        }
        C1391850mK7.LIZIZ(obj, "quick_chat_sheet");
        T t = c259800zU.element;
        if (t == 0) {
            dialogFragment = null;
        } else {
            dialogFragment = (DialogFragment) t;
        }
        dialogFragment.show(c19eg.getSupportFragmentManager(), "quick_chat_sheet");
        if (interfaceC913210Zs7 != null) {
            interfaceC913210Zs7.onShow();
        }
        T t2 = c259800zU.element;
        if (t2 == 0) {
            return null;
        }
        return (TuxSheet) t2;
    }
}
