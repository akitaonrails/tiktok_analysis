package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C01GW;
import X.C09R3;
import X.C1341720l1G;
import X.C1345700l7g;
import X.C1346420l8q;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397630mTR;
import X.C13LE;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C19FO;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C295780Bia;
import X.C295880Bik;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C724240Sb0;
import X.C726120Se2;
import X.C735370Ssx;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS117S0400000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentGiftSelectAssem extends UISlotAssem implements IGiftSelectAbility, IKeyboardProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 556));
    public final C726120Se2 LLJJIII = new C726120Se2();
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 129));
    public final C01GW LLJJIJIIJIL;
    public final C726120Se2 LLJJIJIL;
    public C1341720l1G LLJJJ;
    public boolean LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentGiftSelectAssem.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommentGiftSelectAssem.class, "keyboardSource", "getKeyboardSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public CommentGiftSelectAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 24));
        this.LLJJIJIL = new C726120Se2();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a2o;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IGiftSelectAbility
    public final boolean T61() {
        GiftViewModel giftViewModelHp;
        CommentKeyboardModel keyboardModel;
        MutableLiveData<GiftStruct> mutableLiveDataWQ2;
        C19EG c19eg = (C19EG) this.LLJJI.getValue();
        if (c19eg == null || (giftViewModelHp = hp()) == null) {
            return false;
        }
        GiftStruct value = giftViewModelHp.wQ2().getValue();
        if (!VideoGiftService.LJI().LIZLLL() || value == null || value.isFromGiftBag()) {
            return false;
        }
        Long value2 = giftViewModelHp.vQ2().getValue();
        if (value2 != null && value2.longValue() == Long.MIN_VALUE) {
            return false;
        }
        long j = value.diamondCount;
        Long value3 = giftViewModelHp.vQ2().getValue();
        if (j <= (value3 != null ? value3.longValue() : 0L)) {
            return false;
        }
        C1397630mTR c1397630mTR = new C1397630mTR(c19eg);
        c1397630mTR.LJ(2131858221, new AwS117S0400000_21(c19eg, value, giftViewModelHp, this, 17));
        c1397630mTR.LJI(R.string.f1_, new AwS387S0200000_21(giftViewModelHp, c19eg, 107));
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJFF(2131858207);
        c1397580mTM.LJIIL = c1397630mTR;
        new C1397510mTF(c1397580mTM).LIZLLL();
        CommentContextSource commentContextSourceIp = ip();
        Aweme aweme = commentContextSourceIp != null ? CommentContextSourceKt.aweme(commentContextSourceIp) : null;
        CommentContextSource commentContextSourceIp2 = ip();
        String strEnterFrom = commentContextSourceIp2 != null ? CommentContextSourceKt.enterFrom(commentContextSourceIp2) : null;
        GiftViewModel giftViewModelHp2 = hp();
        GiftStruct value4 = (giftViewModelHp2 == null || (mutableLiveDataWQ2 = giftViewModelHp2.wQ2()) == null) ? null : mutableLiveDataWQ2.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
        CommentContextSource commentContextSourceIp3 = ip();
        c2344009Gk.LJIIIIZZ("enter_method", (commentContextSourceIp3 == null || (keyboardModel = commentContextSourceIp3.getKeyboardModel()) == null) ? null : keyboardModel.getGiftSendEnterMethod());
        c2344009Gk.LJIIIIZZ("group_id", C735370Ssx.LIZJ(aweme));
        c2344009Gk.LJ(value4 != null ? Long.valueOf(value4.id) : null, "gift_id");
        c2344009Gk.LJIIIIZZ("author_id", C735370Ssx.LIZLLL(aweme));
        C20684815ws.LJIILLIIL("show_comment_recharge_popup", c2344009Gk.LIZ);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void g20() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final GiftViewModel hp() {
        return (GiftViewModel) this.LLJJIJI.getValue();
    }

    public final CommentContextSource ip() {
        C726120Se2 c726120Se2 = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return c726120Se2.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IGiftSelectAbility
    public final Long HR() {
        MutableLiveData<Long> mutableLiveDataVQ2;
        GiftViewModel giftViewModelHp = hp();
        if (giftViewModelHp == null || (mutableLiveDataVQ2 = giftViewModelHp.vQ2()) == null) {
            return null;
        }
        return mutableLiveDataVQ2.getValue();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IGiftSelectAbility
    public final void MM1() {
        MutableLiveData<GiftStruct> mutableLiveDataWQ2;
        GiftViewModel giftViewModelHp = hp();
        if (giftViewModelHp == null || (mutableLiveDataWQ2 = giftViewModelHp.wQ2()) == null) {
            return;
        }
        mutableLiveDataWQ2.setValue(null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        GiftViewModel giftViewModelHp;
        super.onDestroy();
        C19FO c19fo = (C19FO) this.LLJJI.getValue();
        if (c19fo == null || (giftViewModelHp = hp()) == null) {
            return;
        }
        giftViewModelHp.vQ2().removeObservers(c19fo);
        giftViewModelHp.wQ2().removeObservers(c19fo);
        giftViewModelHp.xQ2().removeObservers(c19fo);
        giftViewModelHp.yQ2().removeObservers(c19fo);
        ((LiveData) giftViewModelHp.LLILZIL.getValue()).removeObservers(c19fo);
        giftViewModelHp.vQ2().setValue(Long.MIN_VALUE);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7zLJIL = C1345700l7g.LJIL(this);
        if (interfaceC665370Q7zLJIL != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIL, this, IGiftSelectAbility.class, null, null);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            this.LLJJJIL = Intrinsics.LJFF(interfaceC665370Q7zLJIL, c19egLIZ != null ? C1558360qeg.LJI(c19egLIZ, null) : null);
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IKeyboardProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
        MutableLiveData<GiftStruct> mutableLiveDataWQ2;
        GiftViewModel giftViewModelHp = hp();
        if (giftViewModelHp == null || (mutableLiveDataWQ2 = giftViewModelHp.wQ2()) == null) {
            return;
        }
        mutableLiveDataWQ2.setValue(null);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IGiftSelectAbility
    public final GiftStruct pq1() {
        MutableLiveData<GiftStruct> mutableLiveDataWQ2;
        GiftViewModel giftViewModelHp = hp();
        if (giftViewModelHp == null || (mutableLiveDataWQ2 = giftViewModelHp.wQ2()) == null) {
            return null;
        }
        return mutableLiveDataWQ2.getValue();
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return this.LLJJJIL;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        C01GW c01gw = C295880Bik.LIZ;
        if (C295880Bik.LIZLLL) {
            C01GW c01gw2 = C295780Bia.LIZ;
            if (C295780Bia.LIZIZ) {
                return LJJIJL().getContext();
            }
        }
        super.Eo(context);
        return context;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IGiftSelectAbility
    public final void Gc1(boolean z) {
        int i;
        if (!this.LLILZ) {
            return;
        }
        View viewLJJIJL = LJJIJL();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IGiftSelectAbility
    public final String cd2(Long l) {
        MutableLiveData<HashMap<Long, String>> mutableLiveDataXQ2;
        HashMap<Long, String> value;
        GiftViewModel giftViewModelHp = hp();
        if (giftViewModelHp != null && (mutableLiveDataXQ2 = giftViewModelHp.xQ2()) != null && (value = mutableLiveDataXQ2.getValue()) != null) {
            return value.get(l);
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Boolean boolValueOf;
        CommentKeyboardModel keyboardModel;
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1341720l1G c1341720l1G = null;
        if (fragmentLJI != null && fragmentLJI.getActivity() != null) {
            this.LLJJJ = (C1341720l1G) view.findViewById(R.id.um8);
            GiftViewModel giftViewModelHp = hp();
            if (giftViewModelHp != null) {
                getOwnLifecycleOwner();
                C1341720l1G c1341720l1G2 = this.LLJJJ;
                if (c1341720l1G2 == null) {
                    c1341720l1G2 = null;
                }
                c1341720l1G2.LIZ(giftViewModelHp, this);
            }
            C726120Se2 c726120Se2 = this.LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
            CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(this);
            if (commentContextSourceLIZ != null && (keyboardModel = commentContextSourceLIZ.getKeyboardModel()) != null) {
                boolValueOf = Boolean.valueOf(keyboardModel.getHideGiftSelectInNonePanel());
            } else {
                boolValueOf = null;
            }
            Gc1(!C1346420l8q.LIZ(boolValueOf));
            C1341720l1G c1341720l1G3 = this.LLJJJ;
            if (c1341720l1G3 != null) {
                c1341720l1G = c1341720l1G3;
            }
            if (c1341720l1G.LL) {
                C786410Ut5.y(c1341720l1G, 0);
            } else {
                C786410Ut5.y(c1341720l1G, 8);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IGiftSelectAbility
    public final void PF2(String str, String str2) {
        GiftViewModel giftViewModelHp = hp();
        if (giftViewModelHp != null) {
            giftViewModelHp.PF2(str, str2);
        }
    }
}
