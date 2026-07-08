package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.AnonymousClass0956;
import X.C09R9;
import X.C0OIU;
import X.C0ONJ;
import X.C0OP5;
import X.C0OPQ;
import X.C0PEM;
import X.C13LE;
import X.C13LP;
import X.C23250099c;
import X.C618350ONd;
import X.C618380ONg;
import X.InterfaceC0148002o;
import X.InterfaceC736910SvR;
import android.os.Message;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBizResourceEntryToggle;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardUpdateInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS36S2100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardEditViewModel extends AssemViewModel<C618380ONg> implements WeakHandler.IHandler {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public AnonymousClass0956 LL;
    public boolean LLILLJJLI;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public List<BulletinBizResourceEntryToggle> LLJJIJI;
    public final C09R9 LLILLL = new C09R9(this, C13LE.LIZ(C0ONJ.class));
    public String LLJ = "";
    public String LLJI = "";
    public boolean LLJILLL = true;
    public String LLJJ = "";
    public String LLJJI = "notification_page";
    public String LLJJIII = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C618380ONg(0);
    }

    public final InterfaceC736910SvR<C0OIU> vQ2() {
        return (InterfaceC736910SvR) this.LLILLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (!this.LLJILJILJ || this.LLILLJJLI) {
            return;
        }
        ((C0OIU) vQ2().getOperator()).LLIILZL(new BulletinBoardUpdateInfo(this.LLJ, this.LLJIJIL, null, this.LLJI, Boolean.valueOf(this.LLJILJIL), Boolean.FALSE));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Object messageObj;
        String str;
        AvatarUri avatarUri;
        AvatarUri avatarUri2;
        List<String> list;
        String str2 = null;
        if (message != null) {
            messageObj = HandlerHook.getMessageObj(message.obj);
        } else {
            messageObj = null;
        }
        if (messageObj instanceof AvatarUri) {
            Object messageObj2 = HandlerHook.getMessageObj(message.obj);
            if ((messageObj2 instanceof AvatarUri) && (avatarUri2 = (AvatarUri) messageObj2) != null && (list = avatarUri2.urlList) != null) {
                str = (String) C13LP.LJJJLL(list);
            } else {
                str = null;
            }
            Object messageObj3 = HandlerHook.getMessageObj(message.obj);
            if ((messageObj3 instanceof AvatarUri) && (avatarUri = (AvatarUri) messageObj3) != null) {
                str2 = avatarUri.uri;
            }
            if (this.LLJILJILJ) {
                C0OP5.LJI.LJIIL(1, "is_change_avatar_success");
            }
            withState(new AwS36S2100000_9(this, str, str2, 2));
            return;
        }
        setState(AFwS240S0000000_9.get$arr$(338));
        if (!this.LLJILJILJ) {
            return;
        }
        C0OPQ c0opq = C0OPQ.LIZ;
        String str3 = this.LLJJI;
        boolean z = this.LLJILJIL;
        String str4 = this.LLJJ;
        c0opq.getClass();
        C0OPQ.LJIIZILJ(str3, z, "photo_fail", str4, CardStruct.IStatusCode.DEFAULT, 0, "");
        C0OP5 c0op5 = C0OP5.LJI;
        c0op5.LJIIL(2, "is_change_avatar_success");
        c0op5.LJIIL(-9999, "error_code");
        if (!c0op5.LJI()) {
            return;
        }
        C0OP5.LJIILIIL.put("error_msg", "avatar upload error");
    }

    public final void yQ2(String str) {
        AnonymousClass0956 anonymousClass0956 = this.LL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJ = str;
        this.LL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C618350ONd(this, str, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6 A[PHI: r9
      0x00e6: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v5 java.lang.String) binds: [B:49:0x00e3, B:42:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(java.lang.String r13, java.lang.String r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel.wQ2(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(java.lang.String r22, java.lang.String r23, java.lang.String r24, X.InterfaceC1364105Vn<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel.xQ2(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
