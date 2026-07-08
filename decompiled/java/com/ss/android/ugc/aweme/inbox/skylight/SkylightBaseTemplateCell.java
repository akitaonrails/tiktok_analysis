package com.ss.android.ugc.aweme.inbox.skylight;

import X.C0MTJ;
import X.C1595350rcL;
import X.C1598140rgq;
import X.C1598150rgr;
import X.C1598160rgs;
import X.C1598810rhv;
import X.C1954807lC;
import X.C361680EFy;
import X.C418440Gaw;
import X.C614770O9j;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1598760rhq;
import X.InterfaceC1595080rbu;
import X.InterfaceC1599360rio;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.skylight.template.SkylightTemplateCell;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.celebration.StoryCelebrationInboxParam;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public abstract class SkylightBaseTemplateCell<ITEM extends C1598150rgr> extends PowerCell<ITEM> {
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(122));
    public final int LL = -1;
    public SkylightData LLILLJJLI;
    public TemplateData LLILLL;
    public CustomBizData LLILZ;
    public boolean LLILZIL;

    public abstract void I5(ITEM item);

    public void onAttach() {
    }

    public final Map<String, String> N5() {
        if (this.LLILLJJLI == null) {
            return null;
        }
        Map<Integer, InterfaceC1599360rio> map = SkylightTemplateCell.LLJJ;
        InterfaceC1599360rio interfaceC1599360rio = SkylightTemplateCell.LLJJ.get(Integer.valueOf(P5().bizType));
        if (interfaceC1599360rio != null) {
            return interfaceC1599360rio.LIZ();
        }
        return null;
    }

    public final SkylightData P5() {
        SkylightData skylightData = this.LLILLJJLI;
        if (skylightData != null) {
            return skylightData;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return L5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        C1595350rcL.LIZLLL(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        this.LLILZIL = true;
        T5(EnumC1598760rhq.SHOW, N5());
        onAttach();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        this.LLILZIL = false;
    }

    public int L5() {
        return this.LL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(ITEM item) {
        super.onBindItemView(item);
        this.LLILLJJLI = item.LL;
        SkylightData skylightDataP5 = P5();
        this.LLILLL = skylightDataP5.templateData;
        this.LLILZ = skylightDataP5.customBizData;
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = LLILZLL;
            layoutParams.height = LLIZ;
            C786410Ut5.W5(view, layoutParams);
            I5(item);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static void S5(int i, View... viewArr) {
        for (View view : viewArr) {
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void T5(EnumC1598760rhq enumC1598760rhq, Map<String, String> map) {
        String uid;
        int followStatus;
        Integer num;
        User user;
        User user2;
        String uid2;
        int followStatus2;
        C1598140rgq c1598140rgq;
        String cellType;
        Integer num2;
        User user3;
        String uid3;
        User user4;
        User user5;
        C1598160rgs c1598160rgs = C1598160rgs.LIZ;
        int i = P5().bizType;
        SkylightData skylightDataP5 = P5();
        c1598160rgs.getClass();
        String strLIZIZ = C1598160rgs.LIZIZ(i, skylightDataP5);
        if (strLIZIZ != null) {
            int i2 = C1598810rhv.LIZ[enumC1598760rhq.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    int iLIZ = C1595350rcL.LIZ(this);
                    CustomBizData customBizData = this.LLILZ;
                    if (customBizData != null && (user5 = customBizData.user) != null) {
                        uid2 = user5.getUid();
                    } else {
                        uid2 = null;
                    }
                    CustomBizData customBizData2 = this.LLILZ;
                    if (customBizData2 != null && (user4 = customBizData2.user) != null) {
                        followStatus2 = user4.getFollowStatus();
                    } else {
                        followStatus2 = -1;
                    }
                    C1595350rcL.LIZIZ(this, strLIZIZ, uid2, Integer.valueOf(followStatus2), iLIZ, null, map, 34);
                    InterfaceC1595080rbu interfaceC1595080rbuLIZJ = C614770O9j.LIZIZ.LIZJ();
                    ITEM item = getItem();
                    if (item instanceof C1598140rgq) {
                        c1598140rgq = (C1598140rgq) item;
                    } else {
                        c1598140rgq = null;
                    }
                    String str = "";
                    if (c1598140rgq == null) {
                        cellType = "";
                    } else {
                        cellType = c1598140rgq.getCellType();
                    }
                    int i3 = iLIZ - 1;
                    CustomBizData customBizData3 = this.LLILZ;
                    if (customBizData3 != null && (user3 = customBizData3.user) != null && (uid3 = user3.getUid()) != null) {
                        str = uid3;
                    }
                    interfaceC1595080rbuLIZJ.LJI(i3, "notification_page", null, cellType, null, str, null);
                    StoryCelebrationInboxParam storyCelebrationInboxParamLIZ = C0MTJ.LIZ(P5());
                    if (storyCelebrationInboxParamLIZ != null && (num2 = storyCelebrationInboxParamLIZ.celebrationType) != null && num2.intValue() == 2) {
                        C361680EFy.LJJJJLL(null, "inbox_skylight", null);
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            CustomBizData customBizData4 = this.LLILZ;
            if (customBizData4 != null && (user2 = customBizData4.user) != null) {
                uid = user2.getUid();
            } else {
                uid = null;
            }
            CustomBizData customBizData5 = this.LLILZ;
            if (customBizData5 != null && (user = customBizData5.user) != null) {
                followStatus = user.getFollowStatus();
            } else {
                followStatus = -1;
            }
            C1595350rcL.LIZJ(this, strLIZIZ, uid, followStatus, null, map, 50);
            StoryCelebrationInboxParam storyCelebrationInboxParamLIZ2 = C0MTJ.LIZ(P5());
            if (storyCelebrationInboxParamLIZ2 == null || (num = storyCelebrationInboxParamLIZ2.celebrationType) == null || num.intValue() != 2) {
                return;
            }
            C361680EFy.LJJJJZ(null, "inbox_skylight", null);
        }
    }
}
