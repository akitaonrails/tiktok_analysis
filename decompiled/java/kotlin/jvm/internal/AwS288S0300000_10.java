package kotlin.jvm.internal;

import X.C09AY;
import X.C0H46;
import X.C0HBA;
import X.C0P7X;
import X.C0PCY;
import X.C0PRC;
import X.C0PVO;
import X.C0Q3E;
import X.C0Q6U;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LQ;
import X.C1529880puk;
import X.C1884007Zm;
import X.C1954807lC;
import X.C19EG;
import X.C23271099x;
import X.C2454809je;
import X.C259800zU;
import X.C291001Au;
import X.C384050F3z;
import X.C418440Gaw;
import X.C640140P8y;
import X.C641860PFo;
import X.C644060POa;
import X.C647380PaK;
import X.C649290PdP;
import X.C650950Pg5;
import X.C651580Ph6;
import X.C657990PrR;
import X.C661350Pwr;
import X.C664120Q3e;
import X.C682950Qqb;
import X.C682960Qqc;
import X.C683120Qqs;
import X.C683220Qr2;
import X.C685670Quz;
import X.C685680Qv0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C948503nH;
import X.EnumC1338240kve;
import X.EnumC669620QOi;
import X.EnumC682970Qqd;
import X.InterfaceC2454909jf;
import X.InterfaceC2455009jg;
import X.InterfaceC2455109jh;
import X.InterfaceC634840OvC;
import X.InterfaceC685700Qv2;
import X.InterfaceC685740Qv6;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.ui.SearchTopBarAssem;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS288S0300000_10 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS288S0300000_10 awS288S0300000_10, Object obj, Object obj2) {
        int iLIZIZ;
        int iLIZIZ2;
        float fLIZIZ;
        int iIntValue;
        ReusedUIAssem reusedUIAssem = (ReusedUIAssem) obj;
        InterfaceC2455009jg interfaceC2455009jg = (InterfaceC2455009jg) obj2;
        if (interfaceC2455009jg != null) {
            C657990PrR.LIZJ((View) awS288S0300000_10.l0, new AwS582S0100000_3(interfaceC2455009jg, 46));
            if (interfaceC2455009jg instanceof C683120Qqs) {
                C661350Pwr.LJIIL((SmartImageView) awS288S0300000_10.l1);
                C661350Pwr.LIZJ((FrameLayout) awS288S0300000_10.l2);
                SmartImageView smartImageView = (SmartImageView) awS288S0300000_10.l1;
                C683120Qqs c683120Qqs = (C683120Qqs) interfaceC2455009jg;
                reusedUIAssem.getClass();
                Integer num = c683120Qqs.LJFF;
                if (num != null) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num));
                } else {
                    iLIZIZ = 0;
                }
                C1331750klB c1331750klB = new C1331750klB();
                EnumC682970Qqd enumC682970Qqd = c683120Qqs.LIZIZ;
                int[] iArr = C682960Qqc.LIZ;
                int i = iArr[enumC682970Qqd.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        c1331750klB.LIZ = true;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c1331750klB.LIZ = false;
                    c1331750klB.LJ = C418440Gaw.LIZIZ(10);
                }
                if (iLIZIZ == 0 && c683120Qqs.LJI) {
                    Integer numLIZJ = c683120Qqs.LJII;
                    if (numLIZJ == null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, smartImageView.getContext())) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = numLIZJ.intValue();
                    }
                    float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
                    c1331750klB.LIZJ = iIntValue;
                    c1331750klB.LIZIZ = fLIZIZ2;
                }
                smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
                int i2 = C682960Qqc.LIZIZ[c683120Qqs.LIZJ.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        smartImageView.setActualImageScaleType(EnumC1338240kve.FIT_CENTER);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    smartImageView.setActualImageScaleType(EnumC1338240kve.CENTER_CROP);
                }
                if (iLIZIZ > 0) {
                    C384050F3z c384050F3z = new C384050F3z();
                    if (c683120Qqs.LJI) {
                        Integer numLIZJ2 = c683120Qqs.LJII;
                        if (numLIZJ2 == null) {
                            numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, smartImageView.getContext());
                        }
                        c384050F3z.LJ = numLIZJ2;
                        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                    }
                    c384050F3z.LIZ = c683120Qqs.LIZLLL;
                    int i3 = iArr[c683120Qqs.LIZIZ.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            fLIZIZ = C418440Gaw.LIZIZ(200);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        fLIZIZ = C418440Gaw.LIZIZ(10);
                    }
                    c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
                    smartImageView.setBackground(c384050F3z.LIZ(reusedUIAssem.LJJIJL().getContext()));
                } else {
                    smartImageView.setBackground(null);
                }
                Integer num2 = c683120Qqs.LJFF;
                if (num2 != null) {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num2));
                } else {
                    iLIZIZ2 = 0;
                }
                smartImageView.setPadding(iLIZIZ2, iLIZIZ2, iLIZIZ2, iLIZIZ2);
                InterfaceC2455109jh interfaceC2455109jh = c683120Qqs.LIZ;
                if (interfaceC2455109jh instanceof C682950Qqb) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(((C682950Qqb) interfaceC2455109jh).LIZ);
                    c1331670kl3LJIIIZ.LJJ(smartImageView);
                    Drawable drawable = c683120Qqs.LJ;
                    if (drawable != null) {
                        c1331670kl3LJIIIZ.LJIL(drawable);
                    }
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                } else if (interfaceC2455109jh instanceof InterfaceC2454909jf) {
                    C948503nH.LJ(reusedUIAssem, C23271099x.INSTANCE, new C2454809je((InterfaceC2454909jf) interfaceC2455109jh, smartImageView, c683120Qqs, null));
                } else {
                    throw new C1954807lC();
                }
            } else if (interfaceC2455009jg instanceof C1884007Zm) {
                C661350Pwr.LIZJ((SmartImageView) awS288S0300000_10.l1);
                C661350Pwr.LJIIL((FrameLayout) awS288S0300000_10.l2);
                FrameLayout frameLayout = (FrameLayout) awS288S0300000_10.l2;
                reusedUIAssem.getClass();
                C661350Pwr.LJIIL(frameLayout);
                C786410Ut5.LJJJJIZL(frameLayout);
                frameLayout.addView((View) null, new ViewGroup.LayoutParams(-1, -1));
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dd  */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [X.0PRV] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r4v28, types: [T, X.19Fp] */
    /* JADX WARN: Type inference failed for: r4v31, types: [T, X.19Fp] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.0c6e, X.0rMx] */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$1(kotlin.jvm.internal.AwS288S0300000_10 r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS288S0300000_10.invoke$1(kotlin.jvm.internal.AwS288S0300000_10, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS288S0300000_10 awS288S0300000_10, Object obj, Object obj2) {
        String containerID;
        C683220Qr2 c683220Qr2 = (C683220Qr2) obj;
        FeedbackMultipleChoice feedbackMultipleChoice = (FeedbackMultipleChoice) obj2;
        C685680Qv0.LJ((View) awS288S0300000_10.l1, ((InterfaceC685700Qv2) awS288S0300000_10.l2).toJSON());
        C685680Qv0 c685680Qv0 = (C685680Qv0) awS288S0300000_10.l0;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = c685680Qv0.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        c685680Qv0.LJFF(C1529880puk.LIZIZ(containerID), c683220Qr2, feedbackMultipleChoice);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS288S0300000_10 awS288S0300000_10, Object obj, Object obj2) {
        String containerID;
        C683220Qr2 c683220Qr2 = (C683220Qr2) obj;
        FeedbackMultipleChoice feedbackMultipleChoice = (FeedbackMultipleChoice) obj2;
        C685670Quz.LJ((View) awS288S0300000_10.l1, new JSONObject(C786410Ut5.J3(((InterfaceC685740Qv6) awS288S0300000_10.l2).toJSON())));
        C685670Quz c685670Quz = (C685670Quz) awS288S0300000_10.l0;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = c685670Quz.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        c685670Quz.LJFF(C1529880puk.LIZIZ(containerID), c683220Qr2, feedbackMultipleChoice);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS288S0300000_10 awS288S0300000_10, Object obj, Object obj2) {
        DynamicPatch dynamicPatch = (DynamicPatch) ((C291001Au) obj2).LIZ;
        if (dynamicPatch != null) {
            C649290PdP c649290PdP = (C649290PdP) awS288S0300000_10.l0;
            SearchHubVM searchHubVM = (SearchHubVM) awS288S0300000_10.l1;
            SparkContext sparkContext = (SparkContext) awS288S0300000_10.l2;
            C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
            C641860PFo.LIZ.getClass();
            Map mapLIZ = C641860PFo.LIZ(searchHubVM, false);
            c647380PaK.getClass();
            c649290PdP.LIZLLL(C647380PaK.LIZLLL(dynamicPatch, mapLIZ, sparkContext));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS288S0300000_10 awS288S0300000_10, Object obj, Object obj2) {
        Fragment fragment;
        Object objLIZIZ;
        SearchResultParam searchResultParam = (SearchResultParam) obj;
        C650950Pg5 c650950Pg5 = (C650950Pg5) obj2;
        C664120Q3e c664120Q3e = (C664120Q3e) awS288S0300000_10.l0;
        c664120Q3e.LJIIIIZZ = searchResultParam;
        Bundle bundle = (Bundle) awS288S0300000_10.l1;
        searchResultParam.setHiddenTabNames(C13LQ.LJLIIL(new String[]{EnumC669620QOi.VIDEO.getTabName(), EnumC669620QOi.SHOP.getTabName(), EnumC669620QOi.LIVE.getTabName()}));
        Map<String, String> map = c664120Q3e.LJI;
        if (map != null) {
            C0P7X.LIZ(new C640140P8y(map), searchResultParam);
        }
        String string = bundle.getString("enter_method");
        if (string == null) {
            string = "";
        }
        C786410Ut5.LJJJI("search_from", string, bundle);
        C786410Ut5.LJJIZ(bundle, "searchParam", searchResultParam);
        C786410Ut5.LJJIZ(bundle, "search_enter_param", searchResultParam.getSearchEnterParam());
        C786410Ut5.LJJIZ(bundle, "search_context_source", c650950Pg5);
        C644060POa.LIZ.getClass();
        C644060POa.LJIIIZ(8, searchResultParam);
        C0Q6U c0q6u = C0Q6U.LIZ;
        C19EG c19eg = ((C664120Q3e) awS288S0300000_10.l0).LIZIZ;
        if (c19eg != null && (objLIZIZ = C651580Ph6.LIZIZ(c19eg)) != null) {
            fragment = (Fragment) objLIZIZ;
        } else {
            fragment = null;
        }
        c0q6u.getClass();
        C0Q6U.LIZ(c19eg, 4, searchResultParam, null, fragment);
        ((Function1) awS288S0300000_10.l2).invoke((Bundle) awS288S0300000_10.l1);
        ((C664120Q3e) awS288S0300000_10.l0).LJII = true;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS288S0300000_10 awS288S0300000_10, Object obj, Object obj2) {
        String wordSource;
        Integer numValueOf;
        String word;
        String str;
        String str2;
        String id;
        String str3;
        String str4;
        Integer numValueOf2;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        C0PCY<C0PRC> c0pcyPh12;
        C0PRC c0prc2;
        int iIndexOfChild = ((ViewGroup) awS288S0300000_10.l0).indexOfChild((View) awS288S0300000_10.l1);
        if (iIndexOfChild >= 0 && iIndexOfChild <= ((ArrayList) ((C0H46) awS288S0300000_10.l2).LLILLJJLI).size() - 1) {
            ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
            RelatedWord relatedWord = (RelatedWord) ListProtector.get(((C0H46) awS288S0300000_10.l2).LLILLJJLI, iIndexOfChild);
            C0HBA c0hba = ((C0H46) awS288S0300000_10.l2).LLILLL;
            C0PVO c0pvo = new C0PVO();
            Word word2 = relatedWord.wordRecord;
            Map<String, String> map = null;
            if (word2 != null) {
                wordSource = word2.getWordSource();
            } else {
                wordSource = null;
            }
            c0pvo.LJIIZILJ("words_source", wordSource);
            Word word3 = relatedWord.wordRecord;
            if (word3 != null) {
                numValueOf = Integer.valueOf(word3.getWordPosition());
            } else {
                numValueOf = null;
            }
            c0pvo.LJJJJL(numValueOf);
            Word word4 = relatedWord.wordRecord;
            if (word4 != null) {
                word = word4.getWord();
            } else {
                word = null;
            }
            c0pvo.LJIIZILJ("words_content", word);
            if (iSearchContextAbilityLJI != null && (c0pcyPh12 = iSearchContextAbilityLJI.Ph1()) != null && (c0prc2 = (C0PRC) c0pcyPh12.LIZJ()) != null) {
                str = c0prc2.LLIZLLLIL;
            } else {
                str = null;
            }
            c0pvo.LJIIZILJ("raw_query", str);
            if (c0hba != null) {
                str2 = c0hba.searchPosition;
            } else {
                str2 = null;
            }
            c0pvo.LJIIZILJ("search_position", str2);
            Word word5 = relatedWord.wordRecord;
            if (word5 != null) {
                id = word5.getId();
            } else {
                id = null;
            }
            c0pvo.LJIIZILJ("group_id", id);
            if (c0hba != null) {
                str3 = c0hba.imprId;
            } else {
                str3 = null;
            }
            c0pvo.LJIIZILJ("impr_id", str3);
            if (iSearchContextAbilityLJI != null && (c0pcyPh1 = iSearchContextAbilityLJI.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
                str4 = c0prc.LLILLL;
            } else {
                str4 = null;
            }
            c0pvo.LJIIZILJ("search_id", str4);
            if (c0hba != null) {
                numValueOf2 = Integer.valueOf(c0hba.groupPosition);
            } else {
                numValueOf2 = null;
            }
            c0pvo.LJJIL(numValueOf2);
            if (c0hba != null) {
                map = c0hba.extraParams;
            }
            c0pvo.LIZIZ(map);
            c0pvo.LJIILJJIL();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS288S0300000_10(C649290PdP c649290PdP, SearchHubVM searchHubVM, SparkContext sparkContext, int i) {
        super(2);
        this.$t = i;
        this.l0 = c649290PdP;
        this.l1 = searchHubVM;
        this.l2 = sparkContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS288S0300000_10(C664120Q3e c664120Q3e, C664120Q3e c664120Q3e2, Bundle bundle, Function1<? super Bundle, Unit> function1) {
        super(2);
        this.$t = function1;
        this.l0 = c664120Q3e;
        this.l1 = c664120Q3e2;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS288S0300000_10(C685670Quz c685670Quz, View view, InterfaceC685740Qv6 interfaceC685740Qv6, int i) {
        super(2);
        this.$t = i;
        this.l0 = c685670Quz;
        this.l1 = view;
        this.l2 = interfaceC685740Qv6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS288S0300000_10(C685680Qv0 c685680Qv0, View view, InterfaceC685700Qv2 interfaceC685700Qv2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c685680Qv0;
        this.l1 = view;
        this.l2 = interfaceC685700Qv2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS288S0300000_10(View view, SmartImageView smartImageView, FrameLayout frameLayout, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = smartImageView;
        this.l2 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS288S0300000_10(ViewGroup viewGroup, View view, C0H46 c0h46, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = view;
        this.l2 = c0h46;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS288S0300000_10(SearchTopBarAssem searchTopBarAssem, SearchTopBarAssem searchTopBarAssem2, ViewGroup viewGroup, C259800zU<LifecycleOwner> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = searchTopBarAssem;
        this.l1 = searchTopBarAssem2;
        this.l2 = viewGroup;
    }
}
