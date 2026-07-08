package com.ss.android.ugc.aweme.sticker.service;

import X.C0BWO;
import X.C1728406pm;
import X.C20169013vs;
import X.C20171713wJ;
import X.C20174913wp;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.SocialStickerMetaData;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryStreakModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.story.IStoryStreakDMService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService;
import com.ss.android.ugc.aweme.social.sticker.cleanup.SocialStickerPreloadCleanTask;
import com.ss.android.ugc.aweme.social.sticker.enteredit.streak.ColorMetaData;
import com.ss.android.ugc.aweme.social.sticker.enteredit.streak.GroupChatStreakInfoColorConfig;
import com.ss.android.ugc.aweme.social.sticker.language.StoryStickerLanguageConfig;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import com.ss.android.ugc.aweme.social.sticker.model.base.GeckoResourceParam;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerColorStyle;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerCustomData;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerImageList;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerImageMetaData;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerMapData;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerTextMetaData;
import com.ss.android.ugc.aweme.story.experiment.streak.GroupChatStreakExpConfig;
import com.zhiliaoapp.musically.R;
import java.io.BufferedOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class StorySocialEventStickerServiceImpl implements IStorySocialEventStickerService {
    @Override // com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService
    public final C20169013vs LIZJ() {
        return new C20169013vs();
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService
    public final String LJ() {
        return new C20174913wp().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService
    public final SocialStickerPreloadCleanTask LIZ() {
        if (C0BWO.LIZ()) {
            return new SocialStickerPreloadCleanTask();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService
    public final C20171713wJ LIZLLL(final int i, final Context context) {
        if (i != 7) {
            if (i != 8) {
                if (i != 9) {
                    return null;
                }
                return new C20171713wJ(context, i) { // from class: X.13wP
                    @Override // X.C20171713wJ, X.InterfaceC1728106pj
                    public final void LIZJ(Function1<? super StorySocialEventPrepareData, Unit> function1) {
                        super.LIZJ(function1);
                        C20171213wE c20171213wE = new C20171213wE() { // from class: X.13wL
                            public final C01GW LJI;

                            {
                                new C20168613vo("get_sticker_json");
                                this.LJI = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(339));
                            }

                            /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
                            @Override // X.C20169913w1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object LJ(X.C20169813w0<com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData> r20, X.InterfaceC1364105Vn<? super X.C20170413w6> r21) {
                                /*
                                    Method dump skipped, instruction units count: 291
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C20171913wL.LJ(X.13w0, X.05Vn):java.lang.Object");
                            }
                        };
                        C20170113w3 c20170113w3 = this.LJIIJJI;
                        c20170113w3.LIZIZ(c20171213wE);
                        c20170113w3.LIZ(((C20171213wE) this.LJIIIZ.getValue()).LIZLLL, c20171213wE.LIZLLL);
                    }
                };
            }
            return new C20171713wJ(context, i) { // from class: X.13wT
            };
        }
        return new C20171713wJ(context, i) { // from class: X.13wM
            @Override // X.C20171713wJ, X.InterfaceC1728106pj
            public final void LIZJ(Function1<? super StorySocialEventPrepareData, Unit> function1) {
                super.LIZJ(function1);
                IStoryStreakDMService iStoryStreakDMService = (IStoryStreakDMService) PluggableExtentionKt.pluggableSpi$default(IStoryStreakDMService.class, false, false, false, 14, null);
                C20173513wb c20173513wbLIZ = null;
                if (iStoryStreakDMService != null) {
                    c20173513wbLIZ = iStoryStreakDMService.LIZ();
                }
                if ((c20173513wbLIZ instanceof C20171213wE) && c20173513wbLIZ != null) {
                    C20171213wE c20171213wE = new C20171213wE() { // from class: X.13wW
                        public final C01GW LJI;
                        public String LJII;

                        {
                            new C20168613vo("build_group_chat_sticker");
                            this.LJI = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(311));
                            this.LJII = "display_font";
                        }

                        public static void LJII(String str, List list) {
                            list.add(new SocialStickerResourceMetaData(str, 3, null, null, null, null, new GeckoResourceParam("tiktok_social_friends_interaction_res", "story_streaks_post/TikTok-Display-Bold.otf", ".otf"), null, null));
                        }

                        public static String LJIIIZ(C20173013wW c20173013wW, Number number) {
                            C19348710mr c19348710mr;
                            String string;
                            c20173013wW.getClass();
                            if (number.longValue() < LSPassThroughRecordSizeConfig.DEFAULT) {
                                c19348710mr = new C19348710mr(null, null, null, 15);
                            } else {
                                c19348710mr = new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13);
                            }
                            CharSequence charSequenceLIZ = C19374310qz.LIZ(number, c19348710mr, null, 1, 20);
                            if (charSequenceLIZ == null || (string = charSequenceLIZ.toString()) == null) {
                                return "";
                            }
                            return string;
                        }

                        @Override // X.C20169913w1
                        public final Object LJ(C20169813w0<StorySocialEventPrepareData> c20169813w0, InterfaceC1364105Vn<? super C20170413w6> interfaceC1364105Vn) {
                            Context context2;
                            String style2EffectId;
                            String strLIZIZ;
                            SocialStickerMapData data;
                            List<SocialStickerImageList> image;
                            List<SocialStickerCustomData> customData;
                            String str;
                            String shadowColorStyle2;
                            String str2;
                            StorySocialEventStickerData stickerData = c20169813w0.LIZ.getStickerData();
                            StoryStreakModel storyStreakModel = c20169813w0.LIZ.getEnterEditParam().getStoryStreakModel();
                            if (storyStreakModel == null) {
                                return LIZJ(c20169813w0.LIZ, EnumC20169713vz.FAILED, C2286608xc.LJ(100));
                            }
                            WeakReference<Context> context3 = c20169813w0.LIZ.getContext();
                            if (context3 != null && (context2 = context3.get()) != null) {
                                stickerData.setResources(new ArrayList());
                                stickerData.setData(new SocialStickerMapData(null, null, null, null));
                                SocialStickerMetaData metaData = stickerData.getMetaData();
                                GroupChatStreakInfoColorConfig groupChatStreakInfoColorConfig = C20173313wZ.LIZ;
                                int memberCount = storyStreakModel.getMemberCount();
                                C01GW c01gw = C126U.LIZIZ;
                                if (memberCount <= ((GroupChatStreakExpConfig) c01gw.getValue()).getMaxMemberAvatar()) {
                                    style2EffectId = ((GroupChatStreakInfoColorConfig) C20173313wZ.LIZIZ.getValue()).getStyle1EffectId();
                                } else {
                                    style2EffectId = ((GroupChatStreakInfoColorConfig) C20173313wZ.LIZIZ.getValue()).getStyle2EffectId();
                                }
                                metaData.setStickerId(style2EffectId);
                                ColorMetaData colorMetaDataLIZ = C20173313wZ.LIZ(storyStreakModel.getStreakLevel());
                                SocialStickerMapData data2 = stickerData.getData();
                                if (data2 != null) {
                                    data2.setCustomData(new ArrayList());
                                }
                                SocialStickerMapData data3 = stickerData.getData();
                                int i2 = 1;
                                if (data3 != null && (customData = data3.getCustomData()) != null) {
                                    int streakLevel = storyStreakModel.getStreakLevel();
                                    String str3 = "1";
                                    if (streakLevel >= 300) {
                                        str = "6";
                                    } else if (streakLevel >= 200) {
                                        str = "5";
                                    } else if (streakLevel >= 100) {
                                        str = "4";
                                    } else if (streakLevel >= 30) {
                                        str = "3";
                                    } else if (streakLevel < 10) {
                                        str = "1";
                                    } else {
                                        str = "2";
                                    }
                                    customData.add(new SocialStickerCustomData("fire_level", str));
                                    customData.add(new SocialStickerCustomData("bubble_color", colorMetaDataLIZ.getBubbleColor()));
                                    if (storyStreakModel.getMemberCount() <= ((GroupChatStreakExpConfig) c01gw.getValue()).getMaxMemberAvatar()) {
                                        shadowColorStyle2 = colorMetaDataLIZ.getShadowColorStyle1();
                                    } else {
                                        shadowColorStyle2 = colorMetaDataLIZ.getShadowColorStyle2();
                                    }
                                    customData.add(new SocialStickerCustomData("shadow_color", shadowColorStyle2));
                                    if (!storyStreakModel.getCanShowMultiInfo()) {
                                        str2 = "1";
                                    } else {
                                        str2 = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    customData.add(new SocialStickerCustomData("is_single", str2));
                                    String groupName = storyStreakModel.getGroupName();
                                    if (groupName != null && groupName.length() != 0) {
                                        str3 = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    customData.add(new SocialStickerCustomData("group_name_empty", str3));
                                }
                                List<SocialStickerResourceMetaData> resources = stickerData.getResources();
                                C20174913wp c20174913wp = (C20174913wp) this.LJI.getValue();
                                c20174913wp.getClass();
                                StoryStickerLanguageConfig storyStickerLanguageConfig = C20173813we.LIZ;
                                String strLIZ = C20173813we.LIZ((String) c20174913wp.LIZ.getValue());
                                String strLIZ2 = ((C20174913wp) this.LJI.getValue()).LIZ();
                                if (((Boolean) C263480AUg.LIZ.getValue()).booleanValue()) {
                                    Object value = this.LJI.getValue();
                                    String groupName2 = storyStreakModel.getGroupName();
                                    value.getClass();
                                    strLIZIZ = C20174913wp.LIZIZ(context2, groupName2);
                                } else {
                                    strLIZIZ = null;
                                }
                                String str4 = "display_font";
                                if (strLIZ == null && strLIZIZ == null) {
                                    LJII("display_font", resources);
                                } else if (strLIZ != null) {
                                    if (strLIZIZ != null) {
                                        LJIIIIZZ("display_font", strLIZ, resources);
                                        if (!Intrinsics.LJFF(strLIZIZ, strLIZ)) {
                                            LJIIIIZZ("group_name_font", strLIZIZ, resources);
                                            this.LJII = "group_name_font";
                                        }
                                    } else {
                                        LJIIIIZZ("display_font", strLIZ, resources);
                                        LJII("group_name_font", resources);
                                        this.LJII = "group_name_font";
                                    }
                                } else if (strLIZIZ != null) {
                                    LJII("display_font", resources);
                                    LJIIIIZZ("group_name_font", strLIZIZ, resources);
                                    this.LJII = "group_name_font";
                                }
                                if (strLIZ2 == null) {
                                    resources.add(new SocialStickerResourceMetaData("txt_font", 3, null, null, null, null, new GeckoResourceParam("tiktok_social_friends_interaction_res", "story_streaks_post/TikTok-Text-Bold.otf", ".otf"), null, null));
                                } else {
                                    LJIIIIZZ("txt_font", strLIZ2, resources);
                                }
                                String infoFontEffectId = colorMetaDataLIZ.getInfoFontEffectId();
                                if (infoFontEffectId != null) {
                                    LJIIIIZZ("num_high_font", infoFontEffectId, resources);
                                }
                                List<UrlModel> avatarList = storyStreakModel.getAvatarList();
                                if (avatarList != null && !avatarList.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = new ArrayList();
                                    int i3 = 0;
                                    for (UrlModel urlModel : avatarList) {
                                        int i4 = i3 + 1;
                                        if (i3 >= 0) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("avatar");
                                            sbLIZ.append('_');
                                            sbLIZ.append(i3);
                                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                                            SocialStickerResourceMetaData socialStickerResourceMetaData = new SocialStickerResourceMetaData("", 0, null, null, null, null, null, null, null);
                                            socialStickerResourceMetaData.setId(strLIZIZ2);
                                            socialStickerResourceMetaData.setType(i2);
                                            socialStickerResourceMetaData.setFallbackResId(Integer.valueOf(R.raw.icon_color_default_avatar));
                                            socialStickerResourceMetaData.setRemoteUrl(urlModel);
                                            socialStickerResourceMetaData.setCircle(Boolean.TRUE);
                                            arrayList.add(socialStickerResourceMetaData);
                                            arrayList2.add(new SocialStickerImageMetaData(strLIZIZ2, null, null, null));
                                            i3 = i4;
                                            i2 = 1;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    stickerData.getResources().addAll(arrayList);
                                    if (stickerData.getData() == null) {
                                        stickerData.setData(new SocialStickerMapData(null, null, null, null));
                                    }
                                    SocialStickerMapData data4 = stickerData.getData();
                                    if ((data4 == null || data4.getImage() == null) && (data = stickerData.getData()) != null) {
                                        data.setImage(new ArrayList());
                                    }
                                    SocialStickerMapData data5 = stickerData.getData();
                                    if (data5 != null && (image = data5.getImage()) != null) {
                                        image.add(new SocialStickerImageList("avatar", arrayList2));
                                    }
                                }
                                SocialStickerMapData data6 = stickerData.getData();
                                if (data6 != null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    SocialStickerTextMetaData socialStickerTextMetaData = new SocialStickerTextMetaData("title", context2.getString(2131849170), "display_font", null, null, null);
                                    SocialStickerColorStyle socialStickerColorStyle = new SocialStickerColorStyle(null, null, null, null, -1);
                                    socialStickerColorStyle.setColorString(colorMetaDataLIZ.getTitleColor());
                                    socialStickerTextMetaData.setStyle(socialStickerColorStyle);
                                    arrayList3.add(socialStickerTextMetaData);
                                    String groupName3 = storyStreakModel.getGroupName();
                                    if (groupName3 != null && groupName3.length() != 0) {
                                        SocialStickerTextMetaData socialStickerTextMetaData2 = new SocialStickerTextMetaData("nickname", context2.getString(2131849166, groupName3), this.LJII, null, null, null);
                                        SocialStickerColorStyle socialStickerColorStyle2 = new SocialStickerColorStyle(null, null, null, null, -1);
                                        socialStickerColorStyle2.setColorString(colorMetaDataLIZ.getNameColor());
                                        socialStickerTextMetaData2.setStyle(socialStickerColorStyle2);
                                        arrayList3.add(socialStickerTextMetaData2);
                                    }
                                    SocialStickerColorStyle infoColor = colorMetaDataLIZ.getInfoColor();
                                    if (colorMetaDataLIZ.getInfoFontEffectId() != null) {
                                        str4 = "num_high_font";
                                    }
                                    arrayList3.add(new SocialStickerTextMetaData("ongoing_chat_days_label", context2.getString(2131849167), "txt_font", null, null, null));
                                    arrayList3.add(new SocialStickerTextMetaData("ongoing_chat_days_value", String.valueOf(storyStreakModel.getStreakLevel()), str4, infoColor, null, null));
                                    arrayList3.add(new SocialStickerTextMetaData("group_days_label", context2.getString(2131849169), "txt_font", null, null, null));
                                    arrayList3.add(new SocialStickerTextMetaData("group_days_value", LJIIIZ(this, Integer.valueOf(storyStreakModel.getGroupDays())), str4, infoColor, null, null));
                                    arrayList3.add(new SocialStickerTextMetaData("my_messages_label", context2.getString(2131849168), "txt_font", null, null, null));
                                    arrayList3.add(new SocialStickerTextMetaData("my_messages_value", LJIIIZ(this, Integer.valueOf(storyStreakModel.getMessageCount())), str4, infoColor, null, null));
                                    data6.setInfo(arrayList3);
                                }
                                SocialStickerMapData data7 = stickerData.getData();
                                if (data7 != null) {
                                    data7.setBackground(new SocialStickerColorStyle(colorMetaDataLIZ.getBackgroundColor(), null, null, null, -1));
                                }
                                return LIZJ(c20169813w0.LIZ, EnumC20169713vz.SUCCESS, null);
                            }
                            return LIZJ(c20169813w0.LIZ, EnumC20169713vz.FAILED, C2286608xc.LJ(121));
                        }

                        public static void LJIIIIZZ(String str, String str2, List list) {
                            list.add(new SocialStickerResourceMetaData(str, 2, null, null, str2, null, null, null, null));
                        }
                    };
                    C20169913w1<StorySocialEventPrepareData> c20169913w1 = new C20169913w1<StorySocialEventPrepareData>() { // from class: X.13wX
                        {
                            new C20168613vo("save_background");
                        }

                        @Override // X.C20169913w1
                        public final Object LJ(C20169813w0<StorySocialEventPrepareData> c20169813w0, InterfaceC1364105Vn<? super C20170413w6> interfaceC1364105Vn) {
                            Context context2;
                            int streakLevel;
                            Object c098200Yq;
                            Bitmap bitmapDecodeFile;
                            Integer numLIZJ;
                            StorySocialEventPrepareData storySocialEventPrepareData = c20169813w0.LIZ;
                            WeakReference<Context> context3 = storySocialEventPrepareData.getContext();
                            if (context3 != null && (context2 = context3.get()) != null) {
                                C197009126d c197009126d = InterfaceC20168913vr.LIZ;
                                String creationId = storySocialEventPrepareData.getCreationId();
                                c197009126d.getClass();
                                String strLIZ = C197009126d.LIZ(creationId, "back");
                                StoryStreakModel storyStreakModel = storySocialEventPrepareData.getEnterEditParam().getStoryStreakModel();
                                int iIntValue = ((Number) C264090AWp.LIZ.getValue()).intValue();
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, ((Number) C264080AWo.LIZ.getValue()).intValue(), Bitmap.Config.RGB_565);
                                GroupChatStreakInfoColorConfig groupChatStreakInfoColorConfig = C20173313wZ.LIZ;
                                if (storyStreakModel != null) {
                                    streakLevel = storyStreakModel.getStreakLevel();
                                } else {
                                    streakLevel = -1;
                                }
                                try {
                                    c098200Yq = Integer.valueOf(Color.parseColor(C20173313wZ.LIZ(streakLevel).getBackgroundColor()));
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                                    bitmapCreateBitmap.eraseColor(((Number) c098200Yq).intValue());
                                }
                                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.tq, context2)) != null) {
                                    bitmapCreateBitmap.eraseColor(numLIZJ.intValue());
                                }
                                try {
                                    bitmapDecodeFile = BitmapFactory.decodeFile(strLIZ);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    bitmapDecodeFile = null;
                                }
                                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), Bitmap.Config.RGB_565);
                                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
                                if (bitmapDecodeFile != null) {
                                    int iLIZIZ = (iIntValue - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(37))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                                    canvas.drawBitmap(Bitmap.createScaledBitmap(bitmapDecodeFile, iLIZIZ, (int) (iLIZIZ * (bitmapDecodeFile.getHeight() / bitmapDecodeFile.getWidth())), true), C418440Gaw.LIZIZ(28), (r12 - ((int) (r12 * 0.07f))) - r6, (Paint) null);
                                }
                                bitmapCreateBitmap.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                                if (bitmapDecodeFile != null) {
                                    bitmapDecodeFile.recycle();
                                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
                                }
                                if (bitmapCreateBitmap2 != null) {
                                    try {
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(strLIZ));
                                        bitmapCreateBitmap2.compress(Bitmap.CompressFormat.PNG, 80, bufferedOutputStream);
                                        bufferedOutputStream.flush();
                                        bufferedOutputStream.close();
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        C098200Yq c098200Yq2 = new C098200Yq(th2);
                                        C189200o6.m2constructorimpl(c098200Yq2);
                                        C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                                    }
                                }
                                storySocialEventPrepareData.getStickerData().getResources().add(new SocialStickerResourceMetaData("background", 0, null, null, null, null, null, strLIZ, null));
                                return LIZJ(storySocialEventPrepareData, EnumC20169713vz.SUCCESS, null);
                            }
                            return LIZJ(storySocialEventPrepareData, EnumC20169713vz.FAILED, C2286608xc.LJ(121));
                        }
                    };
                    C20170113w3 c20170113w3 = this.LJIIJJI;
                    if (c20170113w3 != null) {
                        c20170113w3.LIZIZ(c20173513wbLIZ);
                        c20170113w3.LIZIZ(c20171213wE);
                        c20170113w3.LIZIZ(c20169913w1);
                        c20170113w3.LIZ(c20171213wE.LIZLLL, c20173513wbLIZ.LIZLLL);
                        c20170113w3.LIZ(((C20171213wE) this.LJIIIZ.getValue()).LIZLLL, c20171213wE.LIZLLL);
                        c20170113w3.LIZ(c20169913w1.LIZ, c20171213wE.LIZLLL);
                        c20170113w3.LIZ(((C20169913w1) this.LJIIJ.getValue()).LIZ, c20169913w1.LIZ);
                    }
                }
            }

            @Override // X.C20171713wJ
            public final void LIZLLL(C2344009Gk c2344009Gk) {
                Integer numValueOf;
                StoryStreakModel storyStreakModel = this.LJII.getEnterEditParam().getStoryStreakModel();
                if (storyStreakModel != null) {
                    numValueOf = Integer.valueOf(storyStreakModel.getStreakLevel());
                } else {
                    numValueOf = null;
                }
                c2344009Gk.LJIIIIZZ("streak_level", String.valueOf(numValueOf));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService
    public final Pair LIZIZ(Context context, Long l, String str, String str2) {
        C1728406pm.LIZ.getClass();
        return C1728406pm.LIZJ(8, context, l, str, str2);
    }
}
