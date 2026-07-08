package com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.banner;

import X.C019F;
import X.C0JBO;
import X.C0QSJ;
import X.C1134410fct;
import X.C1143680frq;
import X.C1143850fs7;
import X.C1146990fxB;
import X.C127G;
import X.C1301050jxf;
import X.C13LE;
import X.C1546210qL5;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20441214yg;
import X.C21538419Qw;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C371620Ehc;
import X.C500260Jjc;
import X.C687700QyG;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS392S0100000_17;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.RechargeConsumptionMetaData;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS588S0100000_9;
import webcast.data.TPActivityArea;
import webcast.data.TPActivityDetail;
import webcast.data.TPTaskProgressItem;
import webcast.data.TPText;
import webcast.data.TouchPointBackground;
import webcast.data.TouchPointColor;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskProgressBannerAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final C1146990fxB LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public volatile TouchPointAbility LLJ;
    public C127G LLJI;
    public InterfaceC665370Q7z LLJIJIL;
    public C0QSJ LLJILJIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0fxB] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TaskProgressBannerAssem.class, "progressVM", "getProgressVM()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/rechargeconsumption/banner/TaskProgressViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(TaskProgressBannerAssem.class, "touchPointAbility", "getTouchPointAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/TouchPointAbility;", 0)};
        LLJILJILJ = new Object() { // from class: X.0fxB
        };
        LLJJ = R.id.da6;
    }

    public TaskProgressBannerAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TaskProgressViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS561S0100000_17(c19719912DlLIZ, 200), AFwS254S0000000_17.get$arr$(77), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CampaignPanelScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CampaignPanelScope.class);
        return arrayList;
    }

    public final TouchPointAbility Go() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJILJIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJIJIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJIJIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CampaignPanelScope.class});
            this.LLJILJIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        return (TouchPointAbility) c0qsjLIZLLL.getAbility(TouchPointAbility.class);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{TaskProgressViewModel.class, new AObjectS392S0100000_17(this, 43)}, defaultViewModelProviderFactory);
                    this.LLJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TPActivityDetail tPActivityDetail;
        int i;
        TaskInfo taskInfo;
        SpannableStringBuilder spannableStringBuilderLIZLLL;
        SpannableStringBuilder spannableStringBuilderLIZLLL2;
        SpannableStringBuilder spannableStringBuilderLIZLLL3;
        RechargeConsumptionMetaData rechargeConsumptionMetaData;
        TPActivityArea tPActivityArea;
        TouchPointColor touchPointColor;
        String str;
        Drawable drawableLIZJ;
        super.onViewCreated(view);
        TouchPointAbility touchPointAbilityGo = this.LLJ;
        if (touchPointAbilityGo == null) {
            synchronized (this) {
                touchPointAbilityGo = this.LLJ;
                if (touchPointAbilityGo == null) {
                    touchPointAbilityGo = Go();
                    this.LLJ = touchPointAbilityGo;
                }
            }
        }
        SpannableStringBuilder spannableStringBuilderLIZLLL4 = null;
        if (touchPointAbilityGo != null && (rechargeConsumptionMetaData = (RechargeConsumptionMetaData) touchPointAbilityGo.nH0()) != null && (tPActivityArea = rechargeConsumptionMetaData.activityArea) != null) {
            tPActivityDetail = tPActivityArea.activityDetail;
            if (tPActivityDetail != null) {
                C21538419Qw c21538419Qw = (C21538419Qw) view.findViewById(R.id.da7);
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                Integer numValueOf = Integer.valueOf(tPActivityDetail.borderRadius);
                c1546210qL5.getClass();
                c21538419Qw.setRadius(C1546210qL5.LIZ(numValueOf));
                TouchPointBackground touchPointBackground = tPActivityDetail.background;
                if (touchPointBackground != null && (touchPointColor = touchPointBackground.color) != null && (str = touchPointColor.light) != null && (drawableLIZJ = C371620Ehc.LIZJ(str)) != null) {
                    c21538419Qw.setBackground(drawableLIZJ);
                }
            }
        } else {
            tPActivityDetail = null;
        }
        if (tPActivityDetail != null && tPActivityDetail.taskProgress.size() == 1) {
            Iterator<TPTaskProgressItem> it2 = tPActivityDetail.taskProgress.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TPTaskProgressItem next = it2.next();
                TPTaskProgressItem tPTaskProgressItem = next;
                if (tPTaskProgressItem.taskProgressBar.size() == 3 && tPTaskProgressItem.taskProgressBlocks.size() == 2) {
                    if (next != null) {
                        View viewFindViewById = view.findViewById(R.id.da9);
                        if (viewFindViewById != null) {
                            C500260Jjc.LLFFF(viewFindViewById);
                            try {
                                C0JBO.LIZ((ImageView) view.findViewById(R.id.tj8), tPActivityDetail.rewardImage);
                                TPTaskProgressItem tPTaskProgressItem2 = tPActivityDetail.taskProgress.get(0);
                                C0JBO.LIZ((ImageView) view.findViewById(R.id.s9r), tPTaskProgressItem2.taskProgressBar.get(0));
                                C0JBO.LIZ((ImageView) view.findViewById(R.id.s9s), tPTaskProgressItem2.taskProgressBar.get(2));
                                C0JBO.LIZ((ImageView) view.findViewById(R.id.s8q), tPTaskProgressItem2.taskProgressBar.get(1));
                                List<TPTaskProgressItem.TPTaskProgressBlock> list = tPTaskProgressItem2.taskProgressBlocks;
                                TextView textView = (TextView) view.findViewById(R.id.xes);
                                TPText tPText = list.get(0).title;
                                if (tPText != null) {
                                    spannableStringBuilderLIZLLL = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText);
                                } else {
                                    spannableStringBuilderLIZLLL = null;
                                }
                                textView.setText(spannableStringBuilderLIZLLL);
                                TextView textView2 = (TextView) view.findViewById(R.id.xer);
                                TPText tPText2 = list.get(0).subTitle;
                                if (tPText2 != null) {
                                    spannableStringBuilderLIZLLL2 = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText2);
                                } else {
                                    spannableStringBuilderLIZLLL2 = null;
                                }
                                textView2.setText(spannableStringBuilderLIZLLL2);
                                TextView textView3 = (TextView) view.findViewById(R.id.xeu);
                                TPText tPText3 = list.get(1).title;
                                if (tPText3 != null) {
                                    spannableStringBuilderLIZLLL3 = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText3);
                                } else {
                                    spannableStringBuilderLIZLLL3 = null;
                                }
                                textView3.setText(spannableStringBuilderLIZLLL3);
                                TextView textView4 = (TextView) view.findViewById(R.id.xet);
                                TPText tPText4 = list.get(1).subTitle;
                                if (tPText4 != null) {
                                    spannableStringBuilderLIZLLL4 = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText4);
                                }
                                textView4.setText(spannableStringBuilderLIZLLL4);
                                return;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C20441214yg.LJI("TaskProgressBannerAssem", e);
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        }
        View viewFindViewById2 = view.findViewById(R.id.da8);
        if (viewFindViewById2 != null) {
            C500260Jjc.LLFFF(viewFindViewById2);
            C1143680frq.LIZLLL(view.findViewById(R.id.d_w), "tiktok_live_revenue_demand_5", "live_task_page_rose.png");
            TextView textView5 = (TextView) view.findViewById(R.id.d_v);
            if (textView5 != null) {
                textView5.setTypeface(C1301050jxf.LIZ().LIZ("font/TikTok-Display-Bold.otf"));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((char) 215);
                AssemVMLazy assemVMLazy = this.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
                assemVMLazy.getValue();
                C1134410fct c1134410fctLJI = TaskManagerV2.LIZ.LJI(106);
                if (c1134410fctLJI != null && (taskInfo = (TaskInfo) c1134410fctLJI.LIZ) != null) {
                    i = (int) taskInfo.rewardAmount;
                } else {
                    i = 0;
                }
                sbLIZ.append(i);
                textView5.setText(C2188811AlT.LIZIZ(sbLIZ));
                textView5.setTextColor(-1);
                textView5.setTextAlignment(4);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.xf3);
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TaskProgressBinder.class);
                viewOnAttachStateChangeListenerC20604515jv.setOrientation(1);
                viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
                AssemVMLazy assemVMLazy2 = this.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJILLL;
                AssemViewModel.asyncSubscribe$default(assemVMLazy2.getValue(), new C2217381BqS() { // from class: X.0O2N
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C0O2M) obj).LL;
                    }
                }, this, null, null, null, new AwS588S0100000_9(viewOnAttachStateChangeListenerC20604515jv, 674), 28, null);
            }
            AssemVMLazy assemVMLazy3 = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LLJILLL;
            ((TaskProgressViewModel) assemVMLazy3.getValue()).wQ2();
        }
    }
}
