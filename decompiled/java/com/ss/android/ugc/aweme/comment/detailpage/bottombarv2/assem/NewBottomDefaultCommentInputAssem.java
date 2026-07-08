package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.C0DJ3;
import X.C0QSJ;
import X.C1344030l4z;
import X.C1347720lAw;
import X.C1347730lAx;
import X.C1347740lAy;
import X.C1350920lG6;
import X.C13LE;
import X.C14LC;
import X.C1554960qZC;
import X.C1558520qew;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C309690CBz;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C726120Se2;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1346360l8k;
import X.InterfaceC1349050lD5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.scope.DetailPageBottomBarScope;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IDetailBottomInputAssemAbility;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class NewBottomDefaultCommentInputAssem extends AbstractBottomPriorityComponent implements InterfaceC1349050lD5, C0QSJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C726120Se2 LLJ = new C726120Se2();
    public String LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NewBottomDefaultCommentInputAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final boolean Go(C2189821An6 c2189821An6) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol
    public final boolean LJJLIL() {
        return true;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{DetailBottomKeyboardVScope.class, DetailBottomKeyboardVScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(DetailBottomKeyboardVScope.class);
        arrayList.add(DetailPageBottomBarScope.class);
        arrayList.add(DetailBottomKeyboardVScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DetailBottomKeyboardVScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "default_comment";
    }

    public final CommentContextSource So() {
        C726120Se2 c726120Se2 = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return c726120Se2.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void W3() {
        Object objLIZ;
        C1344030l4z.LIZJ("NewBottomCommentInputAssem", "resetEdit");
        Vo();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IDetailBottomInputAssemAbility.class, null);
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7zLJIIL, DetailPageBottomBarScope.class);
            Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(IDetailBottomInputAssemAbility.class) : null;
            if (!(ability instanceof IDetailBottomInputAssemAbility)) {
                ability = null;
            }
            InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) ability;
            C0DJ3 c0dj3 = C0DJ3.LIZ;
            String strLJI = C13LE.LIZ(IDetailBottomInputAssemAbility.class).LJI();
            if (strLJI == null) {
                strLJI = "null";
            }
            c0dj3.getClass();
            C0DJ3.LIZ(interfaceC494301wDLIZ, strLJI, interfaceC494301wD);
        }
        C0DJ3.LIZ.getClass();
        if (C0DJ3.LIZIZ()) {
            C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(interfaceC665370Q7zLJIIL, DetailPageBottomBarScope.class);
            Object ability2 = c0qsjLIZJ2 != null ? c0qsjLIZJ2.getAbility(IDetailBottomInputAssemAbility.class) : null;
            objLIZ = (IDetailBottomInputAssemAbility) (ability2 instanceof IDetailBottomInputAssemAbility ? ability2 : null);
        } else {
            objLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IDetailBottomInputAssemAbility.class, null);
        }
        IDetailBottomInputAssemAbility iDetailBottomInputAssemAbility = (IDetailBottomInputAssemAbility) objLIZ;
        if (iDetailBottomInputAssemAbility != null) {
            iDetailBottomInputAssemAbility.W3();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void Do() {
        Object objLIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IDetailBottomInputAssemAbility.class, null);
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7zLJIIL, DetailPageBottomBarScope.class);
            Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(IDetailBottomInputAssemAbility.class) : null;
            if (!(ability instanceof IDetailBottomInputAssemAbility)) {
                ability = null;
            }
            InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) ability;
            C0DJ3 c0dj3 = C0DJ3.LIZ;
            String strLJI = C13LE.LIZ(IDetailBottomInputAssemAbility.class).LJI();
            if (strLJI == null) {
                strLJI = "null";
            }
            c0dj3.getClass();
            C0DJ3.LIZ(interfaceC494301wDLIZ, strLJI, interfaceC494301wD);
        }
        C0DJ3.LIZ.getClass();
        if (C0DJ3.LIZIZ()) {
            C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(interfaceC665370Q7zLJIIL, DetailPageBottomBarScope.class);
            Object ability2 = c0qsjLIZJ2 != null ? c0qsjLIZJ2.getAbility(IDetailBottomInputAssemAbility.class) : null;
            objLIZ = (IDetailBottomInputAssemAbility) (ability2 instanceof IDetailBottomInputAssemAbility ? ability2 : null);
        } else {
            objLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IDetailBottomInputAssemAbility.class, null);
        }
        IDetailBottomInputAssemAbility iDetailBottomInputAssemAbility = (IDetailBottomInputAssemAbility) objLIZ;
        if (iDetailBottomInputAssemAbility != null) {
            iDetailBottomInputAssemAbility.Do();
        }
    }

    public final void Vo() {
        Aweme commentInputAweme;
        String enterFrom;
        CommentContextSource commentContextSourceSo;
        String friendsV3DetailType;
        DetailNavArgModel navArgModel;
        HashMap<String, String> inboxLogExtra;
        DetailBottomBarAbility detailBottomBarAbilityJo = Jo();
        if (detailBottomBarAbilityJo != null) {
            commentInputAweme = detailBottomBarAbilityJo.getCommentInputAweme();
            enterFrom = detailBottomBarAbilityJo.getEnterFrom();
        } else {
            commentInputAweme = null;
            enterFrom = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ability=");
        sbLIZ.append(detailBottomBarAbilityJo);
        sbLIZ.append(" updateSource ");
        sbLIZ.append(enterFrom);
        sbLIZ.append(" aweme is null? = ");
        sbLIZ.append(commentInputAweme == null);
        C1344030l4z.LIZJ("NewBottomCommentInputAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (So() != null) {
            CommentKeyboardModel commentKeyboardModel = new CommentKeyboardModel();
            commentKeyboardModel.setHideExposedEmojiInNonePanel(true);
            commentKeyboardModel.setHideGiftSelectInNonePanel(true);
            commentKeyboardModel.setShieldKeyboardOpen(true);
            commentKeyboardModel.setInputServiceType(EnumC1346360l8k.DETAIL_BOTTOM);
            CommentContextSource commentContextSourceSo2 = So();
            if (commentContextSourceSo2 != null) {
                commentContextSourceSo2.setKeyboardModel(commentKeyboardModel);
            }
        }
        if (commentInputAweme == null || (commentContextSourceSo = So()) == null) {
            return;
        }
        C2189821An6 c2189821An6Xp0 = xp0();
        C2189821An6 c2189821An6Xp02 = detailBottomBarAbilityJo.xp0();
        String str = (c2189821An6Xp02 == null || (inboxLogExtra = c2189821An6Xp02.getInboxLogExtra()) == null) ? null : inboxLogExtra.get("account_type");
        C2189821An6 c2189821An6Xp03 = detailBottomBarAbilityJo.xp0();
        String noticeIdForComment = c2189821An6Xp03 != null ? c2189821An6Xp03.getNoticeIdForComment() : null;
        C2189821An6 c2189821An6Xp04 = detailBottomBarAbilityJo.xp0();
        if (c2189821An6Xp04 == null || (navArgModel = c2189821An6Xp04.getNavArgModel()) == null || (friendsV3DetailType = navArgModel.getFriendsV3DetailType()) == null) {
            friendsV3DetailType = "";
        }
        commentContextSourceSo.setCommonModel(new CommentCommonModel(commentInputAweme, null, enterFrom, null, "click_bottom_comment_tab", null, null, false, null, null, null, null, 0, str, false, false, true, false, 0, -1, -1, -1, false, false, false, false, false, false, false, null, null, 1, true, false, null, null, "", false, false, "", null, null, c2189821An6Xp0, noticeIdForComment, null, false, false, false, false, false, null, null, -1, null, null, null, "", false, false, false, friendsV3DetailType, null, null, Boolean.FALSE, 0, true, false, false, null, null, null, null, null, false));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554960qZC.LIZ(C1558520qew.LJIIL(this), new CommentContextSource(), CommentContextSource.class, "source_default_key");
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void No(ViewGroup viewGroup) {
        Aweme aweme;
        String aid;
        String strEnterFrom;
        Aweme aweme2;
        Aweme aweme3;
        String aid2;
        Aweme aweme4;
        Aweme aweme5;
        C1344030l4z.LIZJ("NewBottomCommentInputAssem", "onAttach");
        Vo();
        CommentContextSource commentContextSourceSo = So();
        C1347730lAx c1347730lAxLIZ = null;
        if (commentContextSourceSo != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceSo);
        } else {
            aweme = null;
        }
        if (C1347740lAy.LIZ(aweme, false)) {
            CommentContextSource commentContextSourceSo2 = So();
            if (commentContextSourceSo2 != null && (aweme5 = CommentContextSourceKt.aweme(commentContextSourceSo2)) != null) {
                aid = aweme5.getAid();
            } else {
                aid = null;
            }
            if (!Intrinsics.LJFF(aid, this.LLJI)) {
                CommentContextSource commentContextSourceSo3 = So();
                if (commentContextSourceSo3 != null) {
                    strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceSo3);
                } else {
                    strEnterFrom = null;
                }
                String str = "";
                if (strEnterFrom == null) {
                    strEnterFrom = "";
                }
                CommentContextSource commentContextSourceSo4 = So();
                if (commentContextSourceSo4 != null) {
                    aweme2 = CommentContextSourceKt.aweme(commentContextSourceSo4);
                } else {
                    aweme2 = null;
                }
                CommentContextSource commentContextSourceSo5 = So();
                if (commentContextSourceSo5 != null && (aweme4 = CommentContextSourceKt.aweme(commentContextSourceSo5)) != null) {
                    c1347730lAxLIZ = C1347720lAw.LIZ(aweme4);
                }
                C1350920lG6.LLFZ(strEnterFrom, aweme2, false, c1347730lAxLIZ);
                CommentContextSource commentContextSourceSo6 = So();
                if (commentContextSourceSo6 != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceSo6)) != null && (aid2 = aweme3.getAid()) != null) {
                    str = aid2;
                }
                this.LLJI = str;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void Oo(ViewGroup viewGroup) {
        C1344030l4z.LIZJ("NewBottomCommentInputAssem", "onDetach");
        if (viewGroup != null && viewGroup.getId() == R.id.cbk) {
            int i = C14LC.LJIILLIIL;
            C14LC c14lc = C309690CBz.LIZ;
            c14lc.getClass();
            int iLIZIZ = C14LC.LIZIZ();
            if (i == 0) {
                i = iLIZIZ;
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = i;
            C786410Ut5.X5(layoutParams, viewGroup);
            c14lc.getClass();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Vo();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            C786410Ut5.Sd(R.layout.a1w, C786410Ut5.ne(viewGroup.getContext()), viewGroup).setId(R.id.fq4);
            C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 58));
        }
    }

    @Override // X.InterfaceC1349050lD5
    public final void y0(boolean z) {
        Object objLIZ;
        Object ability;
        Object ability2;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C844470XAv.LIZ.getClass();
        Object obj = null;
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IDetailBottomInputAssemAbility.class, null);
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7zLJIIL, DetailPageBottomBarScope.class);
            if (c0qsjLIZJ != null) {
                ability2 = c0qsjLIZJ.getAbility(IDetailBottomInputAssemAbility.class);
            } else {
                ability2 = null;
            }
            if (!(ability2 instanceof IDetailBottomInputAssemAbility)) {
                ability2 = null;
            }
            InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) ability2;
            C0DJ3 c0dj3 = C0DJ3.LIZ;
            String strLJI = C13LE.LIZ(IDetailBottomInputAssemAbility.class).LJI();
            if (strLJI == null) {
                strLJI = "null";
            }
            c0dj3.getClass();
            C0DJ3.LIZ(interfaceC494301wDLIZ, strLJI, interfaceC494301wD);
        }
        C0DJ3.LIZ.getClass();
        if (C0DJ3.LIZIZ()) {
            C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(interfaceC665370Q7zLJIIL, DetailPageBottomBarScope.class);
            if (c0qsjLIZJ2 != null) {
                ability = c0qsjLIZJ2.getAbility(IDetailBottomInputAssemAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof IDetailBottomInputAssemAbility) {
                obj = ability;
            }
            objLIZ = (IDetailBottomInputAssemAbility) obj;
        } else {
            objLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IDetailBottomInputAssemAbility.class, null);
        }
        IDetailBottomInputAssemAbility iDetailBottomInputAssemAbility = (IDetailBottomInputAssemAbility) objLIZ;
        if (iDetailBottomInputAssemAbility != null) {
            iDetailBottomInputAssemAbility.y0(z);
        }
    }

    @Override // X.InterfaceC1349050lD5
    public final void r2(String str, String str2) {
        Object objLIZ;
        Object ability;
        Object ability2;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C844470XAv.LIZ.getClass();
        Object obj = null;
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IDetailBottomInputAssemAbility.class, null);
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7zLJIIL, DetailPageBottomBarScope.class);
            if (c0qsjLIZJ != null) {
                ability2 = c0qsjLIZJ.getAbility(IDetailBottomInputAssemAbility.class);
            } else {
                ability2 = null;
            }
            if (!(ability2 instanceof IDetailBottomInputAssemAbility)) {
                ability2 = null;
            }
            InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) ability2;
            C0DJ3 c0dj3 = C0DJ3.LIZ;
            String strLJI = C13LE.LIZ(IDetailBottomInputAssemAbility.class).LJI();
            if (strLJI == null) {
                strLJI = "null";
            }
            c0dj3.getClass();
            C0DJ3.LIZ(interfaceC494301wDLIZ, strLJI, interfaceC494301wD);
        }
        C0DJ3.LIZ.getClass();
        if (C0DJ3.LIZIZ()) {
            C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(interfaceC665370Q7zLJIIL, DetailPageBottomBarScope.class);
            if (c0qsjLIZJ2 != null) {
                ability = c0qsjLIZJ2.getAbility(IDetailBottomInputAssemAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof IDetailBottomInputAssemAbility) {
                obj = ability;
            }
            objLIZ = (IDetailBottomInputAssemAbility) obj;
        } else {
            objLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IDetailBottomInputAssemAbility.class, null);
        }
        IDetailBottomInputAssemAbility iDetailBottomInputAssemAbility = (IDetailBottomInputAssemAbility) objLIZ;
        if (iDetailBottomInputAssemAbility != null) {
            iDetailBottomInputAssemAbility.r2(str, str2);
        }
    }
}
