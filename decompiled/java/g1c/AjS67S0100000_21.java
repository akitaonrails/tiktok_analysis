package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C0WZX;
import X.C10EU;
import X.C1132404bq;
import X.C123100dR;
import X.C1340430kzB;
import X.C1340510kzJ;
import X.C1340640kzW;
import X.C1340820kzo;
import X.C1344030l4z;
import X.C1344210l5H;
import X.C1344400l5a;
import X.C1344540l5o;
import X.C1345760l7m;
import X.C1350920lG6;
import X.C1353500lKG;
import X.C1356090lOR;
import X.C1356160lOY;
import X.C1389890mGx;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1601690rmZ;
import X.C1697810uHb;
import X.C20600815jK;
import X.C20612915lH;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C291001Au;
import X.C292460BdE;
import X.C294200Bg2;
import X.C442430HWn;
import X.C563400M7u;
import X.C722710SWn;
import X.C746760TRa;
import X.C786410Ut5;
import X.C946803n0;
import X.EnumC1341670l1B;
import X.EnumC1341680l1C;
import X.EnumC1346360l8k;
import X.EnumC1356100lOS;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737440SwI;
import Y.ARunnableS27S0201000_21;
import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.DetailBottomFakeInput;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentEventModel;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.commentv2.actionbar.CommentPageActionBarAssem;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentMoreItemCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentExposureVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.FlashDealTemplateItem;
import com.ss.android.ugc.aweme.lemon.comment.powercell.Lemon8CommentMoreItemCell;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public class AjS67S0100000_21 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS67S0100000_21(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AjS67S0100000_21 ajS67S0100000_21, View view) {
        if (view != null) {
            BaseFakeInput.Xp((BaseFakeInput) ajS67S0100000_21.l0, null, "click_input_box", null, null, 13);
        }
    }

    public static final void LIZ$1(AjS67S0100000_21 ajS67S0100000_21, View view) {
        if (view != null) {
            BaseFakeInput.Xp((BaseFakeInput) ajS67S0100000_21.l0, null, "click_input_box", null, null, 13);
        }
    }

    public static final void LIZ$10(AjS67S0100000_21 ajS67S0100000_21, View view) {
        String aid;
        String authorUid;
        Aweme aweme;
        Aweme aweme2;
        if (view != null) {
            String strEventType = null;
            if (((CommentPageActionBarAssem) ajS67S0100000_21.l0).LLLF != null) {
                C746760TRa.LIZ().LJLIL(Boolean.TRUE, null);
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp = ((CommentPageActionBarAssem) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp)) != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            CommentContextSource commentContextSourceKp2 = ((CommentPageActionBarAssem) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceKp2)) != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            CommentContextSource commentContextSourceKp3 = ((CommentPageActionBarAssem) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp3 != null) {
                strEventType = CommentContextSourceKt.eventType(commentContextSourceKp3);
            }
            c1350920lG6.getClass();
            C1350920lG6.LJJLI(aid, authorUid, strEventType, "comment_panel", false);
        }
    }

    public static final void LIZ$11(AjS67S0100000_21 ajS67S0100000_21, View view) {
        String aid;
        String authorUid;
        Aweme aweme;
        Aweme aweme2;
        if (view != null) {
            String strEventType = null;
            if (((CommentPageActionBarAssem) ajS67S0100000_21.l0).LLLF != null) {
                C746760TRa.LIZ().LJLIL(Boolean.FALSE, null);
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp = ((CommentPageActionBarAssem) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp)) != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            CommentContextSource commentContextSourceKp2 = ((CommentPageActionBarAssem) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceKp2)) != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            CommentContextSource commentContextSourceKp3 = ((CommentPageActionBarAssem) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp3 != null) {
                strEventType = CommentContextSourceKt.eventType(commentContextSourceKp3);
            }
            c1350920lG6.getClass();
            C1350920lG6.LJJLI(aid, authorUid, strEventType, "comment_panel", true);
        }
    }

    public static final void LIZ$12(AjS67S0100000_21 ajS67S0100000_21, View view) {
        Fragment fragmentLIZ;
        if (view != null) {
            C1340510kzJ c1340510kzJ = C1340510kzJ.LIZ;
            CommentContextSource commentContextSourceL5 = ((CommentMoreItemCell) ajS67S0100000_21.l0).L5();
            View view2 = ((CommentMoreItemCell) ajS67S0100000_21.l0).itemView;
            c1340510kzJ.getClass();
            if (!C1340510kzJ.LIZ(commentContextSourceL5, view2)) {
                AssemVMLazy assemVMLazy = ((CommentMoreItemCell) ajS67S0100000_21.l0).LL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentMoreItemCell.LLJJIII;
                ((CommentListAssemVM) assemVMLazy.getValue()).zQ2(((CommentMoreItemCell) ajS67S0100000_21.l0).getItem());
                C1344540l5o c1344540l5o = C1344540l5o.LIZ;
                Context context = ((CommentMoreItemCell) ajS67S0100000_21.l0).getContext();
                c1344540l5o.getClass();
                if (C294200Bg2.LIZJ()) {
                    int iLIZJ = ((C563400M7u) C1344540l5o.LJIIL.getValue()).LIZJ();
                    if (iLIZJ < 3) {
                        int i = C1344540l5o.LJIIJ;
                        C786410Ut5.LJJZZIII((Handler) C1344540l5o.LJIILJJIL.getValue(), new ARunnableS27S0201000_21(iLIZJ, context, C1697810uHb.LJIILJJIL(Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i)), 10));
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onViewMoreClicked  ");
                    sbLIZ.append(iLIZJ);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ(((CommentMoreItemCell) ajS67S0100000_21.l0).itemView, null);
                CommentMoreItemCell commentMoreItemCell = (CommentMoreItemCell) ajS67S0100000_21.l0;
                LifecycleOwner currentLifecycleOwner = commentMoreItemCell.getCurrentLifecycleOwner();
                if (!(currentLifecycleOwner instanceof Fragment) || (fragmentLIZ = (Fragment) currentLifecycleOwner) == null) {
                    fragmentLIZ = C946803n0.LIZ(commentMoreItemCell.itemView);
                }
                ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(fragmentLIZ, interfaceC665370Q7zLJ);
                if (iCommentListAssemAbilityLIZLLL != null) {
                    iCommentListAssemAbilityLIZLLL.yE1(EnumC1341670l1B.VIEW_MORE);
                }
                if (C292460BdE.LIZ()) {
                    C722710SWn c722710SWn = ((CommentExposureVM) ((CommentMoreItemCell) ajS67S0100000_21.l0).LLJJI.getValue()).LLILZ;
                    if (!c722710SWn.LJ) {
                        c722710SWn.LJ = true;
                    }
                }
            }
        }
    }

    public static final void LIZ$13(AjS67S0100000_21 ajS67S0100000_21, View view) {
        String str;
        String cid;
        int i;
        String strEnterFrom;
        String aid;
        Aweme aweme;
        String sessionId;
        String authorUid;
        Aweme aweme2;
        InterfaceC665370Q7z interfaceC665370Q7z;
        Fragment fragment;
        Fragment fragment2;
        String str2;
        C1340640kzW c1340640kzW;
        C1340430kzB c1340430kzB;
        Comment comment;
        C1340820kzo c1340820kzo;
        Fragment fragment3;
        if (view != null) {
            AssemVMLazy assemVMLazy = ((CommentMoreItemCell) ajS67S0100000_21.l0).LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentMoreItemCell.LLJJIII;
            CommentListAssemVM commentListAssemVM = (CommentListAssemVM) assemVMLazy.getValue();
            C1340820kzo item = ((CommentMoreItemCell) ajS67S0100000_21.l0).getItem();
            C1344210l5H c1344210l5HDQ2 = commentListAssemVM.DQ2();
            if (item == null) {
                c1344210l5HDQ2.getClass();
            } else {
                C20600815jK<InterfaceC1891350zJl> c20600815jKLJI = c1344210l5HDQ2.LJI();
                if (c20600815jKLJI != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("clickHideCommentButton ");
                    sbLIZ.append(item);
                    C1344030l4z.LIZJ("CommentSortListVM", C2188811AlT.LIZIZ(sbLIZ));
                    Iterator it2 = ((ArrayList) c20600815jKLJI.LJII()).iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                        if ((interfaceC1891350zJl instanceof C1340820kzo) && (c1340820kzo = (C1340820kzo) interfaceC1891350zJl) != null) {
                            str = c1340820kzo.LLILLJJLI;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, item.LLILLJJLI)) {
                            if (i2 >= 0) {
                                List<InterfaceC1891350zJl> listLJII = c20600815jKLJI.LJII();
                                ArrayList arrayList = (ArrayList) listLJII;
                                Iterator it3 = arrayList.iterator();
                                int i3 = 0;
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) it3.next();
                                    if ((interfaceC1891350zJl2 instanceof C1340430kzB) && (c1340430kzB = (C1340430kzB) interfaceC1891350zJl2) != null && (comment = c1340430kzB.LLILZIL) != null) {
                                        cid = comment.getCid();
                                    } else {
                                        cid = null;
                                    }
                                    if (Intrinsics.LJFF(cid, item.LLILLJJLI)) {
                                        if (i3 >= 0) {
                                            Iterator it4 = arrayList.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next = it4.next();
                                                InterfaceC1891350zJl interfaceC1891350zJl3 = (InterfaceC1891350zJl) next;
                                                if ((interfaceC1891350zJl3 instanceof C1340640kzW) && (c1340640kzW = (C1340640kzW) interfaceC1891350zJl3) != null) {
                                                    str2 = c1340640kzW.LLILZ;
                                                } else {
                                                    str2 = null;
                                                }
                                                if (Intrinsics.LJFF(str2, item.LLILLJJLI)) {
                                                    if (next != null) {
                                                        i3++;
                                                    }
                                                }
                                            }
                                            int i4 = item.LLILZ.LIZ;
                                            c20600815jKLJI.LJIILJJIL(i2, C1340820kzo.LIZIZ(item, i4, 0, 30));
                                            int i5 = i3 + i4 + 1;
                                            int i6 = ((i2 - i3) - i4) - 1;
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("clickHideCommentButton offset = ");
                                            sbLIZ2.append(i5);
                                            sbLIZ2.append("  count = ");
                                            sbLIZ2.append(i6);
                                            C1344030l4z.LIZJ("CommentSortListVM", C2188811AlT.LIZIZ(sbLIZ2));
                                            int iLJIIIIZZ = c20600815jKLJI.LJIIIIZZ();
                                            if (ListProtector.get(listLJII, i5) instanceof C1344400l5a) {
                                                i5++;
                                                i6--;
                                            }
                                            int iMin = Math.min(i5, iLJIIIIZZ);
                                            int iMin2 = Math.min(iLJIIIIZZ - iMin, i6);
                                            AtomicInteger atomicInteger = C1132404bq.LIZ;
                                            if (iMin2 < 0) {
                                                i = 0;
                                            } else {
                                                i = iMin2;
                                            }
                                            atomicInteger.set(i);
                                            InterfaceC665370Q7z interfaceC665370Q7z2 = c1344210l5HDQ2.LJIIZILJ;
                                            if (interfaceC665370Q7z2 != null) {
                                                WeakReference<Fragment> weakReference = c1344210l5HDQ2.LIZIZ.LLIZLLLIL;
                                                if (weakReference != null) {
                                                    fragment2 = weakReference.get();
                                                } else {
                                                    fragment2 = null;
                                                }
                                                ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(fragment2, interfaceC665370Q7z2);
                                                if (iCommentListAssemAbilityLIZLLL != null) {
                                                    iCommentListAssemAbilityLIZLLL.JB0(1);
                                                }
                                            }
                                            C20600815jK.LJIILLIIL(c20600815jKLJI, iMin, iMin2, new ArrayList());
                                            if (C1601690rmZ.LIZJ() && (interfaceC665370Q7z = c1344210l5HDQ2.LJIIZILJ) != null) {
                                                WeakReference<Fragment> weakReference2 = c1344210l5HDQ2.LIZIZ.LLIZLLLIL;
                                                if (weakReference2 != null) {
                                                    fragment = weakReference2.get();
                                                } else {
                                                    fragment = null;
                                                }
                                                ICommentListAssemAbility iCommentListAssemAbilityLIZLLL2 = C1345760l7m.LIZLLL(fragment, interfaceC665370Q7z);
                                                if (iCommentListAssemAbilityLIZLLL2 != null) {
                                                    iCommentListAssemAbilityLIZLLL2.p21(i3);
                                                }
                                            }
                                            item.LLILZ.LJIIJ = 0;
                                            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                                            CommentContextSource commentContextSource = c1344210l5HDQ2.LJJIJIL;
                                            if (commentContextSource != null) {
                                                strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource);
                                            } else {
                                                strEnterFrom = null;
                                            }
                                            CommentContextSource commentContextSource2 = c1344210l5HDQ2.LJJIJIL;
                                            if (commentContextSource2 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSource2)) != null) {
                                                aid = aweme2.getAid();
                                            } else {
                                                aid = null;
                                            }
                                            String str3 = item.LLILLJJLI;
                                            CommentContextSource commentContextSource3 = c1344210l5HDQ2.LJJIJIL;
                                            if (commentContextSource3 != null) {
                                                aweme = CommentContextSourceKt.aweme(commentContextSource3);
                                            } else {
                                                aweme = null;
                                            }
                                            CommentContextSource commentContextSource4 = c1344210l5HDQ2.LJJIJIL;
                                            if (commentContextSource4 != null) {
                                                sessionId = CommentContextSourceKt.getSessionId(commentContextSource4);
                                            } else {
                                                sessionId = null;
                                            }
                                            c1350920lG6.getClass();
                                            C2344009Gk c2344009GkLJIIIZ = C1350920lG6.LJIIIZ(strEnterFrom, aid);
                                            c2344009GkLJIIIZ.LJFF("parent_comment_id", str3);
                                            if (aweme != null) {
                                                authorUid = AwemeExtKt.getAuthorUid(aweme);
                                            } else {
                                                authorUid = null;
                                            }
                                            c2344009GkLJIIIZ.LIZJ(C10EU.LJIIZILJ(authorUid) ? 1 : 0, "is_video_author");
                                            if (C123100dR.LIZ(sessionId)) {
                                                c2344009GkLJIIIZ.LJFF("session_id", sessionId);
                                            }
                                            C1350920lG6.LJJJ(c2344009GkLJIIIZ, "hide_all_reply");
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        } else {
                            i2++;
                        }
                    }
                }
            }
            InterfaceC665370Q7z interfaceC665370Q7z3 = commentListAssemVM.LLJ;
            if (interfaceC665370Q7z3 != null) {
                WeakReference<Fragment> weakReference3 = commentListAssemVM.LLIZLLLIL;
                if (weakReference3 != null) {
                    fragment3 = weakReference3.get();
                } else {
                    fragment3 = null;
                }
                ICommentListAssemAbility iCommentListAssemAbilityLIZLLL3 = C1345760l7m.LIZLLL(fragment3, interfaceC665370Q7z3);
                if (iCommentListAssemAbilityLIZLLL3 != null) {
                    iCommentListAssemAbilityLIZLLL3.qA1(true, true);
                }
            }
        }
    }

    public static final void LIZ$14(AjS67S0100000_21 ajS67S0100000_21, View view) {
        if (view != null) {
            ((CommentMoreItemCell) ajS67S0100000_21.l0).N5().performClick();
        }
    }

    public static final void LIZ$15(AjS67S0100000_21 ajS67S0100000_21, View view) {
        if (view != null) {
            ((CommentMoreItemCell) ajS67S0100000_21.l0).N5().performClick();
        }
    }

    public static final void LIZ$16(AjS67S0100000_21 ajS67S0100000_21, View view) {
        if (view != null) {
            ((CommentMoreItemCell) ajS67S0100000_21.l0).N5().performClick();
        }
    }

    public static final void LIZ$17(AjS67S0100000_21 ajS67S0100000_21, View view) {
        if (view != null) {
            ((Lemon8CommentMoreItemCell) ajS67S0100000_21.l0).N5();
        }
    }

    public static final void LIZ$18(AjS67S0100000_21 ajS67S0100000_21, View view) {
        if (view != null) {
            ((Lemon8CommentMoreItemCell) ajS67S0100000_21.l0).N5();
        }
    }

    public static final void LIZ$19(AjS67S0100000_21 ajS67S0100000_21, View view) {
        Fragment fragmentLIZ;
        if (view != null && (fragmentLIZ = C946803n0.LIZ(view)) != null) {
            if (((FlashDealTemplateItem) ajS67S0100000_21.l0).isUsing) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZ);
                c1389890mGx.LJIIJ(C20642515q3.LJI(2131832720));
                c1389890mGx.LJIIJJI();
            } else {
                C1389890mGx c1389890mGx2 = new C1389890mGx(fragmentLIZ);
                c1389890mGx2.LJIIJ(C20642515q3.LJI(2131832721));
                c1389890mGx2.LJIIJJI();
            }
        }
    }

    public static final void LIZ$2(AjS67S0100000_21 ajS67S0100000_21, View view) {
        String sessionId;
        String str;
        CommentCommonModel commonModel;
        CommentEventModel eventModel;
        CommentInputContent commentInputContent;
        if (view != null) {
            Editable editable = null;
            String strEnterFrom = null;
            Aweme aweme = null;
            BaseFakeInput.Xp((BaseFakeInput) ajS67S0100000_21.l0, EnumC1341680l1C.EMOJI, null, null, null, 14);
            C291001Au<CommentInputContent> c291001Au = ((BaseFakeInput) ajS67S0100000_21.l0).sp().getState().LLJI;
            Boolean boolValueOf = null;
            if (c291001Au != null && (commentInputContent = c291001Au.LIZ) != null) {
                editable = commentInputContent.text;
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp = ((BaseFakeInput) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp != null) {
                strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceKp);
            }
            CommentContextSource commentContextSourceKp2 = ((BaseFakeInput) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp2 != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceKp2);
            }
            boolean z = true;
            if ((editable == null || a0.LJLIIIL(editable.toString()).toString().length() <= 0) && ((BaseFakeInput) ajS67S0100000_21.l0).sp().CQ2() == null && ((BaseFakeInput) ajS67S0100000_21.l0).sp().GQ2() == null && ((BaseFakeInput) ajS67S0100000_21.l0).sp().xQ2() == null) {
                z = false;
            }
            CommentContextSource commentContextSourceKp3 = ((BaseFakeInput) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp3 != null) {
                sessionId = CommentContextSourceKt.getSessionId(commentContextSourceKp3);
            } else {
                sessionId = null;
            }
            CommentContextSource commentContextSourceKp4 = ((BaseFakeInput) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp4 != null && (eventModel = commentContextSourceKp4.getEventModel()) != null) {
                str = eventModel.fromPage;
            } else {
                str = null;
            }
            CommentContextSource commentContextSourceKp5 = ((BaseFakeInput) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp5 != null && (commonModel = commentContextSourceKp5.getCommonModel()) != null) {
                boolValueOf = Boolean.valueOf(commonModel.isInPhotoCommentDetailPage());
            }
            ((BaseFakeInput) ajS67S0100000_21.l0).kp();
            c1350920lG6.getClass();
            C1350920lG6.LJIJJ(strEnterFrom, aweme, true, z, sessionId, str, boolValueOf);
        }
    }

    public static final void LIZ$20(AjS67S0100000_21 ajS67S0100000_21, View view) {
        User author;
        Aweme aweme;
        if (view != null) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp = ((CommentPageActionBarAssem) ajS67S0100000_21.l0).kp();
            c1350920lG6.getClass();
            C1350920lG6.LJJIJIIJIL(commentContextSourceKp, "click_username");
            CommentPageActionBarAssem commentPageActionBarAssem = (CommentPageActionBarAssem) ajS67S0100000_21.l0;
            CommentContextSource commentContextSourceKp2 = commentPageActionBarAssem.kp();
            if (commentContextSourceKp2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceKp2)) != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            commentPageActionBarAssem.ip(author, "click_name");
        }
    }

    public static final void LIZ$21(AjS67S0100000_21 ajS67S0100000_21, View view) {
        User author;
        Aweme aweme;
        if (view != null) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp = ((CommentPageActionBarAssem) ajS67S0100000_21.l0).kp();
            c1350920lG6.getClass();
            C1350920lG6.LJJIJIIJIL(commentContextSourceKp, "click_avatar");
            CommentPageActionBarAssem commentPageActionBarAssem = (CommentPageActionBarAssem) ajS67S0100000_21.l0;
            CommentContextSource commentContextSourceKp2 = commentPageActionBarAssem.kp();
            if (commentContextSourceKp2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceKp2)) != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            commentPageActionBarAssem.ip(author, "click_head");
        }
    }

    public static final void LIZ$22(AjS67S0100000_21 ajS67S0100000_21, View view) {
        String str;
        String authorUid;
        if (view != null) {
            ((C1356090lOR) ajS67S0100000_21.l0).LIZJ(EnumC1356100lOS.COMMENT);
            C1356160lOY c1356160lOY = C1356160lOY.LIZ;
            C442430HWn c442430HWn = ((C1356090lOR) ajS67S0100000_21.l0).LL;
            Aweme aweme = c442430HWn.LIZJ;
            PostModeDetailParams postModeDetailParams = c442430HWn.LJI;
            if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
                str = "";
            }
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            C1356160lOY.LIZJ(c1356160lOY, aweme, str, authorUid);
        }
    }

    public static final void LIZ$3(AjS67S0100000_21 ajS67S0100000_21, View view) {
        if (view != null && !C20612915lH.LIZIZ.LJIIIIZZ().LJFF(new AwS591S0100000_12((BaseFakeInput) ajS67S0100000_21.l0, 600))) {
            BaseFakeInput.Xp((BaseFakeInput) ajS67S0100000_21.l0, EnumC1341680l1C.MENTION, null, null, null, 14);
        }
    }

    public static final void LIZ$4(AjS67S0100000_21 ajS67S0100000_21, View view) {
        Aweme aweme;
        Aweme aweme2;
        if (view != null) {
            String strEnterFrom = null;
            String aid = null;
            BaseFakeInput.Xp((BaseFakeInput) ajS67S0100000_21.l0, EnumC1341680l1C.GIFT, null, null, null, 14);
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp = ((BaseFakeInput) ajS67S0100000_21.l0).kp();
            String authorUid = null;
            if (commentContextSourceKp != null) {
                strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceKp);
            }
            CommentContextSource commentContextSourceKp2 = ((BaseFakeInput) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp2 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp2)) != null) {
                aid = aweme2.getAid();
            }
            CommentContextSource commentContextSourceKp3 = ((BaseFakeInput) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp3 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceKp3)) != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            }
            c1350920lG6.getClass();
            C1350920lG6.LJIJJLI(strEnterFrom, aid, authorUid, "comment_panel_outer");
        }
    }

    public static final void LIZ$5(AjS67S0100000_21 ajS67S0100000_21, View view) throws Throwable {
        Editable editableLLLZZIL;
        if (view != null) {
            BaseFakeInput baseFakeInput = (BaseFakeInput) ajS67S0100000_21.l0;
            CommentPublishViewModel commentPublishViewModelTp = baseFakeInput.tp();
            KeyboardVMV2 keyboardVMV2Sp = baseFakeInput.sp();
            EnumC1346360l8k inputServiceType = baseFakeInput.getInputServiceType();
            C1353500lKG c1353500lKG = baseFakeInput.LLJJIJI;
            if (c1353500lKG != null) {
                editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null));
            } else {
                editableLLLZZIL = null;
            }
            commentPublishViewModelTp.Yb0(keyboardVMV2Sp.DQ2(inputServiceType, editableLLLZZIL), null, null);
        }
    }

    public static final void LIZ$6(AjS67S0100000_21 ajS67S0100000_21, View view) {
        if (view != null) {
            ((DetailBottomFakeInput) ajS67S0100000_21.l0).sp().OQ2();
            if (((DetailBottomFakeInput) ajS67S0100000_21.l0).iq()) {
                BaseFakeInput.Xp((DetailBottomFakeInput) ajS67S0100000_21.l0, null, "bottom_comment_box", null, null, 13);
            }
        }
    }

    public static final void LIZ$7(AjS67S0100000_21 ajS67S0100000_21, View view) {
        if (view != null) {
            ((DetailBottomFakeInput) ajS67S0100000_21.l0).sp().OQ2();
            if (((DetailBottomFakeInput) ajS67S0100000_21.l0).iq()) {
                BaseFakeInput.Xp((DetailBottomFakeInput) ajS67S0100000_21.l0, null, "bottom_comment_box", null, null, 13);
                InterfaceC737440SwI interfaceC737440SwI = ((DetailBottomFakeInput) ajS67S0100000_21.l0).LLLF;
                if (interfaceC737440SwI != null) {
                    interfaceC737440SwI.e6(new AwS565S0100000_21(interfaceC737440SwI, 139));
                    interfaceC737440SwI.sp(new AwS565S0100000_21(interfaceC737440SwI, 140));
                }
            }
        }
    }

    public static final void LIZ$8(AjS67S0100000_21 ajS67S0100000_21, View view) {
        ICommentPageAbility iCommentPageAbility;
        if (view != null && (iCommentPageAbility = (ICommentPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL((CommentPageActionBarAssem) ajS67S0100000_21.l0), ICommentPageAbility.class, null)) != null) {
            iCommentPageAbility.QV0(((CommentPageActionBarAssem) ajS67S0100000_21.l0).lp(view), ((CommentPageActionBarAssem) ajS67S0100000_21.l0).mp(view), view, AFwS209S0000000_21.get$arr$(441), AFwS209S0000000_21.get$arr$(442));
        }
    }

    public static final void LIZ$9(AjS67S0100000_21 ajS67S0100000_21, View view) {
        ICommentPageContainer iCommentPageContainer;
        if (view != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((CommentPageActionBarAssem) ajS67S0100000_21.l0);
            if (interfaceC665370Q7zLJIIL != null && (iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, ICommentPageContainer.class, null)) != null) {
                iCommentPageContainer.Kb1("click_close");
            }
            CommentContextSource commentContextSourceKp = ((CommentPageActionBarAssem) ajS67S0100000_21.l0).kp();
            if (commentContextSourceKp != null && CommentContextSourceKt.isFromTitlePanel(commentContextSourceKp)) {
                C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                CommentContextSource commentContextSourceKp2 = ((CommentPageActionBarAssem) ajS67S0100000_21.l0).kp();
                c1350920lG6.getClass();
                C1350920lG6.LJJIJIIJIL(commentContextSourceKp2, "click_close");
            }
        }
    }
}
