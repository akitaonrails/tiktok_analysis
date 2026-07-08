package kotlin.jvm.internal;

import X.AbstractC1347290lAF;
import X.AbstractC1368600lic;
import X.AbstractC1368630lif;
import X.C08HX;
import X.C09AY;
import X.C09HN;
import X.C0Y8T;
import X.C12ES;
import X.C1324840ka2;
import X.C1331100kk8;
import X.C1349270lDR;
import X.C1351950lHl;
import X.C1368580lia;
import X.C1368590lib;
import X.C1380540m1s;
import X.C1380600m1y;
import X.C1388190mED;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1619980sG4;
import X.C1788506zT;
import X.C19290510dT;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C626620Ohw;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1348870lCn;
import X.InterfaceC1380500m1o;
import X.InterfaceC1380590m1x;
import X.InterfaceC1381790m3t;
import X.InterfaceC1387770mDX;
import X.InterfaceC1631620sYq;
import Y.AAListenerS332S0100000_21;
import Y.AAListenerS91S0101000_21;
import Y.ALAdapterS0S0302000_11;
import Y.AUListenerS270S0100000_21;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentKeyboardMultiPanelAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentMentionAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerAddPhotoAssem;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.StoryViewerListFragment;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.LeftAvatarAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.MiddleSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.RightSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.TopSlotAssem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.report.ReportWebContainer;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import defpackage.RepostFeedEntranceCell;
import defpackage.a8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AwS670S0100000_21 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case 16:
                return invoke$16(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2, obj3);
            case 19:
                return invoke$19(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2, obj3);
            case 21:
                return invoke$21(this, obj, obj2, obj3);
            case 22:
                return invoke$22(this, obj, obj2, obj3);
            case 23:
                return invoke$23(this, obj, obj2, obj3);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(RepostFeedEntranceCell repostFeedEntranceCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = repostFeedEntranceCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(C1368580lia c1368580lia, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1368580lia;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(C1368590lib c1368590lib, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1368590lib;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS670S0100000_21(AbstractC1368600lic abstractC1368600lic, AbstractC1368600lic<T> abstractC1368600lic2) {
        super(3);
        this.$t = abstractC1368600lic2;
        this.l0 = abstractC1368600lic;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS670S0100000_21(AbstractC1368630lif abstractC1368630lif, AbstractC1368630lif<T> abstractC1368630lif2) {
        super(3);
        this.$t = abstractC1368630lif2;
        this.l0 = abstractC1368630lif;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS670S0100000_21(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super Function2<? super C1380540m1s, ? super InterfaceC1380500m1o, C1380540m1s>, ? super C1380540m1s, Object, ? extends InterfaceC1380590m1x<C1380540m1s>> interfaceC1631620sYq2) {
        super(3);
        this.$t = interfaceC1631620sYq2;
        this.l0 = interfaceC1631620sYq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(View view, int i) {
        super(3);
        this.$t = i;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(CommentKeyboardMultiPanelAssem commentKeyboardMultiPanelAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = commentKeyboardMultiPanelAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(CommentMentionAssem commentMentionAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = commentMentionAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(KeyboardIconGroupAssem keyboardIconGroupAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = keyboardIconGroupAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(PortraitInputKeyboard portraitInputKeyboard, int i) {
        super(3);
        this.$t = i;
        this.l0 = portraitInputKeyboard;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(CommentInnerAddPhotoAssem commentInnerAddPhotoAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = commentInnerAddPhotoAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(StoryViewerListFragment storyViewerListFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = storyViewerListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(VideoQuickCommentAssem videoQuickCommentAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = videoQuickCommentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(LeftAvatarAssem leftAvatarAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = leftAvatarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(MiddleSlotAssem middleSlotAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = middleSlotAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(RightSlotAssem rightSlotAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = rightSlotAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(TopSlotAssem topSlotAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = topSlotAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS670S0100000_21(ReportWebContainer reportWebContainer, int i) {
        super(3);
        this.$t = i;
        this.l0 = reportWebContainer;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        boolean z;
        ValueAnimator valueAnimator;
        int i;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        if (obj2 == a8.LIST) {
            z = true;
        } else {
            z = false;
        }
        C626620Ohw c626620Ohw = ((RepostFeedEntranceCell) awS670S0100000_21.l0).LL;
        if (c626620Ohw != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            int visibility = c626620Ohw.getVisibility();
            c626620Ohw.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c626620Ohw);
        }
        if (z) {
            if (zBooleanValue && !C1788506zT.LIZ(6.8f)) {
                RepostFeedEntranceCell repostFeedEntranceCell = (RepostFeedEntranceCell) awS670S0100000_21.l0;
                ValueAnimator valueAnimator2 = repostFeedEntranceCell.LLILLL;
                if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = repostFeedEntranceCell.LLILLL) != null) {
                    valueAnimator.cancel();
                }
                int i2 = RepostFeedEntranceCell.LLILZIL;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-i2, 0.0f);
                valueAnimatorOfFloat.addListener(new AAListenerS91S0101000_21(repostFeedEntranceCell, i2, 4));
                valueAnimatorOfFloat.addListener(new AAListenerS332S0100000_21(repostFeedEntranceCell, 71));
                valueAnimatorOfFloat.addListener(new AAListenerS332S0100000_21(repostFeedEntranceCell, 70));
                repostFeedEntranceCell.LLILLL = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS270S0100000_21(repostFeedEntranceCell, 44));
                ValueAnimator valueAnimator3 = repostFeedEntranceCell.LLILLL;
                if (valueAnimator3 != null) {
                    valueAnimator3.setInterpolator(C1619980sG4.LIZLLL());
                }
                ValueAnimator valueAnimator4 = repostFeedEntranceCell.LLILLL;
                if (valueAnimator4 != null) {
                    valueAnimator4.setDuration(350L);
                }
                ValueAnimator valueAnimator5 = repostFeedEntranceCell.LLILLL;
                if (valueAnimator5 != null) {
                    valueAnimator5.start();
                }
            }
            C736680Sv4.LJIJJ(((RepostFeedEntranceCell) awS670S0100000_21.l0).I5(), new AwS600S0100000_21((RepostFeedEntranceCell) awS670S0100000_21.l0, 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        View view = (View) obj3;
        ((AbstractC1368630lif) awS670S0100000_21.l0).LLLILZ().LJIIIZ(view.getContext(), null, view, new AwS32S0202000_21((AbstractC1368630lif) awS670S0100000_21.l0, (AbstractC1368630lif<Object>) ((Number) obj).intValue(), ((Number) obj2).intValue(), (int) view, (View) 0));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] avatarRingHeight = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", avatarRingWidth = ");
        sbLIZ.append(iIntValue2);
        C19290510dT.LIZLLL("LeftAvatarAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (iIntValue2 > 0 && iIntValue > 0) {
            ViewGroup.LayoutParams layoutParams = ((LeftAvatarAssem) awS670S0100000_21.l0).mp().getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        String str = (String) obj2;
        int iIntValue = ((Number) obj3).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] title = ");
        sbLIZ.append(str);
        sbLIZ.append(", contentLimitLines = ");
        sbLIZ.append(iIntValue);
        C19290510dT.LIZLLL("MiddleSlotAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() != 0) {
            C786410Ut5.LL(0, (ConstraintLayout) ((MiddleSlotAssem) awS670S0100000_21.l0).LLJL.getValue());
            ((TextView) ((MiddleSlotAssem) awS670S0100000_21.l0).LLJJJJLIIL.getValue()).setText(str);
            if (((TextView) ((MiddleSlotAssem) awS670S0100000_21.l0).LLJJL.getValue()).getMaxLines() != iIntValue) {
                ((TextView) ((MiddleSlotAssem) awS670S0100000_21.l0).LLJJL.getValue()).setMaxLines(iIntValue);
            }
        } else {
            C786410Ut5.LL(8, (ConstraintLayout) ((MiddleSlotAssem) awS670S0100000_21.l0).LLJL.getValue());
            ((TextView) ((MiddleSlotAssem) awS670S0100000_21.l0).LLJJL.getValue()).setMaxLines(3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        String str = (String) obj2;
        CharSequence charSequence = (CharSequence) obj3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] content = ");
        sbLIZ.append(str);
        sbLIZ.append(", contentChar = ");
        sbLIZ.append((Object) charSequence);
        C19290510dT.LIZLLL("MiddleSlotAssem", C2188811AlT.LIZIZ(sbLIZ));
        TextView textView = (TextView) ((MiddleSlotAssem) awS670S0100000_21.l0).LLJJL.getValue();
        CharSequence charSequence2 = str;
        if (str == null) {
            charSequence2 = charSequence;
        }
        textView.setText(charSequence2);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        String str = (String) obj3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] rightType = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", rightBtnText = ");
        sbLIZ.append(str);
        C19290510dT.LIZLLL("RightSlotAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (iIntValue != 3) {
            if (iIntValue != 4) {
                if (iIntValue == 5) {
                    ((RightSlotAssem) awS670S0100000_21.l0).op().setText(str);
                    ((RightSlotAssem) awS670S0100000_21.l0).op().setTextColorRes(R.attr.ui);
                }
            } else {
                ((RightSlotAssem) awS670S0100000_21.l0).sp().setText(str);
            }
        } else {
            ((RightSlotAssem) awS670S0100000_21.l0).op().setText(str);
            ((RightSlotAssem) awS670S0100000_21.l0).op().setTextColorRes(R.attr.ob);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        String str = (String) obj2;
        int iIntValue = ((Number) obj3).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] url = ");
        sbLIZ.append(str);
        sbLIZ.append(", resId = ");
        sbLIZ.append(iIntValue);
        C19290510dT.LIZLLL("TopSlotAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() != 0) {
            C1324840ka2.LJIIJ(((TopSlotAssem) awS670S0100000_21.l0).lp(), str, -1, -1);
            C786410Ut5.l(((TopSlotAssem) awS670S0100000_21.l0).lp(), 0);
        } else if (iIntValue > 0) {
            ((TopSlotAssem) awS670S0100000_21.l0).lp().setImageResource(iIntValue);
            C786410Ut5.l(((TopSlotAssem) awS670S0100000_21.l0).lp(), 0);
        } else {
            C786410Ut5.l(((TopSlotAssem) awS670S0100000_21.l0).lp(), 8);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] imageHeight = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", imageWidth = ");
        sbLIZ.append(iIntValue2);
        C19290510dT.LIZLLL("TopSlotAssem", C2188811AlT.LIZIZ(sbLIZ));
        ViewGroup.LayoutParams layoutParams = ((TopSlotAssem) awS670S0100000_21.l0).lp().getLayoutParams();
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
        C786410Ut5.f7(((TopSlotAssem) awS670S0100000_21.l0).lp(), layoutParams);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        View view = (View) obj3;
        ((C1368580lia) ((AbstractC1368600lic) awS670S0100000_21.l0)).LLILZLL.LJIIIZ(view.getContext(), null, view, new AwS32S0202000_21((AbstractC1368600lic) awS670S0100000_21.l0, (AbstractC1368600lic<Object>) ((Number) obj).intValue(), ((Number) obj2).intValue(), (int) view, (View) 3));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$17(kotlin.jvm.internal.AwS670S0100000_21 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS670S0100000_21.invoke$17(kotlin.jvm.internal.AwS670S0100000_21, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$18(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        int iLIZIZ;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] rightImageWidth = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", rightImageHeight = ");
        sbLIZ.append(iIntValue2);
        C19290510dT.LIZLLL("RightSlotAssem", C2188811AlT.LIZIZ(sbLIZ));
        ViewGroup.LayoutParams layoutParams = ((RightSlotAssem) awS670S0100000_21.l0).mp().getLayoutParams();
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (iIntValue2 <= 40) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            } else {
                iLIZIZ = 0;
            }
            marginLayoutParams.setMarginEnd(iLIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        float fFloatValue = ((Number) obj3).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] rightImageRadius = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", rightImageBorderWidth = ");
        sbLIZ.append(fFloatValue);
        C19290510dT.LIZLLL("RightSlotAssem", C2188811AlT.LIZIZ(sbLIZ));
        C1331100kk8 c1331100kk8 = ((RightSlotAssem) awS670S0100000_21.l0).mp().getHierarchy().LIZJ;
        if (c1331100kk8 != null) {
            RightSlotAssem rightSlotAssem = (RightSlotAssem) awS670S0100000_21.l0;
            c1331100kk8.LJII(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
            if (rightSlotAssem.ip().getType() != 27 && rightSlotAssem.ip().getType() != 31) {
                c1331100kk8.LJFF(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue)));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS670S0100000_21 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS670S0100000_21.invoke$2(kotlin.jvm.internal.AwS670S0100000_21, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AwS670S0100000_21 r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r2 = r14
            r1 = r15
            r0 = r16
            android.view.View r2 = (android.view.View) r2
            java.lang.String r1 = (java.lang.String) r1
            X.0l1C r0 = (X.EnumC1341680l1C) r0
            r3 = r13
            java.lang.Object r4 = r3.l0
            com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem r4 = (com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem) r4
            r4.fq(r1)
            java.lang.Object r8 = r3.l0
            com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem r8 = (com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem) r8
            r8.getClass()
            java.lang.String r4 = "photo"
            boolean r5 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            r4 = 0
            if (r5 == 0) goto Laa
            java.lang.Class<com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService> r9 = com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService.class
            r10 = 0
            r13 = 14
            r14 = 0
            r11 = r10
            r12 = r10
            java.lang.Object r7 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService r7 = (com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService) r7
            r6 = 1
            if (r7 == 0) goto Laa
            X.0Sb3 r5 = r8.LLJI
            if (r5 == 0) goto La8
            java.lang.Object r5 = r5.LL
        L39:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r5 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r5
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r5.getAweme()
            boolean r5 = r7.LIZLLL(r5)
            if (r5 != r6) goto Laa
            java.lang.Object r5 = r3.l0
            com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem r5 = (com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem) r5
            r5.getClass()
            java.lang.Class<com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService> r9 = com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService.class
            r13 = 14
            r15 = 0
            r11 = r10
            r12 = r10
            java.lang.Object r8 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService r8 = (com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService) r8
            if (r8 == 0) goto L7d
            android.content.Context r7 = r5.getContext()
            X.0hkz r11 = new X.0hkz
            java.lang.String r12 = ""
            X.0Sb3 r6 = r5.LLJI
            if (r6 == 0) goto La6
            java.lang.Object r6 = r6.LL
        L69:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r6 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r6
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r6.getAweme()
            r14 = 1
            r16 = 8
            r11.<init>(r12, r13, r14, r15, r16)
            X.0lAX r6 = new X.0lAX
            r6.<init>()
            r8.LIZIZ(r7, r2, r11, r6)
        L7d:
            X.0l1C r1 = X.EnumC1341680l1C.PHOTO
            if (r0 != r1) goto La3
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem r0 = (com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem) r0
            long r1 = r0.LLLILZJ
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto La3
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem r0 = (com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem) r0
            long r7 = r0.LLLILZJ
            long r1 = r1 - r7
            java.lang.String r0 = r0.LLLILZLLLI
            com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem.Xp(r1, r0, r4)
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem r0 = (com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem) r0
            r0.LLLILZJ = r5
        La3:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La6:
            r6 = r4
            goto L69
        La8:
            r5 = r4
            goto L39
        Laa:
            java.lang.Object r2 = r3.l0
            com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem r2 = (com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem) r2
            long r5 = java.lang.System.currentTimeMillis()
            r2.LLLILZJ = r5
            java.lang.Object r2 = r3.l0
            com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem r2 = (com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem) r2
            r2.LLLILZLLLI = r1
            r2.Wp(r1, r0)
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS670S0100000_21.invoke$20(kotlin.jvm.internal.AwS670S0100000_21, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$21(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        ((Number) obj3).intValue();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        return new Pair((View) awS670S0100000_21.l0, layoutParams);
    }

    public static final Object invoke$22(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        return new C1380600m1y((InterfaceC1380590m1x) ((InterfaceC1631620sYq) awS670S0100000_21.l0).invoke(obj, obj2, obj3));
    }

    public static final Object invoke$23(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        CommentMentionAssem commentMentionAssem = (CommentMentionAssem) awS670S0100000_21.l0;
        boolean z = commentMentionAssem.LLJJJIL;
        Float fValueOf = Float.valueOf(220.0f);
        if (z) {
            InterfaceC1348870lCn interfaceC1348870lCn = commentMentionAssem.LLJILJIL;
            if (interfaceC1348870lCn != null) {
                interfaceC1348870lCn.rm(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)));
            }
        } else {
            InterfaceC1348870lCn interfaceC1348870lCn2 = commentMentionAssem.LLJILJIL;
            if (interfaceC1348870lCn2 != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
                if (commentMentionAssem.getContext() != null) {
                    int i = C1349270lDR.LJII;
                    if (i <= 0) {
                        i = C1349270lDR.LIZIZ().getInt("keyboard_container_height", 0);
                    }
                    int iLJIIJJI = ((i - iIntValue) - iIntValue2) - C12ES.LJIIJJI(commentMentionAssem.getContext());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("containerHeight = ");
                    sbLIZ.append(i);
                    sbLIZ.append(", keyboardHeight = ");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append(", inputHeight = ");
                    sbLIZ.append(iIntValue2);
                    sbLIZ.append(", statusBarHeight = ");
                    sbLIZ.append(C12ES.LJIIJJI(commentMentionAssem.getContext()));
                    sbLIZ.append(", fixHeight = ");
                    sbLIZ.append(iLJIIJJI);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (iLJIIJJI < iLIZIZ) {
                        iLIZIZ = iLJIIJJI;
                    }
                }
                interfaceC1348870lCn2.rm(iLIZIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        JSONObject jSONObject;
        String strOptString;
        InterfaceC1381790m3t interfaceC1381790m3t;
        if (Intrinsics.LJFF(obj2, "notification")) {
            Map<String, ? extends Object> mapLJ = null;
            if ((obj3 instanceof JSONObject) && (jSONObject = (JSONObject) obj3) != null && (strOptString = jSONObject.optString("eventName")) != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                ReportWebContainer reportWebContainer = (ReportWebContainer) awS670S0100000_21.l0;
                if (jSONObjectOptJSONObject != null) {
                    mapLJ = C08HX.LJ(jSONObjectOptJSONObject);
                }
                if (reportWebContainer.LLJILJILJ != null && (interfaceC1381790m3t = reportWebContainer.LLJILLL) != null) {
                    interfaceC1381790m3t.LIZ(strOptString, mapLJ);
                }
                InterfaceC1387770mDX interfaceC1387770mDX = reportWebContainer.LLJJI;
                if (interfaceC1387770mDX != null) {
                    interfaceC1387770mDX.LIZ(strOptString, mapLJ, reportWebContainer.LLIZLLLIL, reportWebContainer);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ((CommentKeyboardMultiPanelAssem) awS670S0100000_21.l0).kp((AbstractC1347290lAF) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        C0Y8T c0y8t = (C0Y8T) obj;
        Function0 function0 = (Function0) obj2;
        if (c0y8t != null) {
            ((KeyboardIconGroupAssem) awS670S0100000_21.l0).Go(c0y8t);
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        C0Y8T c0y8t = (C0Y8T) obj;
        Function0 function0 = (Function0) obj2;
        if (c0y8t != null) {
            ((KeyboardIconGroupAssem) awS670S0100000_21.l0).Go(c0y8t);
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        ((PortraitInputKeyboard) awS670S0100000_21.l0).fq(((Number) obj).intValue(), ((Number) obj2).intValue(), (Intent) obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        ((PortraitInputKeyboard) awS670S0100000_21.l0).fq(((Number) obj).intValue(), ((Number) obj2).intValue(), (Intent) obj3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList;
        Context context;
        Activity activityLIZ;
        Window window;
        View decorView;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        Intent intent = (Intent) obj3;
        if (intent != null) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            if (parcelableArrayListExtra != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(parcelableArrayListExtra, 10));
                Iterator it2 = parcelableArrayListExtra.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1351950lHl.LJJ((MediaModel) it2.next()));
                }
            } else {
                arrayList = null;
            }
            ArrayList arrayListLIZ = C09HN.LIZ(arrayList);
            if (arrayListLIZ != null && !arrayListLIZ.isEmpty() && (context = ((CommentInnerAddPhotoAssem) awS670S0100000_21.l0).getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(decorView, "alpha", 1.0f, 0.0f);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.addListener(new ALAdapterS0S0302000_11((CommentInnerAddPhotoAssem) awS670S0100000_21.l0, intent, iIntValue, iIntValue2, arrayListLIZ, 0));
                C786410Ut5.Pd(objectAnimatorOfFloat);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS670S0100000_21 awS670S0100000_21, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        StoryViewerListFragment storyViewerListFragment = (StoryViewerListFragment) awS670S0100000_21.l0;
        storyViewerListFragment.LLJ = iIntValue;
        storyViewerListFragment.LLJI = iIntValue3;
        storyViewerListFragment.LLJIJIL = iIntValue2;
        IPageActionBarAbility iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF((StoryViewerListFragment) awS670S0100000_21.l0, null), IPageActionBarAbility.class, null);
        if (iPageActionBarAbility != null) {
            iPageActionBarAbility.p51(((StoryViewerListFragment) awS670S0100000_21.l0).LLIZ);
        }
        return Unit.LIZ;
    }
}
