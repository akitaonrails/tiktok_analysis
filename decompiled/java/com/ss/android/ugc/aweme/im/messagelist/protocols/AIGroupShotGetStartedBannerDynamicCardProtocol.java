package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C01GW;
import X.C1227904rF;
import X.C276600Ask;
import X.C418440Gaw;
import X.C452501pT;
import X.C462600ICc;
import X.C462620ICe;
import X.C462630ICf;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C899500ZQm;
import X.C900040ZSo;
import X.C900140ZSy;
import X.C902730ZbD;
import X.InterfaceC1891350zJl;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotBannerFakeMsgContent;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotGetStartedBannerDynamicCardProtocol implements IMMessageListProtocol<C900040ZSo> {
    public final Fragment LL;
    public final C898790ZNt LLILLJJLI = new C898790ZNt(new int[]{4048});
    public final Class<? extends PowerCell<C900040ZSo>> LLILLL = AIGroupCardGetStartedBannerCell.class;
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.AI_GROUP_SHOT_GET_STARTED_PROTOCOL;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 517));
    public final boolean LLILZLL = C276600Ask.LIZ();

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C900040ZSo> getPowerItemClazz() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return list;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C900040ZSo> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C900040ZSo>> getWithCell() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return this.LLILZLL;
    }

    public AIGroupShotGetStartedBannerDynamicCardProtocol(Fragment fragment) {
        this.LL = fragment;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        C900140ZSy c900140ZSy;
        c869590Y9l.setScene("im_group_shot_dynamic_popup");
        Object localCache = c869590Y9l.getLocalCache(501);
        if (!(localCache instanceof C900140ZSy) || (c900140ZSy = (C900140ZSy) localCache) == null) {
            String content = c869590Y9l.getContent();
            if (content != null && content.length() != 0) {
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    String content2 = c869590Y9l.getContent();
                    c1227904rF.getClass();
                    AIGroupShotBannerFakeMsgContent aIGroupShotBannerFakeMsgContent = (AIGroupShotBannerFakeMsgContent) C1227904rF.LIZIZ(content2, AIGroupShotBannerFakeMsgContent.class);
                    c900140ZSy = new C900140ZSy(aIGroupShotBannerFakeMsgContent.effectId, new DynamicCardTemplate(new DynamicInfoComponent("mint_top_image_bottom_text", "aweme://lynxview?channel=tiktok_im_message_template_lynx&bundle=templates%2Fcommon%2Ftemplate.js&surl=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2F10%2Fgecko%2Fresource%2Ftiktok_im_message_template_lynx%2Ftemplates%2Fcommon%2Ftemplate.js&gecko_url_redirection=1&use_forest=1&bdhm_bid=tiktok_dm_lynx&use_spark=1&spark_page=template_dynamic_card", "common", aIGroupShotBannerFakeMsgContent.rawServerData, "mint", "7264476566450356890", 220, 170, DynamicUiLocationType.MESSAGE_CENTER, 1536)));
                    c869590Y9l.putLocalCache(501, c900140ZSy);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            } else {
                return null;
            }
        }
        return new C900040ZSo(c900140ZSy.LIZ, c900140ZSy.LIZIZ, ((SkeletonLayoutAssemblerBridge) this.LLILZIL.getValue()).mN2(list, C899500ZQm.LIZ).LIZ(list, c869590Y9l, i), new C462620ICe(new C462630ICf(C418440Gaw.LIZIZ(20), C418440Gaw.LIZIZ(20), C418440Gaw.LIZIZ(20), C418440Gaw.LIZIZ(20)), new C462600ICc()));
    }
}
