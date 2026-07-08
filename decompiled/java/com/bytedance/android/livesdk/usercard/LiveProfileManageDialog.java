package com.bytedance.android.livesdk.usercard;

import X.C1161920gLG;
import X.C16F5;
import X.C497740JfY;
import X.C498340JgW;
import X.C500980Jkm;
import X.C748880TZe;
import X.C752140Teu;
import X.InterfaceC749850TbD;
import X.InterfaceC750500TcG;
import X.InterfaceC755430TkD;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveProfileManageDialog extends LiveDialogFragment implements View.OnClickListener, InterfaceC749850TbD, InterfaceC755430TkD, InterfaceC750500TcG {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9PTHELIOSYpOywyOiFiBSYlLRU+Jik6JCABKCEyLyAIIC4/JyI=";
    public C16F5 LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public Room LLIZLLLIL;
    public User LLJ;
    public boolean LLJI = true;

    @Override // X.InterfaceC755430TkD
    public final void FN() {
    }

    @Override // X.InterfaceC749850TbD
    public final void Rk(Exception exc) {
    }

    @Override // X.InterfaceC755430TkD
    public final void TC(C752140Teu c752140Teu, Exception exc) {
    }

    @Override // X.InterfaceC749850TbD
    public final void Xa(int i) {
    }

    @Override // X.InterfaceC750500TcG
    public final void ca(Exception exc) {
    }

    @Override // X.InterfaceC749850TbD
    public final void gx(int i, Exception exc) {
    }

    @Override // X.InterfaceC749850TbD
    public final void il(AdminUserBean adminUserBean, Exception exc) {
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C16F5 NR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nyv) : null;
            this.LLILZIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C16F5 OR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.oxi) : null;
            this.LLILLL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        Bundle arguments = getArguments();
        this.LLJI = arguments != null ? arguments.getBoolean("arg_msg_is_vertical") : true;
        C500980Jkm c500980Jkm = new C500980Jkm(this.LLJI ? R.layout.g_i : R.layout.g_j);
        c500980Jkm.LIZIZ = 0;
        if (this.LLJI) {
            c500980Jkm.LJII = 80;
            c500980Jkm.LJIIIZ = -1;
            c500980Jkm.LJIIJ = -2;
            c500980Jkm.LIZJ = R.style.f945aho;
            return c500980Jkm;
        }
        c500980Jkm.LJII = 5;
        c500980Jkm.LJIIIZ = C497740JfY.LJIIIZ(R.dimen.as0);
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LIZJ = R.style.ahq;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    public final void MR(int i) {
        Serializable serializable;
        String msgContent;
        FragmentManager fragmentManager;
        Serializable serializable2;
        C498340JgW c498340JgW;
        C498340JgW c498340JgW2;
        Bundle arguments = getArguments();
        Long lValueOf = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("report_arg");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof C498340JgW) || (c498340JgW2 = (C498340JgW) serializable) == null || (msgContent = c498340JgW2.getMsgContent()) == null) {
            msgContent = "";
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            IAdminSettingService iAdminSettingService = (IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class);
            Room room = this.LLIZLLLIL;
            if (room == null) {
                room = null;
            }
            long id = room.getId();
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                serializable2 = arguments2.getSerializable("report_arg");
            } else {
                serializable2 = null;
            }
            if ((serializable2 instanceof C498340JgW) && (c498340JgW = (C498340JgW) serializable2) != null) {
                lValueOf = Long.valueOf(c498340JgW.getMsgId());
            }
            iAdminSettingService.M22(id, msgContent, fragmentManager, i, lValueOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0174 A[PHI: r1 r27 r29 r31 r35
      0x0174: PHI (r1v98 X.0JgW) = (r1v100 X.0JgW), (r1v101 X.0JgW) binds: [B:19:0x0059, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r27v5 long) = (r27v6 long), (r27v7 long) binds: [B:19:0x0059, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r29v4 long) = (r29v5 long), (r29v6 long) binds: [B:19:0x0059, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r31v3 java.lang.String) = (r31v4 java.lang.String), (r31v5 java.lang.String) binds: [B:19:0x0059, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r35v2 java.lang.String) = (r35v3 java.lang.String), (r35v4 java.lang.String) binds: [B:19:0x0059, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r40) {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.LiveProfileManageDialog.onClick(android.view.View):void");
    }

    @Override // X.InterfaceC749850TbD
    public final void OO(long j, boolean z) {
        C16F5 c16f5NR;
        int i;
        User user = this.LLJ;
        User user2 = null;
        if (user == null) {
            user = null;
        }
        UserAttr userAttr = user.getUserAttr();
        if (userAttr == null) {
            userAttr = new UserAttr();
            User user3 = this.LLJ;
            if (user3 != null) {
                user2 = user3;
            }
            user2.setUserAttr(userAttr);
        }
        userAttr.isAdmin = z;
        if (this.isViewValid && (c16f5NR = NR()) != null) {
            if (z) {
                i = 2131842823;
            } else {
                i = 2131842822;
            }
            c16f5NR.setText(i);
        }
    }

    @Override // X.InterfaceC750500TcG
    public final void cd(long j, boolean z) {
        int i;
        if (z) {
            MR(1);
        }
        if (this.isViewValid) {
            C16F5 c16f5OR = OR();
            if (z) {
                i = 2131853490;
            } else {
                i = 2131853491;
            }
            c16f5OR.setText(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0131  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.LiveProfileManageDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
