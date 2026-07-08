package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.C041J;
import X.C09AY;
import X.C0FLJ;
import X.C0N57;
import X.C0T8L;
import X.C0T8N;
import X.C123100dR;
import X.C12ES;
import X.C1345760l7m;
import X.C1350500lFQ;
import X.C1350520lFS;
import X.C1350920lG6;
import X.C1357530lQl;
import X.C1361930lXr;
import X.C1371600lnS;
import X.C1377420lwq;
import X.C1388240mEI;
import X.C1388250mEJ;
import X.C1388380mEW;
import X.C1388410mEZ;
import X.C1388420mEa;
import X.C1388430mEb;
import X.C1558520qew;
import X.C1906580ziK;
import X.C19290510dT;
import X.C19EG;
import X.C20584715gj;
import X.C2188811AlT;
import X.C259800zU;
import X.C418440Gaw;
import X.C621180OYa;
import X.C712520RxC;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1350540lFU;
import X.InterfaceC1380500m1o;
import X.InterfaceC1380590m1x;
import X.InterfaceC1393560mMs;
import X.InterfaceC1631620sYq;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewOnAttachStateChangeListenerC1401940maO;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.headeranchor.common.CommentCommonTopBarAssem;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelSearchWordAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarAction;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.LeftAvatarAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.note.StoryThoughtMentionManagerImpl;
import com.ss.android.ugc.aweme.tako.share.panel.TakoImageSharePackage;
import com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage;
import com.ss.android.ugc.aweme.tako.share.panel.TakoSharePackage;
import com.ss.android.ugc.aweme.tako.share.panel.TakoVideoSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public class AwS485S0200000_21 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS485S0200000_21(C259800zU c259800zU, C259800zU<CommentTopBarComponent> c259800zU2, CommentCommonTopBarAssem commentCommonTopBarAssem) {
        super(3);
        this.$t = commentCommonTopBarAssem;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS485S0200000_21(C712520RxC c712520RxC, C1357530lQl c1357530lQl, int i) {
        super(3);
        this.$t = i;
        this.l0 = c712520RxC;
        this.l1 = c1357530lQl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS485S0200000_21(C1371600lnS c1371600lnS, TakoImageSharePackage takoImageSharePackage, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1371600lnS;
        this.l1 = takoImageSharePackage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS485S0200000_21(C1371600lnS c1371600lnS, TakoLongImageSharePackage takoLongImageSharePackage, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1371600lnS;
        this.l1 = takoLongImageSharePackage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS485S0200000_21(C1371600lnS c1371600lnS, TakoVideoSharePackage takoVideoSharePackage, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1371600lnS;
        this.l1 = takoVideoSharePackage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS485S0200000_21(C1377420lwq c1377420lwq, WebShareInfo.HybridContainerInfo hybridContainerInfo, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1377420lwq;
        this.l1 = hybridContainerInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS485S0200000_21(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super Function2<Object, ? super InterfaceC1380500m1o, Object>, Object, Object, ? extends InterfaceC1380590m1x<Object>> interfaceC1631620sYq2, Function1<? super InterfaceC1380590m1x<Object>, ? extends Function1<? super Function1<? super InterfaceC1380500m1o, ? extends InterfaceC1380500m1o>, ? extends Function1<? super InterfaceC1380500m1o, ? extends InterfaceC1380500m1o>>>[] function1Arr) {
        super(3);
        this.$t = function1Arr;
        this.l0 = interfaceC1631620sYq;
        this.l1 = interfaceC1631620sYq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS485S0200000_21(C20584715gj c20584715gj, StoryThoughtMentionManagerImpl storyThoughtMentionManagerImpl, int i) {
        super(3);
        this.$t = i;
        this.l0 = c20584715gj;
        this.l1 = storyThoughtMentionManagerImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS485S0200000_21(View view, LeftAvatarAssem leftAvatarAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = leftAvatarAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS485S0200000_21(PortraitInputKeyboard portraitInputKeyboard, UIAssem uIAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = portraitInputKeyboard;
        this.l1 = uIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS485S0200000_21(CommentTopBarComponent commentTopBarComponent, TitlePanelSearchWordAssem titlePanelSearchWordAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = commentTopBarComponent;
        this.l1 = titlePanelSearchWordAssem;
    }

    public static final Object invoke$0(AwS485S0200000_21 awS485S0200000_21, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        int iIntValue = ((Number) obj2).intValue();
        Intent intent = (Intent) obj3;
        ((PortraitInputKeyboard) awS485S0200000_21.l0).LLLLILI = intent;
        IRefactorKeyboardFragment iRefactorKeyboardFragmentLJIIJ = C1345760l7m.LJIIJ(C724240Sb0.LJI((UIAssem) awS485S0200000_21.l1), C1558520qew.LJIIL((UIAssem) awS485S0200000_21.l1));
        if (iRefactorKeyboardFragmentLJIIJ != null) {
            iRefactorKeyboardFragmentLJIIJ.XW0(iIntValue, intent, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS485S0200000_21 awS485S0200000_21, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        int iIntValue = ((Number) obj2).intValue();
        Intent intent = (Intent) obj3;
        if (iIntValue == 100) {
            PortraitInputKeyboard portraitInputKeyboard = (PortraitInputKeyboard) awS485S0200000_21.l0;
            portraitInputKeyboard.LLLLILI = intent;
            portraitInputKeyboard.LLLLIILLL = null;
        }
        IRefactorKeyboardFragment iRefactorKeyboardFragmentLJIIJ = C1345760l7m.LJIIJ(C724240Sb0.LJI((UIAssem) awS485S0200000_21.l1), C1558520qew.LJIIL((UIAssem) awS485S0200000_21.l1));
        if (iRefactorKeyboardFragmentLJIIJ != null) {
            iRefactorKeyboardFragmentLJIIJ.XW0(iIntValue, intent, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS485S0200000_21 awS485S0200000_21, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        StoryThoughtMentionManagerImpl storyThoughtMentionManagerImpl = (StoryThoughtMentionManagerImpl) awS485S0200000_21.l1;
        C20584715gj c20584715gj = (C20584715gj) awS485S0200000_21.l0;
        if (((KeyEvent) obj3).getAction() != 0 || iIntValue != 67) {
            return null;
        }
        int selectionStart = c20584715gj.getSelectionStart();
        int selectionEnd = c20584715gj.getSelectionEnd();
        for (C0FLJ c0flj : (ArrayList) storyThoughtMentionManagerImpl.LJIIIIZZ) {
            if (c0flj.LIZ(selectionStart, selectionEnd)) {
                int i = c0flj.LIZ;
                if (selectionStart == i) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 25) {
                    c20584715gj.setSelection(i, c0flj.LIZIZ);
                } else {
                    c20584715gj.setSelection(c0flj.LIZIZ, i);
                }
                return Boolean.TRUE;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$11(AwS485S0200000_21 awS485S0200000_21, Object obj, Object obj2, Object obj3) {
        String str;
        Aweme aweme;
        String str2;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        String string;
        boolean zLJFF;
        ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL;
        int iIntValue = ((Number) obj2).intValue();
        MotionEvent motionEvent = (MotionEvent) obj3;
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue == 3) {
                    C1350500lFQ c1350500lFQ = C1350500lFQ.LIZ;
                    C19EG c19egLIZ = C724240Sb0.LIZ((CommentCommonTopBarAssem) awS485S0200000_21.l1);
                    Fragment fragmentLJI = C724240Sb0.LJI((CommentCommonTopBarAssem) awS485S0200000_21.l1);
                    CommentTopBarComponent commentTopBarComponent = (CommentTopBarComponent) ((C259800zU) awS485S0200000_21.l0).element;
                    Aweme aweme2 = CommentContextSourceKt.aweme(((CommentCommonTopBarAssem) awS485S0200000_21.l1).ip());
                    CommentContextSource commentContextSourceIp = ((CommentCommonTopBarAssem) awS485S0200000_21.l1).ip();
                    c1350500lFQ.getClass();
                    Integer num = commentTopBarComponent.bizType;
                    if (num != null && (iCommentTopBarImplementServiceLIZLLL = C1350500lFQ.LIZLLL(num.intValue())) != null) {
                        iCommentTopBarImplementServiceLIZLLL.onComponentTouchEvent(c19egLIZ, fragmentLJI, commentTopBarComponent, aweme2, commentContextSourceIp, motionEvent);
                    }
                }
            } else {
                C1350500lFQ c1350500lFQ2 = C1350500lFQ.LIZ;
                C19EG c19egLIZ2 = C724240Sb0.LIZ((CommentCommonTopBarAssem) awS485S0200000_21.l1);
                Fragment fragmentLJI2 = C724240Sb0.LJI((CommentCommonTopBarAssem) awS485S0200000_21.l1);
                CommentTopBarComponent commentTopBarComponent2 = (CommentTopBarComponent) ((C259800zU) awS485S0200000_21.l0).element;
                Aweme aweme3 = CommentContextSourceKt.aweme(((CommentCommonTopBarAssem) awS485S0200000_21.l1).ip());
                CommentContextSource commentContextSourceIp2 = ((CommentCommonTopBarAssem) awS485S0200000_21.l1).ip();
                c1350500lFQ2.getClass();
                zLJFF = C1350500lFQ.LJFF(c19egLIZ2, fragmentLJI2, commentTopBarComponent2, aweme3, commentContextSourceIp2);
                return Boolean.valueOf(zLJFF);
            }
        } else {
            Map<String, InterfaceC1350540lFU> map = C1350520lFS.LIZ;
            C1350520lFS.LIZIZ((CommentTopBarComponent) ((C259800zU) awS485S0200000_21.l0).element);
            C1350500lFQ c1350500lFQ3 = C1350500lFQ.LIZ;
            C19EG c19egLIZ3 = C724240Sb0.LIZ((CommentCommonTopBarAssem) awS485S0200000_21.l1);
            Fragment fragmentLJI3 = C724240Sb0.LJI((CommentCommonTopBarAssem) awS485S0200000_21.l1);
            CommentTopBarComponent commentTopBarComponent3 = (CommentTopBarComponent) ((C259800zU) awS485S0200000_21.l0).element;
            Aweme aweme4 = CommentContextSourceKt.aweme(((CommentCommonTopBarAssem) awS485S0200000_21.l1).ip());
            CommentContextSource commentContextSourceIp3 = ((CommentCommonTopBarAssem) awS485S0200000_21.l1).ip();
            c1350500lFQ3.getClass();
            Aweme aweme5 = null;
            if (!C1350500lFQ.LJ(c19egLIZ3, fragmentLJI3, commentTopBarComponent3, aweme4, commentContextSourceIp3)) {
                C259800zU c259800zU = (C259800zU) awS485S0200000_21.l0;
                CommentTopBarAction commentTopBarAction = ((CommentTopBarComponent) c259800zU.element).action;
                if (commentTopBarAction != null) {
                    string = commentTopBarAction.schema;
                } else {
                    string = null;
                }
                CommentCommonTopBarAssem commentCommonTopBarAssem = (CommentCommonTopBarAssem) awS485S0200000_21.l1;
                try {
                    if (C123100dR.LIZ(string)) {
                        HashMap mapLIZIZ = C1350500lFQ.LIZIZ(C724240Sb0.LIZ(commentCommonTopBarAssem), C724240Sb0.LJI(commentCommonTopBarAssem), (CommentTopBarComponent) c259800zU.element, CommentContextSourceKt.aweme(commentCommonTopBarAssem.ip()), commentCommonTopBarAssem.ip());
                        if (mapLIZIZ != null) {
                            Uri.Builder builderBuildUpon = UriProtector.parse(string).buildUpon();
                            for (Map.Entry entry : mapLIZIZ.entrySet()) {
                                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                            }
                            string = builderBuildUpon.toString();
                        }
                        SmartRouter.buildRoute(commentCommonTopBarAssem.getContext(), string).open();
                    }
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C1350500lFQ c1350500lFQ4 = C1350500lFQ.LIZ;
            C19EG c19egLIZ4 = C724240Sb0.LIZ((CommentCommonTopBarAssem) awS485S0200000_21.l1);
            Fragment fragmentLJI4 = C724240Sb0.LJI((CommentCommonTopBarAssem) awS485S0200000_21.l1);
            CommentTopBarComponent commentTopBarComponent4 = (CommentTopBarComponent) ((C259800zU) awS485S0200000_21.l0).element;
            Aweme aweme6 = CommentContextSourceKt.aweme(((CommentCommonTopBarAssem) awS485S0200000_21.l1).ip());
            CommentContextSource commentContextSourceIp4 = ((CommentCommonTopBarAssem) awS485S0200000_21.l1).ip();
            c1350500lFQ4.getClass();
            HashMap mapLIZ = C1350500lFQ.LIZ(c19egLIZ4, fragmentLJI4, commentTopBarComponent4, aweme6, commentContextSourceIp4);
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentTopBarComponent commentTopBarComponent5 = (CommentTopBarComponent) ((C259800zU) awS485S0200000_21.l0).element;
            CommentContextSource commentContextSourceIp5 = ((CommentCommonTopBarAssem) awS485S0200000_21.l1).ip();
            if (commentContextSourceIp5 != null && (commonModel2 = commentContextSourceIp5.getCommonModel()) != null) {
                str = commonModel2.eventType;
            } else {
                str = null;
            }
            CommentContextSource commentContextSourceIp6 = ((CommentCommonTopBarAssem) awS485S0200000_21.l1).ip();
            if (commentContextSourceIp6 != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceIp6);
            } else {
                aweme = null;
            }
            c1350920lG6.getClass();
            C1350920lG6.LJLIL(commentTopBarComponent5, str, aweme, mapLIZ);
            C259800zU c259800zU2 = (C259800zU) awS485S0200000_21.l0;
            String str3 = ((CommentTopBarComponent) c259800zU2.element).name;
            if (str3 != null) {
                CommentCommonTopBarAssem commentCommonTopBarAssem2 = (CommentCommonTopBarAssem) awS485S0200000_21.l1;
                CommentContextSource commentContextSourceIp7 = commentCommonTopBarAssem2.ip();
                if (commentContextSourceIp7 != null && (commonModel = commentContextSourceIp7.getCommonModel()) != null) {
                    str2 = commonModel.eventType;
                } else {
                    str2 = null;
                }
                CommentContextSource commentContextSourceIp8 = commentCommonTopBarAssem2.ip();
                if (commentContextSourceIp8 != null) {
                    aweme5 = CommentContextSourceKt.aweme(commentContextSourceIp8);
                }
                C1350920lG6.LJLIIIL(aweme5, "comment_top_component_click", str3, str2, CommentCommonTopBarAssem.hp((CommentTopBarComponent) c259800zU2.element, mapLIZ));
            }
        }
        zLJFF = false;
        return Boolean.valueOf(zLJFF);
    }

    public static final Object invoke$2(AwS485S0200000_21 awS485S0200000_21, Object obj, Object obj2, Object obj3) {
        int iLIZIZ;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] avatarImageHeight = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", avatarImageWidth = ");
        sbLIZ.append(iIntValue2);
        C19290510dT.LIZLLL("LeftAvatarAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (iIntValue2 > 0 && iIntValue > 0) {
            ViewGroup.LayoutParams layoutParams = ((LeftAvatarAssem) awS485S0200000_21.l0).lp().getLayoutParams();
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
            View view = (View) awS485S0200000_21.l1;
            if (iIntValue <= 40) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            } else {
                iLIZIZ = 0;
            }
            view.setPadding(iLIZIZ, 0, 0, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.0T8N, java.lang.Object] */
    public static final Object invoke$3(AwS485S0200000_21 awS485S0200000_21, Object obj, Object obj2, Object obj3) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Context contextLIZIZ;
        String str;
        AwS600S0100000_21 awS600S0100000_21;
        ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        View viewLJI = ((C1371600lnS) awS485S0200000_21.l0).LJI();
        if ((viewLJI == null || (contextLIZIZ = viewLJI.getContext()) == null) && ((abstractC1387200mCcLJ = C1906580ziK.LJ()) == null || (contextLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null)) {
            return null;
        }
        float f = iIntValue / contextLIZIZ.getResources().getDisplayMetrics().density;
        C0N57.LIZ.LIZIZ(f);
        C1388380mEW c1388380mEWLIZ = C1388420mEa.LIZ((TakoImageSharePackage) awS485S0200000_21.l1);
        if (c1388380mEWLIZ != null && (awS600S0100000_21 = c1388380mEWLIZ.LIZLLL) != null) {
            awS600S0100000_21.invoke(Float.valueOf(f));
        }
        C259800zU c259800zU = new C259800zU();
        ?? c0t8n = new C0T8N(contextLIZIZ);
        TakoImageSharePackage takoImageSharePackage = (TakoImageSharePackage) awS485S0200000_21.l1;
        if ((takoImageSharePackage instanceof TakoSharePackage) && takoImageSharePackage != null) {
            str = takoImageSharePackage.screenType;
        } else {
            str = null;
        }
        c0t8n.setFullScreen(Intrinsics.LJFF(str, "full_screen"));
        c0t8n.setDefaultCloseIconProvider(new AwS565S0100000_21(takoImageSharePackage, 834));
        c0t8n.setOnCloseClick(new AwS422S0200000_21(takoImageSharePackage, (TakoImageSharePackage) c0t8n, (C0T8N) c259800zU, (C259800zU<C0T8N>) 53));
        c259800zU.element = c0t8n;
        return new Pair(c0t8n, null);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.0T8N, android.view.View, java.lang.Object] */
    public static final Object invoke$4(AwS485S0200000_21 awS485S0200000_21, Object obj, Object obj2, Object obj3) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Context contextLIZIZ;
        AwS600S0100000_21 awS600S0100000_21;
        ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        View viewLJI = ((C1371600lnS) awS485S0200000_21.l0).LJI();
        if ((viewLJI == null || (contextLIZIZ = viewLJI.getContext()) == null) && ((abstractC1387200mCcLJ = C1906580ziK.LJ()) == null || (contextLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null)) {
            return null;
        }
        float f = iIntValue / contextLIZIZ.getResources().getDisplayMetrics().density;
        C0N57.LIZ.LIZIZ(f);
        C1388240mEI c1388240mEILIZ = C1388250mEJ.LIZ((TakoLongImageSharePackage) awS485S0200000_21.l1);
        if (c1388240mEILIZ != null && (awS600S0100000_21 = c1388240mEILIZ.LIZLLL) != null) {
            awS600S0100000_21.invoke(Float.valueOf(f));
        }
        C259800zU c259800zU = new C259800zU();
        ?? c0t8n = new C0T8N(contextLIZIZ);
        TakoLongImageSharePackage takoLongImageSharePackage = (TakoLongImageSharePackage) awS485S0200000_21.l1;
        c0t8n.setDefaultCloseIconProvider(new AwS565S0100000_21(takoLongImageSharePackage, 835));
        c0t8n.setOnCloseClick(new AwS422S0200000_21(takoLongImageSharePackage, (TakoLongImageSharePackage) c0t8n, (C0T8N) c259800zU, (C259800zU<C0T8N>) 54));
        c0t8n.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1401940maO(takoLongImageSharePackage, 1));
        c259800zU.element = c0t8n;
        return new Pair(c0t8n, null);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.0T8L, java.lang.Object] */
    public static final Object invoke$5(AwS485S0200000_21 awS485S0200000_21, Object obj, Object obj2, Object obj3) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Context contextLIZIZ;
        String str;
        AwS600S0100000_21 awS600S0100000_21;
        ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        View viewLJI = ((C1371600lnS) awS485S0200000_21.l0).LJI();
        if ((viewLJI == null || (contextLIZIZ = viewLJI.getContext()) == null) && ((abstractC1387200mCcLJ = C1906580ziK.LJ()) == null || (contextLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null)) {
            return null;
        }
        float f = iIntValue / contextLIZIZ.getResources().getDisplayMetrics().density;
        C0N57.LIZ.LIZIZ(f);
        C1388410mEZ c1388410mEZLIZ = C1388430mEb.LIZ((TakoVideoSharePackage) awS485S0200000_21.l1);
        if (c1388410mEZLIZ != null && (awS600S0100000_21 = c1388410mEZLIZ.LIZLLL) != null) {
            awS600S0100000_21.invoke(Float.valueOf(f));
        }
        C259800zU c259800zU = new C259800zU();
        ?? c0t8l = new C0T8L(contextLIZIZ);
        TakoVideoSharePackage takoVideoSharePackage = (TakoVideoSharePackage) awS485S0200000_21.l1;
        if ((takoVideoSharePackage instanceof TakoSharePackage) && takoVideoSharePackage != null) {
            str = takoVideoSharePackage.screenType;
        } else {
            str = null;
        }
        c0t8l.setFullScreen(Intrinsics.LJFF(str, "full_screen"));
        c0t8l.setDefaultCloseIconProvider(new AwS565S0100000_21(takoVideoSharePackage, 836));
        c0t8l.setOnCloseClick(new AwS422S0200000_21(takoVideoSharePackage, (TakoVideoSharePackage) c0t8l, (C0T8L) c259800zU, (C259800zU<C0T8L>) 55));
        c259800zU.element = c0t8l;
        return new Pair(c0t8l, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS485S0200000_21 awS485S0200000_21, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        if (!zBooleanValue) {
            return null;
        }
        C1377420lwq c1377420lwq = (C1377420lwq) awS485S0200000_21.l0;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1377420lwq.LJ;
        FrameLayout.LayoutParams layoutParamsLJJJJZ = C621180OYa.LIZIZ.LJJJJZ(((C1377420lwq) awS485S0200000_21.l0).LIZ, iIntValue, (int) C12ES.LIZJ(((WebShareInfo.HybridContainerInfo) awS485S0200000_21.l1).height, c1377420lwq.LIZ), (int) C12ES.LIZJ(((WebShareInfo.HybridContainerInfo) awS485S0200000_21.l1).width, ((C1377420lwq) awS485S0200000_21.l0).LIZ), (int) C12ES.LIZJ(((WebShareInfo.HybridContainerInfo) awS485S0200000_21.l1).offsetX, ((C1377420lwq) awS485S0200000_21.l0).LIZ), (int) C12ES.LIZJ(((WebShareInfo.HybridContainerInfo) awS485S0200000_21.l1).offsetY, ((C1377420lwq) awS485S0200000_21.l0).LIZ), ((WebShareInfo.HybridContainerInfo) awS485S0200000_21.l1).alignType);
        C786410Ut5.I7(null, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        return new Pair(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, layoutParamsLJJJJZ);
    }

    public static final Object invoke$7(AwS485S0200000_21 awS485S0200000_21, Object obj, Object obj2, Object obj3) {
        C19EG activity;
        C19EG activity2;
        String str;
        Aweme aweme;
        String str2;
        Aweme aweme2;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        String string;
        C19EG activity3;
        boolean zLJFF;
        ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL;
        int iIntValue = ((Number) obj2).intValue();
        MotionEvent motionEvent = (MotionEvent) obj3;
        C19EG activity4 = null;
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue == 3) {
                    C1350500lFQ c1350500lFQ = C1350500lFQ.LIZ;
                    Fragment fragmentHp = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).hp();
                    if (fragmentHp != null) {
                        activity4 = fragmentHp.getActivity();
                    }
                    Fragment fragmentHp2 = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).hp();
                    CommentTopBarComponent commentTopBarComponent = (CommentTopBarComponent) awS485S0200000_21.l0;
                    Aweme aweme3 = CommentContextSourceKt.aweme(((TitlePanelSearchWordAssem) awS485S0200000_21.l1).ip());
                    CommentContextSource commentContextSourceIp = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).ip();
                    c1350500lFQ.getClass();
                    Integer num = commentTopBarComponent.bizType;
                    if (num != null && (iCommentTopBarImplementServiceLIZLLL = C1350500lFQ.LIZLLL(num.intValue())) != null) {
                        iCommentTopBarImplementServiceLIZLLL.onComponentTouchEvent(activity4, fragmentHp2, commentTopBarComponent, aweme3, commentContextSourceIp, motionEvent);
                    }
                }
            } else {
                C1350500lFQ c1350500lFQ2 = C1350500lFQ.LIZ;
                Fragment fragmentHp3 = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).hp();
                if (fragmentHp3 != null) {
                    activity4 = fragmentHp3.getActivity();
                }
                Fragment fragmentHp4 = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).hp();
                CommentTopBarComponent commentTopBarComponent2 = (CommentTopBarComponent) awS485S0200000_21.l0;
                Aweme aweme4 = CommentContextSourceKt.aweme(((TitlePanelSearchWordAssem) awS485S0200000_21.l1).ip());
                CommentContextSource commentContextSourceIp2 = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).ip();
                c1350500lFQ2.getClass();
                zLJFF = C1350500lFQ.LJFF(activity4, fragmentHp4, commentTopBarComponent2, aweme4, commentContextSourceIp2);
                return Boolean.valueOf(zLJFF);
            }
        } else {
            Map<String, InterfaceC1350540lFU> map = C1350520lFS.LIZ;
            C1350520lFS.LIZIZ((CommentTopBarComponent) awS485S0200000_21.l0);
            C1350500lFQ c1350500lFQ3 = C1350500lFQ.LIZ;
            Fragment fragmentHp5 = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).hp();
            if (fragmentHp5 != null) {
                activity = fragmentHp5.getActivity();
            } else {
                activity = null;
            }
            Fragment fragmentHp6 = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).hp();
            CommentTopBarComponent commentTopBarComponent3 = (CommentTopBarComponent) awS485S0200000_21.l0;
            Aweme aweme5 = CommentContextSourceKt.aweme(((TitlePanelSearchWordAssem) awS485S0200000_21.l1).ip());
            CommentContextSource commentContextSourceIp3 = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).ip();
            c1350500lFQ3.getClass();
            if (!C1350500lFQ.LJ(activity, fragmentHp6, commentTopBarComponent3, aweme5, commentContextSourceIp3)) {
                CommentTopBarComponent commentTopBarComponent4 = (CommentTopBarComponent) awS485S0200000_21.l0;
                CommentTopBarAction commentTopBarAction = commentTopBarComponent4.action;
                if (commentTopBarAction != null) {
                    string = commentTopBarAction.schema;
                } else {
                    string = null;
                }
                TitlePanelSearchWordAssem titlePanelSearchWordAssem = (TitlePanelSearchWordAssem) awS485S0200000_21.l1;
                try {
                    if (C041J.LIZ(string)) {
                        Fragment fragmentHp7 = titlePanelSearchWordAssem.hp();
                        if (fragmentHp7 != null) {
                            activity3 = fragmentHp7.getActivity();
                        } else {
                            activity3 = null;
                        }
                        HashMap mapLIZIZ = C1350500lFQ.LIZIZ(activity3, titlePanelSearchWordAssem.hp(), commentTopBarComponent4, CommentContextSourceKt.aweme(titlePanelSearchWordAssem.ip()), titlePanelSearchWordAssem.ip());
                        if (mapLIZIZ != null) {
                            Uri.Builder builderBuildUpon = UriProtector.parse(string).buildUpon();
                            for (Map.Entry entry : mapLIZIZ.entrySet()) {
                                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                            }
                            string = builderBuildUpon.toString();
                        }
                        SmartRouter.buildRoute(titlePanelSearchWordAssem.getContentView().getContext(), string).open();
                    }
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C1350500lFQ c1350500lFQ4 = C1350500lFQ.LIZ;
            Fragment fragmentHp8 = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).hp();
            if (fragmentHp8 != null) {
                activity2 = fragmentHp8.getActivity();
            } else {
                activity2 = null;
            }
            Fragment fragmentHp9 = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).hp();
            CommentTopBarComponent commentTopBarComponent5 = (CommentTopBarComponent) awS485S0200000_21.l0;
            Aweme aweme6 = CommentContextSourceKt.aweme(((TitlePanelSearchWordAssem) awS485S0200000_21.l1).ip());
            CommentContextSource commentContextSourceIp4 = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).ip();
            c1350500lFQ4.getClass();
            HashMap mapLIZ = C1350500lFQ.LIZ(activity2, fragmentHp9, commentTopBarComponent5, aweme6, commentContextSourceIp4);
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentTopBarComponent commentTopBarComponent6 = (CommentTopBarComponent) awS485S0200000_21.l0;
            CommentContextSource commentContextSourceIp5 = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).ip();
            if (commentContextSourceIp5 != null && (commonModel2 = commentContextSourceIp5.getCommonModel()) != null) {
                str = commonModel2.eventType;
            } else {
                str = null;
            }
            CommentContextSource commentContextSourceIp6 = ((TitlePanelSearchWordAssem) awS485S0200000_21.l1).ip();
            if (commentContextSourceIp6 != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceIp6);
            } else {
                aweme = null;
            }
            c1350920lG6.getClass();
            C1350920lG6.LJLIL(commentTopBarComponent6, str, aweme, mapLIZ);
            String str3 = ((CommentTopBarComponent) awS485S0200000_21.l0).name;
            if (str3 != null) {
                TitlePanelSearchWordAssem titlePanelSearchWordAssem2 = (TitlePanelSearchWordAssem) awS485S0200000_21.l1;
                CommentContextSource commentContextSourceIp7 = titlePanelSearchWordAssem2.ip();
                if (commentContextSourceIp7 != null && (commonModel = commentContextSourceIp7.getCommonModel()) != null) {
                    str2 = commonModel.eventType;
                } else {
                    str2 = null;
                }
                CommentContextSource commentContextSourceIp8 = titlePanelSearchWordAssem2.ip();
                if (commentContextSourceIp8 != null) {
                    aweme2 = CommentContextSourceKt.aweme(commentContextSourceIp8);
                } else {
                    aweme2 = null;
                }
                C1350920lG6.LJLIIIL(aweme2, "comment_top_component_click", str3, str2, null);
            }
        }
        zLJFF = false;
        return Boolean.valueOf(zLJFF);
    }

    public static final Object invoke$8(AwS485S0200000_21 awS485S0200000_21, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ((C1361930lXr) obj).LIZ((C712520RxC) awS485S0200000_21.l0, (InterfaceC1393560mMs) obj2, ((C1357530lQl) awS485S0200000_21.l1).LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS485S0200000_21 awS485S0200000_21, Object obj, Object obj2, Object obj3) {
        InterfaceC1380590m1x interfaceC1380590m1x = (InterfaceC1380590m1x) ((InterfaceC1631620sYq) awS485S0200000_21.l0).invoke(obj, obj2, obj3);
        Function1<InterfaceC1380500m1o, InterfaceC1380500m1o> function1LIZ = interfaceC1380590m1x.LIZ();
        interfaceC1380590m1x.LIZIZ(AFwS259S0000000_21.get$arr$(432));
        Function1[] function1Arr = (Function1[]) awS485S0200000_21.l1;
        ArrayList arrayList = new ArrayList(function1Arr.length);
        for (Function1 function1 : function1Arr) {
            arrayList.add(function1.invoke(interfaceC1380590m1x));
        }
        Function1[] function1Arr2 = (Function1[]) arrayList.toArray(new Function1[0]);
        interfaceC1380590m1x.LIZIZ((Function1) new AwS600S0100000_21((Function1[]) Arrays.copyOf(function1Arr2, function1Arr2.length), (Function1<? super InterfaceC1380590m1x<Object>, ? extends Function1<? super Function1<? super InterfaceC1380500m1o, ? extends InterfaceC1380500m1o>, ? extends Function1<? super InterfaceC1380500m1o, ? extends InterfaceC1380500m1o>>>[]) 401).invoke(function1LIZ));
        return interfaceC1380590m1x;
    }
}
