package kotlin.jvm.internal;

import X.AbstractC855890Xhr;
import X.AbstractC857240Xk2;
import X.C01GW;
import X.C09AY;
import X.C0I0B;
import X.C0I44;
import X.C0Y8T;
import X.C0YMW;
import X.C0YTK;
import X.C0Z2Z;
import X.C0ZL0;
import X.C0ZQI;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C19EG;
import X.C2188811AlT;
import X.C857220Xk0;
import X.C869590Y9l;
import X.C882400YjW;
import X.C882690Yjz;
import X.C891780Yye;
import X.C896000ZDa;
import X.C900720ZVe;
import X.C911220Zou;
import X.C912070ZqH;
import X.EnumC1711006my;
import X.EnumC1786290waJ;
import X.EnumC448510HiL;
import X.InterfaceC856160XiI;
import Y.AObserverS79S0400000_14;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.IMMessageListApi;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPhotoClickAbility;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS111S0400000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS111S0400000_14 awS111S0400000_14, Object obj) {
        ((C891780Yye) awS111S0400000_14.l0).LIZJ = (Integer) obj;
        ((C891780Yye) awS111S0400000_14.l0).LIZ((TuxIconView) awS111S0400000_14.l1, (TuxIconView) awS111S0400000_14.l2, (TuxIconView) awS111S0400000_14.l3, false, false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS111S0400000_14 awS111S0400000_14, Object obj) {
        IMMessageListApi.LIZ.getClass();
        return C896000ZDa.LIZ().LIZIZ().LJII(((C0I44) awS111S0400000_14.l0).LL, (C869590Y9l) awS111S0400000_14.l1, (BaseContent) awS111S0400000_14.l2, new AwS558S0100000_14((ReferenceInfoHint) awS111S0400000_14.l3, 1293));
    }

    public static final Object invoke$2(AwS111S0400000_14 awS111S0400000_14, Object obj) {
        IMUser singleChatFromUser;
        View view = (View) obj;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ != null) {
            AIGroupShotCardTemplate aIGroupShotCardTemplate = (AIGroupShotCardTemplate) awS111S0400000_14.l0;
            if (!((SessionInfo) awS111S0400000_14.l1).isSingleChat() || ((singleChatFromUser = ((SessionInfo) awS111S0400000_14.l1).getSingleChatFromUser()) != null && singleChatFromUser.getFollowStatus() == 2)) {
                C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
                c912070ZqH.LJIIZILJ().LJ(c19egLIZIZ, ((SessionInfo) awS111S0400000_14.l1).getConversationId(), aIGroupShotCardTemplate.templateInfo.templateId, EnumC1786290waJ.GROUP_SHOT_CARD, EnumC1711006my.JOIN, "chat", ((SessionInfo) awS111S0400000_14.l1).getChatType(), false, aIGroupShotCardTemplate.taskId, null, Long.valueOf(((C869590Y9l) awS111S0400000_14.l2).getMsgId()));
                c912070ZqH.LJIIL().LJIILIIL(((SessionInfo) awS111S0400000_14.l1).getChatType(), EnumC448510HiL.ADD_PHOTO, C0I0B.LJFF.LIZIZ());
                ((C0ZQI) awS111S0400000_14.l3).LJ(C0ZL0.ADD_AI_GROUP_SHOT, null);
            } else {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIIZ(2131830918);
                c1389890mGx.LJIIJJI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS111S0400000_14 awS111S0400000_14, Object obj) {
        PictureCardTemplate pictureCardTemplate;
        MessageListPhotoClickAbility messageListPhotoClickAbility;
        View view = (View) obj;
        C900720ZVe c900720ZVe = (C900720ZVe) awS111S0400000_14.l0;
        C869590Y9l c869590Y9l = (C869590Y9l) awS111S0400000_14.l1;
        c900720ZVe.getClass();
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if ((baseTemplateLIZ instanceof PictureCardTemplate) && (pictureCardTemplate = (PictureCardTemplate) baseTemplateLIZ) != null) {
            Aweme awemeLIZLLL = C911220Zou.LIZLLL((C869590Y9l) awS111S0400000_14.l1, Boolean.valueOf(((SessionInfo) awS111S0400000_14.l2).isMediaMsgMasking()));
            C01GW c01gw = (C01GW) awS111S0400000_14.l3;
            if (c01gw != null && (messageListPhotoClickAbility = (MessageListPhotoClickAbility) c01gw.getValue()) != null) {
                messageListPhotoClickAbility.KG0(view, (C869590Y9l) awS111S0400000_14.l1, pictureCardTemplate, awemeLIZLLL);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS111S0400000_14 awS111S0400000_14, Object obj) {
        C1397510mTF c1397510mTF = (C1397510mTF) obj;
        ((InterfaceC856160XiI) awS111S0400000_14.l0).LIZIZ((AbstractC857240Xk2) awS111S0400000_14.l1);
        AbstractC855890Xhr abstractC855890Xhr = (AbstractC855890Xhr) awS111S0400000_14.l2;
        abstractC855890Xhr.LJI.observe(abstractC855890Xhr.LIZIZ, new AObserverS79S0400000_14(c1397510mTF, (Function0) awS111S0400000_14.l3, (InterfaceC856160XiI) awS111S0400000_14.l0, (AbstractC857240Xk2) awS111S0400000_14.l1, 1));
        AbstractC855890Xhr abstractC855890Xhr2 = (AbstractC855890Xhr) awS111S0400000_14.l2;
        abstractC855890Xhr2.LJII.observe(abstractC855890Xhr2.LIZIZ, new AObserverS79S0400000_14(c1397510mTF, (Function0) awS111S0400000_14.l3, (InterfaceC856160XiI) awS111S0400000_14.l0, (AbstractC857240Xk2) awS111S0400000_14.l1, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS111S0400000_14 awS111S0400000_14, Object obj) {
        C0YTK c0ytk;
        C0YTK c0ytk2;
        C869590Y9l c869590Y9l = (C869590Y9l) obj;
        int andIncrement = ((AtomicInteger) awS111S0400000_14.l0).getAndIncrement();
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendMessagesInOrder onSuccess, index: ");
        sbLIZ.append(andIncrement);
        C2188811AlT.LIZIZ(sbLIZ);
        C882690Yjz.LJ("OrderedSendStrategy");
        C0YTK c0ytk3 = (C0YTK) awS111S0400000_14.l1;
        if (c0ytk3 != null) {
            c0ytk3.LJ((C0Y8T) awS111S0400000_14.l2, c869590Y9l);
        }
        int i = andIncrement + 1;
        if (i < ((List) awS111S0400000_14.l3).size() && (c0ytk2 = (C0YTK) awS111S0400000_14.l1) != null) {
            c0ytk2.LIZLLL((C0Y8T) awS111S0400000_14.l2, (C869590Y9l) ListProtector.get((List) awS111S0400000_14.l3, i));
        }
        if (i == ((List) awS111S0400000_14.l3).size() && (c0ytk = (C0YTK) awS111S0400000_14.l1) != null) {
            c0ytk.LIZIZ((C0Y8T) awS111S0400000_14.l2, new ArrayList((List) awS111S0400000_14.l3), new LinkedHashMap());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS111S0400000_14 awS111S0400000_14, Object obj) {
        C0YMW c0ymw = (C0YMW) obj;
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendMessagesInOrder onError: ");
        sbLIZ.append(c0ymw);
        C882690Yjz.LJFF("OrderedSendStrategy", C2188811AlT.LIZIZ(sbLIZ));
        C0YTK c0ytk = (C0YTK) awS111S0400000_14.l0;
        if (c0ytk != null) {
            c0ytk.LJII((C0Y8T) awS111S0400000_14.l1, (C869590Y9l) ListProtector.get((List) awS111S0400000_14.l2, ((AtomicInteger) awS111S0400000_14.l3).get()), c0ymw);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS111S0400000_14(X.C0YTK r3, X.C0Y8T r4, java.util.List r5, java.util.concurrent.atomic.AtomicInteger r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 5 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r6
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r6
            r1.l1 = r3
            r1.l2 = r4
            r1.l3 = r5
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS111S0400000_14.<init>(X.0YTK, X.0Y8T, java.util.List, java.util.concurrent.atomic.AtomicInteger, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0400000_14(C0I44 c0i44, C869590Y9l c869590Y9l, BaseContent baseContent, ReferenceInfoHint referenceInfoHint, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0i44;
        this.l1 = c869590Y9l;
        this.l2 = baseContent;
        this.l3 = referenceInfoHint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0400000_14(C857220Xk0 c857220Xk0, AbstractC857240Xk2 abstractC857240Xk2, AbstractC855890Xhr abstractC855890Xhr, AwS558S0100000_14 awS558S0100000_14, int i) {
        super(1);
        this.$t = i;
        this.l0 = c857220Xk0;
        this.l1 = abstractC857240Xk2;
        this.l2 = abstractC855890Xhr;
        this.l3 = awS558S0100000_14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0400000_14(C869590Y9l c869590Y9l, SessionInfo sessionInfo, AIGroupShotCardTemplate aIGroupShotCardTemplate, C0ZQI c0zqi, int i) {
        super(1);
        this.$t = i;
        this.l0 = aIGroupShotCardTemplate;
        this.l1 = sessionInfo;
        this.l2 = c869590Y9l;
        this.l3 = c0zqi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0400000_14(C891780Yye c891780Yye, TuxIconView tuxIconView, TuxIconView tuxIconView2, TuxIconView tuxIconView3, int i) {
        super(1);
        this.$t = i;
        this.l0 = c891780Yye;
        this.l1 = tuxIconView;
        this.l2 = tuxIconView2;
        this.l3 = tuxIconView3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS111S0400000_14(C900720ZVe c900720ZVe, C900720ZVe c900720ZVe2, C869590Y9l c869590Y9l, SessionInfo sessionInfo, C01GW<? extends MessageListPhotoClickAbility> c01gw) {
        super(1);
        this.$t = c01gw;
        this.l0 = c900720ZVe;
        this.l1 = c900720ZVe2;
        this.l2 = c869590Y9l;
        this.l3 = sessionInfo;
    }
}
