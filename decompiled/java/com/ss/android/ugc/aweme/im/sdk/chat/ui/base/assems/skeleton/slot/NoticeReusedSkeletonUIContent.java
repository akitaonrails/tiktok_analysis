package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.slot;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0I6Y;
import X.C0QSJ;
import X.C0ZOH;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1672806go;
import X.C1807670x8n;
import X.C19719912Dl;
import X.C19MX;
import X.C2217381BqS;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C898880ZOc;
import X.C898900ZOe;
import X.InterfaceC1146704e9;
import X.InterfaceC1808750xAX;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem;
import com.ss.android.ugc.aweme.im.service.IMessageViewHelper;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.AISelfStickerInlineViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public class NoticeReusedSkeletonUIContent extends ReusedSkeletonUIContentAssem<NoticeReusedSkeletonUIContent, C898880ZOc> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1559260qg8 LLJJJJJIL;
    public final C1559260qg8 LLJJJJLIIL;
    public final C01GW LLJJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public CheckMessage LLJLIL;
    public volatile InterfaceC1808750xAX LLJLILLLLZIIL;
    public volatile SessionInfo LLJLL;
    public InterfaceC665370Q7z LLJLLIL;
    public C0QSJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NoticeReusedSkeletonUIContent.class, "photo2StickerRepo", "getPhoto2StickerRepo()Lcom/ss/android/ugc/aweme/im/sticker/api/service/photo2sticker/Photo2StickerInlineRepository;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(NoticeReusedSkeletonUIContent.class, "photo2StickerSessionInfo", "getPhoto2StickerSessionInfo()Lcom/ss/android/ugc/aweme/im/chatroom/api/model/SessionInfo;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    public final InterfaceC1808750xAX kp() {
        InterfaceC1808750xAX interfaceC1808750xAX = this.LLJLILLLLZIIL;
        if (interfaceC1808750xAX == null) {
            synchronized (this) {
                interfaceC1808750xAX = this.LLJLILLLLZIIL;
                if (interfaceC1808750xAX == null) {
                    InterfaceC1808750xAX interfaceC1808750xAX2 = (InterfaceC1808750xAX) C1807670x8n.LLLLZIL();
                    this.LLJLILLLLZIIL = interfaceC1808750xAX2;
                    return interfaceC1808750xAX2;
                }
            }
        }
        return interfaceC1808750xAX;
    }

    public NoticeReusedSkeletonUIContent() {
        super(C0ZOH.LIZ);
        this.LLJJJJJIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJJJJLIIL = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
        this.LLJJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 813));
        C019F c019f = C019F.LIZ;
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 814);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(Photo2StickerViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 815), AFwS248S0000000_14.get$arr$(233), awS558S0100000_14, true);
        AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(210);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AISelfStickerInlineViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 816), AFwS248S0000000_14.get$arr$(234), aFwS201S0000000_14, true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem
    public final void dp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)), BaseContent.class);
        if (orParseJsonContent != null && orParseJsonContent.getExtContent() != null) {
            IMessageViewHelper.LIZ.getClass();
            IMessageViewHelper iMessageViewHelperLIZ = C1672806go.LIZ();
            if (iMessageViewHelperLIZ != null) {
                iMessageViewHelperLIZ.LIZLLL(orParseJsonContent.getExtContent(), ((C457780HxI) this.LLJJJJJIL.getValue()).LL.getUuid());
                return;
            }
            return;
        }
        if (this.LLJLIL != null) {
            IMessageViewHelper.LIZ.getClass();
            IMessageViewHelper iMessageViewHelperLIZ2 = C1672806go.LIZ();
            if (iMessageViewHelperLIZ2 != null) {
                iMessageViewHelperLIZ2.LIZLLL(CheckMessage.Companion.getContent(this.LLJLIL), ((C457780HxI) this.LLJJJJJIL.getValue()).LL.getUuid());
            }
        }
    }

    public final SessionInfo ip() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJLLL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLLIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJLLIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLJLLL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        SessionInfo sessionInfo = (SessionInfo) c0qsjLIZLLL.getAbility(SessionInfo.class);
        C687700QyG.LJ(sessionInfo, SessionInfo.class);
        return sessionInfo;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        try {
            super.Co();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            View view = getSupervisor().LLJJIII;
            if (view != null) {
                this.LLJJI = view.findViewById(R.id.pd8);
                Ao(LJJIJL());
                Eo(LJJIJL());
            }
        }
        View view2 = getSupervisor().LLJJIII;
        if (view2 != null) {
            C19MX c19mx = (C19MX) view2.findViewById(R.id.euq);
            if (c19mx != null) {
                c19mx.setReferencedIds(new int[]{R.id.o9p, R.id.pd8});
            }
            view2.requestLayout();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        super.Eo(view);
        C786410Ut5.LJLLLLLL(8, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x045b  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ep(X.C869590Y9l r27, X.C898880ZOc r28) {
        /*
            Method dump skipped, instruction units count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.slot.NoticeReusedSkeletonUIContent.ep(X.0Y9l, java.lang.Object):void");
    }
}
