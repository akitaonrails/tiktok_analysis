package kotlin.jvm.internal;

import X.C09AY;
import X.C0NOH;
import X.C1233040iBy;
import X.C1390920mIc;
import X.C13LP;
import X.C1736960vIk;
import X.C1737900vKG;
import X.C1745300vWC;
import X.C1748730vbj;
import X.C19EG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C958103op;
import X.C960603pE;
import X.EnumC1736950vIj;
import X.EnumC1737230vJB;
import X.EnumC1737480vJa;
import X.InterfaceC1631620sYq;
import X.InterfaceC1737050vIt;
import X.InterfaceC1737080vIw;
import X.InterfaceC1748810vbr;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.EffectImgCreator$Input;
import com.ss.android.ugc.aweme.EffectImgCreator$Output;
import com.ss.android.ugc.aweme.data.EffectImgPageConfig;
import com.ss.android.ugc.aweme.data.IconSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandiHeader;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.ZipCodePickerDialogFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditIconV2Assem;
import com.ss.android.ugc.aweme.publish.detail.categoryicon.EffectPublishCategoryIconAssem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class AwS320S0300000_26 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS320S0300000_26(FragmentManager fragmentManager, C1745300vWC c1745300vWC, AddressEditViewModel addressEditViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = fragmentManager;
        this.l1 = c1745300vWC;
        this.l2 = addressEditViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS320S0300000_26 r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS320S0300000_26.invoke$0(kotlin.jvm.internal.AwS320S0300000_26, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS320S0300000_26 awS320S0300000_26, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Number) obj3).longValue();
        if (iIntValue != 2) {
            if (iIntValue == 3) {
                ((TemplateListViewModel) awS320S0300000_26.l0).AQ2((Context) awS320S0300000_26.l1, (TemplateItem) awS320S0300000_26.l2, 3);
                C0NOH c0noh = ((TemplateListViewModel) awS320S0300000_26.l0).LLIZ;
                if (c0noh != null) {
                    c0noh.LIZJ();
                }
                ((TemplateListViewModel) awS320S0300000_26.l0).LLIZ = null;
            }
        } else {
            ((TemplateListViewModel) awS320S0300000_26.l0).AQ2((Context) awS320S0300000_26.l1, (TemplateItem) awS320S0300000_26.l2, 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS320S0300000_26 awS320S0300000_26, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Number) obj3).longValue();
        if (iIntValue != 2) {
            if (iIntValue == 3) {
                ((TemplateListViewModel) awS320S0300000_26.l0).AQ2((Context) awS320S0300000_26.l1, (TemplateItem) awS320S0300000_26.l2, 3);
                C0NOH c0noh = ((TemplateListViewModel) awS320S0300000_26.l0).LLIZLLLIL;
                if (c0noh != null) {
                    c0noh.LIZJ();
                }
                ((TemplateListViewModel) awS320S0300000_26.l0).LLIZLLLIL = null;
            }
        } else {
            ((TemplateListViewModel) awS320S0300000_26.l0).AQ2((Context) awS320S0300000_26.l1, (TemplateItem) awS320S0300000_26.l2, 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS320S0300000_26 awS320S0300000_26, Object obj, Object obj2, Object obj3) {
        EnumC1737230vJB enumC1737230vJBLIZ;
        if (((Boolean) obj).booleanValue()) {
            final EffectPublishCategoryIconAssem effectPublishCategoryIconAssem = (EffectPublishCategoryIconAssem) awS320S0300000_26.l0;
            final EnumC1736950vIj enumC1736950vIj = (EnumC1736950vIj) awS320S0300000_26.l1;
            effectPublishCategoryIconAssem.getClass();
            C19EG c19egLIZ = C724240Sb0.LIZ(effectPublishCategoryIconAssem);
            if (c19egLIZ != null) {
                Map<String, String> map = C1737900vKG.LJI(effectPublishCategoryIconAssem.kp(), enumC1736950vIj, EnumC1737480vJa.PUBLISH.getTag()).LIZ;
                if (!effectPublishCategoryIconAssem.mp()) {
                    EnumC1736950vIj.Companion.getClass();
                    enumC1737230vJBLIZ = C1736960vIk.LIZ(enumC1736950vIj);
                } else {
                    enumC1737230vJBLIZ = EnumC1737230vJB.ICON_EDIT;
                }
                EffectImgCreator$Input effectImgCreator$Input = new EffectImgCreator$Input(map, new EffectImgPageConfig(enumC1737230vJBLIZ, false, 0, false, null, 126));
                InterfaceC1737050vIt interfaceC1737050vIt = new InterfaceC1737050vIt() { // from class: X.0vIo
                    @Override // X.InterfaceC1737050vIt
                    public final void LIZ(EffectImgCreator$Output effectImgCreator$Output) {
                        Context context;
                        String str;
                        EnumC1737340vJM enumC1737340vJM;
                        String str2 = effectImgCreator$Output.effectIconPath;
                        if (str2 != null && str2.length() != 0) {
                            EffectPublishCategoryIconAssem effectPublishCategoryIconAssem2 = effectPublishCategoryIconAssem;
                            EnumC1736950vIj enumC1736950vIj2 = enumC1736950vIj;
                            effectPublishCategoryIconAssem2.getClass();
                            if (effectImgCreator$Output.resultCode == -1) {
                                String str3 = effectImgCreator$Output.effectIconId;
                                boolean z = effectImgCreator$Output.applyEffectChecked;
                                IconSelectData iconSelectData = effectImgCreator$Output.originIconData;
                                if (iconSelectData != null) {
                                    enumC1737340vJM = iconSelectData.selectType;
                                } else {
                                    enumC1737340vJM = null;
                                }
                                effectPublishCategoryIconAssem2.lp().IQ2(effectImgCreator$Output.effectIconUri, new EditImageEffectImgCreatorData(str3, z, enumC1737340vJM, enumC1736950vIj2, false, EnumC1736080vHK.EDIT_EFFECT_IMG_CREATOR.getValue()));
                            }
                            EffectPublishCategoryIconAssem effectPublishCategoryIconAssem3 = effectPublishCategoryIconAssem;
                            EnumC1736950vIj enumC1736950vIj3 = enumC1736950vIj;
                            if (!effectPublishCategoryIconAssem3.mp() && (context = effectPublishCategoryIconAssem3.getContext()) != null) {
                                IconSelectData iconSelectData2 = effectImgCreator$Output.originIconData;
                                if (iconSelectData2 == null || (str = iconSelectData2.iconScenes) == null) {
                                    str = "";
                                }
                                if (!Intrinsics.LJFF(str, EnumC1153780g88.EFFECT_ICON_FEMALE.getTypeVal()) && !Intrinsics.LJFF(str, EnumC1153780g88.EFFECT_ICON_MALE.getTypeVal())) {
                                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(effectPublishCategoryIconAssem3), null, null, new C0HZX(context, effectPublishCategoryIconAssem3, effectImgCreator$Output, enumC1736950vIj3, null), 3);
                                }
                            }
                        }
                    }
                };
                InterfaceC1737080vIw interfaceC1737080vIw = (InterfaceC1737080vIw) effectPublishCategoryIconAssem.LLJJIJI.getValue();
                if (interfaceC1737080vIw != null) {
                    interfaceC1737080vIw.LIZJ(c19egLIZ, effectImgCreator$Input, interfaceC1737050vIt);
                }
            }
        } else {
            C1233040iBy c1233040iBy = new C1233040iBy((C19EG) awS320S0300000_26.l2);
            c1233040iBy.LIZJ(((C19EG) awS320S0300000_26.l2).getString(2131839204));
            c1233040iBy.LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS320S0300000_26 awS320S0300000_26, Object obj, Object obj2, Object obj3) {
        String str;
        List<ViewItem> list;
        ViewItem viewItem;
        String str2;
        CandInputDataOptions candInputDataOptions = (CandInputDataOptions) obj;
        ((Boolean) obj2).booleanValue();
        if (candInputDataOptions != null) {
            CandiHeader candiHeader = candInputDataOptions.candHeader;
            if (candiHeader == null || (str = candiHeader.text) == null) {
                str = "";
            }
            ArrayList arrayList = new ArrayList();
            List<CandInputData> list2 = candInputDataOptions.candInputOptions;
            if (list2 != null) {
                for (CandInputData candInputData : list2) {
                    Integer num = candInputData.type;
                    if (num != null && num.intValue() == 3 && (list = candInputData.viewItems) != null && (viewItem = (ViewItem) C13LP.LJJJLZIJ(0, list)) != null && (str2 = viewItem.text) != null) {
                        arrayList.add(str2);
                    }
                }
            }
            if (arrayList.size() > 1) {
                FragmentManager fragmentManager = (FragmentManager) awS320S0300000_26.l0;
                InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ((View) awS320S0300000_26.l1);
                if (fragmentManager != null) {
                    ZipCodePickerDialogFragment zipCodePickerDialogFragment = new ZipCodePickerDialogFragment();
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJIL(bundle, "zipcode", arrayList);
                    C786410Ut5.LJJJI("title", str, bundle);
                    if (interfaceC1748810vbrLIZ != null) {
                        C960603pE.LJI(bundle, interfaceC1748810vbrLIZ, null);
                    }
                    zipCodePickerDialogFragment.setArguments(bundle);
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    c1390920mIc.LJIIIIZZ(1);
                    int iLIZIZ = (int) C958103op.LIZIZ();
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJL = iLIZIZ;
                    tuxSheet.LLJJIJI = zipCodePickerDialogFragment;
                    tuxSheet.LLJLILLLLZIIL = false;
                    tuxSheet.show(fragmentManager, "ZipCodePickerDialogFragment");
                    zipCodePickerDialogFragment.LLILZLL = tuxSheet;
                }
            } else {
                Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, arrayList);
                if (objLJJJLZIJ != null) {
                    ((AddressEditViewModel) awS320S0300000_26.l2).uS2(objLJJJLZIJ, "zipcode");
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS320S0300000_26(TemplateListViewModel templateListViewModel, Context context, TemplateItem templateItem, int i) {
        super(3);
        this.$t = i;
        this.l0 = templateListViewModel;
        this.l1 = context;
        this.l2 = templateItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS320S0300000_26(EffectEditIconV2Assem effectEditIconV2Assem, EnumC1736950vIj enumC1736950vIj, C19EG c19eg, int i) {
        super(3);
        this.$t = i;
        this.l0 = effectEditIconV2Assem;
        this.l1 = enumC1736950vIj;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS320S0300000_26(EffectPublishCategoryIconAssem effectPublishCategoryIconAssem, EnumC1736950vIj enumC1736950vIj, C19EG c19eg, int i) {
        super(3);
        this.$t = i;
        this.l0 = effectPublishCategoryIconAssem;
        this.l1 = enumC1736950vIj;
        this.l2 = c19eg;
    }
}
