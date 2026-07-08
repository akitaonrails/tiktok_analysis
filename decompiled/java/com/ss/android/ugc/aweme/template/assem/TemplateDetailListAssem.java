package com.ss.android.ugc.aweme.template.assem;

import X.C013C;
import X.C019F;
import X.C128Y;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EH;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737030Svd;
import X.C786410Ut5;
import X.InterfaceC1400710mYP;
import X.InterfaceC1401270mZJ;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageScrollAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailListModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplateStructModel;
import com.ss.android.ugc.aweme.template.view.TemplateDetailAwemeListFragment;
import com.ss.android.ugc.aweme.template.viewmodel.TemplateDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class TemplateDetailListAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public TemplateDetailAwemeListFragment LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TemplateDetailListAssem.class, "templateDetailVM", "getTemplateDetailVM()Lcom/ss/android/ugc/aweme/template/viewmodel/TemplateDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TemplateDetailListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TemplateDetailViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1491), AFwS240S0000000_9.get$arr$(619), null, true);
        System.currentTimeMillis();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    /* JADX INFO: renamed from: do */
    public final void mo127do() {
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void hp() {
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(R.id.ms4);
        Zo(frameLayout);
        super.xo();
    }

    public final void lp(TemplateDetailModel templateDetailModel) {
        Serializable serializable;
        TemplateAnchorConfig templateAnchorConfig;
        final String templateId;
        long jLongValue;
        C19EH c19ehLJIIJ;
        Long publishCount;
        TemplateDetailAwemeListFragment templateDetailAwemeListFragment;
        Fragment fragmentLJI;
        FragmentManager fragmentManager;
        C19EH c19ehLJIIJ2;
        String templateId2;
        InterfaceC1401270mZJ interfaceC1401270mZJ = null;
        if (this.LLJJIII != null) {
            TemplateStructModel templateInfo = templateDetailModel.getTemplateInfo();
            if ((templateInfo == null || (templateId2 = templateInfo.getTemplateId()) == null || templateId2.length() == 0) && (templateDetailAwemeListFragment = this.LLJJIII) != null && templateDetailAwemeListFragment.isVisible() && (fragmentLJI = C724240Sb0.LJI(this)) != null && (fragmentManager = fragmentLJI.getFragmentManager()) != null && (c19ehLJIIJ2 = fragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ2.LJIILL(templateDetailAwemeListFragment);
                c19ehLJIIJ2.LJIIIZ();
                return;
            }
            return;
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 == null) {
            return;
        }
        Bundle arguments = fragmentLJI2.getArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            if (arguments == null || (templateAnchorConfig = (TemplateAnchorConfig) arguments.getSerializable("template_anchor_config", TemplateAnchorConfig.class)) == null) {
                return;
            }
        } else {
            if (arguments != null) {
                serializable = arguments.getSerializable("template_anchor_config");
            } else {
                serializable = null;
            }
            if (serializable instanceof TemplateAnchorConfig) {
                templateAnchorConfig = (TemplateAnchorConfig) serializable;
            } else {
                templateAnchorConfig = null;
            }
            if (arguments != null) {
            }
            if (templateAnchorConfig == null && (templateId = templateAnchorConfig.getTemplateId()) != null && templateId.length() != 0) {
                final int templateType = templateAnchorConfig.getTemplateType();
                TemplateStructModel templateInfo2 = templateDetailModel.getTemplateInfo();
                if (templateInfo2 != null && (publishCount = templateInfo2.getPublishCount()) != null) {
                    jLongValue = publishCount.longValue();
                } else {
                    jLongValue = 0;
                }
                String awemeId = templateAnchorConfig.getAwemeId();
                InterfaceC1400710mYP interfaceC1400710mYP = new InterfaceC1400710mYP(templateId, templateType) { // from class: X.0OkV
                    public static final int $stable = 0;
                    public final String LL;
                    public final int LLILLJJLI;

                    @Override // X.InterfaceC1400710mYP
                    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i) {
                        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i);
                    }

                    @Override // X.InterfaceC1400710mYP
                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                        return C635990Ox3.LIZJ(this, i, c19eg, interfaceC214902198i);
                    }

                    @Override // X.InterfaceC1400710mYP
                    public /* bridge */ /* synthetic */ void interceptSmartRoute(View view, int i, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
                        C635990Ox3.LIZLLL(this, view, i, smartRoute, aweme, c1398410mUh);
                    }

                    @Override // X.InterfaceC1400710mYP
                    public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
                        return C635990Ox3.LJ(this, viewHolder);
                    }

                    @Override // X.InterfaceC1400710mYP
                    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
                        C635990Ox3.LJFF(this, str);
                    }

                    {
                        this.LL = templateId;
                        this.LLILLJJLI = templateType;
                    }

                    @Override // X.InterfaceC1400710mYP
                    public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
                        c1398410mUh.LIZ = "from_template_detail_activity";
                        c1398410mUh.LIZJ = "template_page";
                        return c1398410mUh;
                    }

                    @Override // X.InterfaceC1400710mYP
                    public C1255920ims<? extends AbstractC1255880imo<?, ?>> getPresenter(int i, C19EG c19eg) {
                        Fragment fragment;
                        FragmentManager supportFragmentManager;
                        List<Fragment> listLJJLIIIJL;
                        Fragment next;
                        if (C0C0F.LIZ()) {
                            TemplateDetailAwemeListFragment templateDetailAwemeListFragment2 = null;
                            if (c19eg != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
                                Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (next instanceof TemplateDetailAwemeListFragment) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                fragment = next;
                            } else {
                                fragment = null;
                            }
                            if (fragment instanceof TemplateDetailAwemeListFragment) {
                                templateDetailAwemeListFragment2 = (TemplateDetailAwemeListFragment) fragment;
                            }
                            return new C1255920ims<C628180OkS>(templateDetailAwemeListFragment2) { // from class: X.0OkU
                                public final TemplateDetailAwemeListFragment LLILZIL;

                                @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
                                public final void onSuccess() {
                                    T t;
                                    TemplateDetailListModel templateDetailListModel;
                                    if (this.LL == 0 || this.LLILLJJLI == 0) {
                                        return;
                                    }
                                    if (C0C0F.LIZ() && (t = this.LL) != 0) {
                                        C628180OkS c628180OkS = (C628180OkS) t;
                                        if (C0C0F.LIZ() && c628180OkS.LLILLL && (templateDetailListModel = c628180OkS.LLILZ) != null && !templateDetailListModel.isLazyLoading) {
                                            TemplateDetailListModel templateDetailListModel2 = (TemplateDetailListModel) this.LL.getData();
                                            TemplateDetailAwemeListFragment templateDetailAwemeListFragment3 = this.LLILZIL;
                                            if (templateDetailAwemeListFragment3 != null) {
                                                templateDetailAwemeListFragment3.wS(templateDetailListModel2);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    super.onSuccess();
                                }

                                {
                                    this.LLILZIL = templateDetailAwemeListFragment2;
                                    LJIIJ(new C628180OkS());
                                }

                                @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
                                public final void onFailed(Exception exc) {
                                    TemplateDetailAwemeListFragment templateDetailAwemeListFragment3;
                                    if (C0C0F.LIZ() && (templateDetailAwemeListFragment3 = this.LLILZIL) != null) {
                                        templateDetailAwemeListFragment3.LLLJ = true;
                                        templateDetailAwemeListFragment3.LLLJL = true;
                                        if (!templateDetailAwemeListFragment3.LLLJIL.isEmpty()) {
                                            templateDetailAwemeListFragment3.yS(false);
                                            return;
                                        }
                                    }
                                    super.onFailed(exc);
                                }
                            };
                        }
                        C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims = new C1255920ims<>();
                        c1255920ims.LJIIJ(new C628180OkS());
                        return c1255920ims;
                    }

                    @Override // X.InterfaceC1400710mYP
                    public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i) {
                        if (c1255920ims != null) {
                            c1255920ims.LIZJ(Integer.valueOf(i), this.LL, 51, Integer.valueOf(this.LLILLJJLI));
                        }
                        return true;
                    }

                    @Override // X.InterfaceC1400710mYP
                    public C1398630mV3 onCreateDetailAwemeViewHolder(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
                        return new C1398630mV3(view, str, interfaceC1260110itd) { // from class: X.0Ohq
                            @Override // X.C1398630mV3
                            public final void b6(Aweme aweme, int i, boolean z, Bundle bundle) {
                                super.b6(aweme, i, z, bundle);
                                if (aweme != null && AwemeBizExtKt.isTemplateDetailPinedTop(aweme) && AwemeBizExtKt.isTemplateOriginalAweme(aweme)) {
                                    this.LLJILJILJ.setText(2131839042);
                                    C786410Ut5.LLLLZLL(this.LLJILJILJ, 0);
                                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, this.LLIZ);
                                    if (numLIZJ != null) {
                                        this.LLJILJILJ.setTextColor(numLIZJ.intValue());
                                    }
                                    this.LLJILJILJ.setBackgroundResource(R.drawable.bh1);
                                }
                            }
                        };
                    }
                };
                String templateId3 = templateAnchorConfig.getTemplateId();
                TemplateDetailAwemeListFragment templateDetailAwemeListFragment2 = new TemplateDetailAwemeListFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("detail_aweme_list_type", 51);
                C786410Ut5.LJJJI("event_label", "template_page", bundle);
                C786410Ut5.LJJJI("detail_id", templateId3, bundle);
                C786410Ut5.LJJJI("detail_aweme_from", "template_anchor", bundle);
                C786410Ut5.LJJJI("detail_aweme_from_aid", awemeId, bundle);
                C786410Ut5.LJJJI("detail_aweme_previous_page_position", null, bundle);
                C786410Ut5.LJJJI("shoot_enter_from", "template_detail", bundle);
                templateDetailAwemeListFragment2.LLLILZLLLI = templateAnchorConfig;
                templateDetailAwemeListFragment2.LLLIZZ = jLongValue;
                templateDetailAwemeListFragment2.setArguments(bundle);
                templateDetailAwemeListFragment2.LLLILZJ = interfaceC1400710mYP;
                this.LLJJIII = templateDetailAwemeListFragment2;
                FragmentManager fragmentManager2 = fragmentLJI2.getFragmentManager();
                if (fragmentManager2 != null && (c19ehLJIIJ = fragmentManager2.LJIIJ()) != null) {
                    c19ehLJIIJ.LJIJ(R.id.ms4, templateDetailAwemeListFragment2, null);
                    c19ehLJIIJ.LJIIJ();
                }
                templateDetailAwemeListFragment2.LLLFFI = true;
                C128Y c128yLJI = C724240Sb0.LJI(this);
                if (c128yLJI instanceof InterfaceC1401270mZJ) {
                    interfaceC1401270mZJ = (InterfaceC1401270mZJ) c128yLJI;
                }
                templateDetailAwemeListFragment2.LLLIILIL = interfaceC1401270mZJ;
                templateDetailAwemeListFragment2.cb(false, false);
                templateDetailAwemeListFragment2.Bp();
                return;
            }
            return;
        }
        arguments.getLong("startTime", System.currentTimeMillis());
        if (templateAnchorConfig == null) {
        }
    }

    @C14EU
    public final void onReceiveVideoEvent(C737030Svd c737030Svd) {
        Fragment fragmentLJI;
        PageScrollAbility pageScrollAbility;
        if (c737030Svd.LIZ == 21 && Intrinsics.LJFF(c737030Svd.LJ, "template_page") && (fragmentLJI = C724240Sb0.LJI(this)) != null && (pageScrollAbility = (PageScrollAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), PageScrollAbility.class, null)) != null) {
            pageScrollAbility.QW0(5000);
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        if (getContext() == null) {
            return;
        }
        C013C c013c = new C013C();
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        TemplateDetailModel templateDetailModel = ((TemplateDetailViewModel) assemVMLazy.getValue()).LLILZ;
        if (templateDetailModel != null) {
            lp(templateDetailModel);
        } else {
            AssemViewModel.asyncSubscribe$default(this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0OkX
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C628160OkQ) obj).LL;
                }
            }, null, null, null, new AwS375S0200000_9(c013c, this, 99), 14, null);
        }
    }
}
