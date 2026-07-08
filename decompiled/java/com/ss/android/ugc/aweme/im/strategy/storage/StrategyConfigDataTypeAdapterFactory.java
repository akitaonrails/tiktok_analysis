package com.ss.android.ugc.aweme.im.strategy.storage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.im.strategy.StrategyConfigData;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.AIMojiStickerConfig;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarButtonStrategyConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarStrategyConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarStrategyTransferConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarTransferConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatComponentConfig;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.DisplayNameLang;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerConfigResolvingResult;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerScoreUpdatingResult;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakGeckoLoadStrategy;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelData;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelResConfig;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakMilestoneConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakResData;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionGiphyMessage;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionStickerSetMessage;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionTextMessage;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionNode;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionTree;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.AIMojiStickerConfigTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.ActionBarButtonStrategyConfTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.ActionBarStrategyConfTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.ActionBarStrategyTransferConfTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.ActionBarTransferConfTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.ChatComponentConfigTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.ChatFeatureListConfTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.DecisionNodeTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.DecisionTreeTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.DisplayNameLangTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.LightInteractionCommonResourceTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.LightInteractionEntryConfTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.LightInteractionGiphyMessageTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.LightInteractionStickerSetMessageTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.LightInteractionTextMessageTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.PreshownStickerConfigResolvingResultTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.PreshownStickerItemTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.PreshownStickerSceneConfigTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.PreshownStickerScoreUpdatingResultTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.StrategyConfigDataTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.StreakGeckoLoadStrategyTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.StreakLevelDataTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.StreakLevelResConfigTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.StreakMilestoneConfTypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.storage.adapters.StreakResDataTypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class StrategyConfigDataTypeAdapterFactory implements v {
    public static final StrategyConfigDataTypeAdapterFactory LL = new StrategyConfigDataTypeAdapterFactory();

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (Intrinsics.LJFF(rawType, StrategyConfigData.class)) {
            return new StrategyConfigDataTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, DecisionTree.class)) {
            return new DecisionTreeTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, DecisionNode.class)) {
            return new DecisionNodeTypeAdapter();
        }
        if (Intrinsics.LJFF(rawType, LightInteractionEntryConf.class)) {
            return new LightInteractionEntryConfTypeAdapter();
        }
        if (Intrinsics.LJFF(rawType, StreakMilestoneConf.class)) {
            return new StreakMilestoneConfTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, StreakResData.class)) {
            return new StreakResDataTypeAdapter();
        }
        if (Intrinsics.LJFF(rawType, StreakLevelResConfig.class)) {
            return new StreakLevelResConfigTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, StreakLevelData.class)) {
            return new StreakLevelDataTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, StreakGeckoLoadStrategy.class)) {
            return new StreakGeckoLoadStrategyTypeAdapter();
        }
        if (Intrinsics.LJFF(rawType, LightInteractionCommonResource.class)) {
            return new LightInteractionCommonResourceTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, LightInteractionStickerSetMessage.class)) {
            return new LightInteractionStickerSetMessageTypeAdapter();
        }
        if (Intrinsics.LJFF(rawType, LightInteractionGiphyMessage.class)) {
            return new LightInteractionGiphyMessageTypeAdapter();
        }
        if (Intrinsics.LJFF(rawType, LightInteractionTextMessage.class)) {
            return new LightInteractionTextMessageTypeAdapter();
        }
        if (Intrinsics.LJFF(rawType, ActionBarStrategyConf.class)) {
            return new ActionBarStrategyConfTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, ActionBarButtonStrategyConf.class)) {
            return new ActionBarButtonStrategyConfTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, ActionBarStrategyTransferConf.class)) {
            return new ActionBarStrategyTransferConfTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, ActionBarTransferConf.class)) {
            return new ActionBarTransferConfTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, DisplayNameLang.class)) {
            return new DisplayNameLangTypeAdapter();
        }
        if (Intrinsics.LJFF(rawType, PreshownStickerConfigResolvingResult.class)) {
            return new PreshownStickerConfigResolvingResultTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, AIMojiStickerConfig.class)) {
            return new AIMojiStickerConfigTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, PreshownStickerItem.class)) {
            return new PreshownStickerItemTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, PreshownStickerSceneConfig.class)) {
            return new PreshownStickerSceneConfigTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, PreshownStickerScoreUpdatingResult.class)) {
            return new PreshownStickerScoreUpdatingResultTypeAdapter();
        }
        if (Intrinsics.LJFF(rawType, ChatFeatureListConf.class)) {
            return new ChatFeatureListConfTypeAdapter(gson);
        }
        if (Intrinsics.LJFF(rawType, ChatComponentConfig.class)) {
            return new ChatComponentConfigTypeAdapter();
        }
        return null;
    }
}
