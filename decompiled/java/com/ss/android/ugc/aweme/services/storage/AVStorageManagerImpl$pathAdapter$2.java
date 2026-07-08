package com.ss.android.ugc.aweme.services.storage;

import X.C09AY;
import X.C20228114Cx;
import X.InterfaceC1460960o7a;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public final class AVStorageManagerImpl$pathAdapter$2 extends C09AY implements Function0<C20228114Cx> {
    public AVStorageManagerImpl$pathAdapter$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C20228114Cx invoke() {
        return new InterfaceC1460960o7a() { // from class: X.14Cx
            @Override // X.InterfaceC1460960o7a
            public final String LIZ() {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), C1445850njD.LIZ, EnumC20228014Cw.WATERMARK_VE_WORKSPACE, null, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIIIZ() {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), C1445850njD.LIZ, EnumC20228014Cw.AI_CHOOSE_MUSIC, null, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIIJJI() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C1449640npK.LIZ);
                sbLIZ.append("upload-config-dir");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIILL() {
                return C2298208zU.LJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), C1445850njD.LIZ, C0MI0.END_WATERMARK_WORKSPACE, null, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIILLIIL() {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), C1445850njD.LIZ, EnumC20228014Cw.VIDEO_FRAME_CACHE, C570490MZb.LIZJ(String.valueOf(System.currentTimeMillis())), 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIJJLI() {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), C1445850njD.LJ, EnumC20228014Cw.COVER, null, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIJL() {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.SAVE_PHOTO_STICKER_WATERMARK, "");
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIL() {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), C1445850njD.LIZ, EnumC20228014Cw.VIDEO_TO_GIF_VE_WORKSPACE, String.valueOf(System.currentTimeMillis()), 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJJJL() {
                return C2298208zU.LJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), C1445850njD.LIZJ, C0MI0.STORY_THOUGHT_COVER, null, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJLL() {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.STITCH_ORIGIN_VIDEO, "");
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJLZIJ() {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.FILTERS, "");
            }

            @Override // X.InterfaceC1460960o7a
            public final String LIZLLL(CreativeInfo creativeInfo) {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.WATERMARK, null, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJFF(CreativeInfo creativeInfo) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.EFFECT_CAPTURE_PHOTO, null, false, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJII(CreativeInfo creativeInfo) {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.SHARED_AR, null, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIIJ(VideoPublishEditModel videoPublishEditModel) {
                return C570490MZb.LIZJ(C2298208zU.LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228014Cw.COMPILE_PROBE_VE_WORKSPACE, null, false, 12).getAbsolutePath());
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIILIIL(CreativeInfo creativeInfo) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.CUT, null, false, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIILJJIL(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C570490MZb.LIZJ(C20021913Vp.LIZIZ()));
                sbLIZ.append("effect");
                sbLIZ.append(File.separator);
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIIZILJ(CreativeInfo creativeInfo) {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.UGC_TEMPLATE_PREVIEW_VIDEO, null, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIJI(CreativeInfo creativeInfo) {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.SAVE_TO_LOCAL, C1449640npK.LIZ(".mp4"), 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIJJ(CreativeInfo creativeInfo) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.VIDEO_IMAGE_MIXED, null, false, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIL(CreativeInfo creativeInfo) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.MV_PHOTO, "", false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJ(CreativeInfo creativeInfo) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.UPLOAD_PIC_STICKER, null, false, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJI(String str) {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.DUET_ORIGIN_VIDEO, str);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIFFI(CreativeInfo creativeInfo) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.COVER, null, false, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIIZ(VideoPublishEditModel videoPublishEditModel) {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(videoPublishEditModel.getCreativeInfo());
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIJ(CreativeInfo creativeInfo) {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILLIIL(creativeInfo, EnumC20228214Cy.SVC_VOICE_CHANGE_CACHE, "", true).getAbsolutePath();
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIJIIJIL(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C570490MZb.LIZJ(new C0VSJ(C20021913Vp.LIZIZ(), "font").getAbsolutePath()));
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIJIL(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C570490MZb.LIZJ(C20021913Vp.LIZIZ()));
                sbLIZ.append("mvtheme");
                String str2 = File.separator;
                sbLIZ.append(str2);
                sbLIZ.append("mvres");
                sbLIZ.append(str2);
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIJLIJ(CreativeInfo creativeInfo) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.PHOTO, null, false, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIZ(CreativeInfo creativeInfo) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.CANVAS, null, false, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJ(String str) {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.LOCAL_AUDIO_EFFECT, str);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJJI(String str) {
                return C2298208zU.LJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), C1445850njD.LIZ, C0MI0.SHARE, str, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJJJ(String str) {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.AI_CHAT_EXTRACT_FRAME, str);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJJL(CreativeInfo creativeInfo) {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.DUET_VE_WORKSPACE, null, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJJLL(CreativeInfo creativeInfo) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.COVER, C2279908wX.LIZ(), false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJJZ(VideoPublishEditModel videoPublishEditModel) {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228014Cw.EXTRACT_ORIGIN_SOUND_WORKSPACE, null, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJJZI(VideoPublishEditModel videoPublishEditModel) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228214Cy.VE_PREVIEW_WORKSPACE, null, false, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJLIIL(CreativeInfo creativeInfo) {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.CUT_VE_WORKSPACE, null, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJZ(String str) {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.LOCAL_DUET_LAYOUT, str);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJL(CreativeInfo creativeInfo) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.AVATAR, null, false, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJLI(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C570490MZb.LIZJ(C20021913Vp.LIZIZ()));
                sbLIZ.append("effectmodel");
                sbLIZ.append(File.separator);
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJLIIIIJ(String str) {
                C01GW c01gw = C20021913Vp.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C1449640npK.LJIIJJI);
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJLIIIJ(VideoPublishEditModel videoPublishEditModel) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228214Cy.INFO_STICKER, null, false, 12);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJLIIIJILLIZJL(CreativeInfo creativeInfo) {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.COVER, C2279908wX.LIZ(), 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String genMusicPath(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C1449640npK.LJIILIIL);
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LIZIZ(CreativeInfo creativeInfo, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.DUET, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LIZJ(CreativeInfo creativeInfo, String str) {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.ALBUM_PREVIEW_VIDEO, str, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJ(VideoPublishEditModel videoPublishEditModel, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228214Cy.AUDIO_RECORD, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJI(VideoPublishEditModel videoPublishEditModel, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228214Cy.COVER_TEXT, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228214Cy.COVER_TEXT, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIIL(CreativeInfo creativeInfo, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.VOICE_CONVERSION, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJIJ(VideoPublishEditModel videoPublishEditModel, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228214Cy.TEXT_STICKER, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJII(VideoPublishEditModel videoPublishEditModel, String str) {
                return C2298208zU.LJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), C0MI0.ORIGIN_SOUND, str, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIII(CreativeInfo creativeInfo, String str) {
                return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.CAPTION, str, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIIJZLJL(CreativeInfo creativeInfo, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.TEXT_STICKER, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIIZI(CreativeInfo creativeInfo, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.CONCAT, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIJIIJI(VideoPublishEditModel videoPublishEditModel, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228214Cy.BACKGROUND_VIDEO, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJI(CreativeInfo creativeInfo, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.CUSTOM_STICKER, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJIL(CreativeInfo creativeInfo, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.BACKGROUND_VIDEO, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJJ(CreativeInfo creativeInfo, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.COVER, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJJIZL(VideoPublishEditModel videoPublishEditModel, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228214Cy.DIY_PROP_VIDEO, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJJJLI(CreativeInfo creativeInfo, String str) {
                return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.STICKER_PIN, str, false, 8);
            }

            @Override // X.InterfaceC1460960o7a
            public final String LJJIIJ(CreativeInfo creativeInfo, String str, boolean z) {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILJJIL(creativeInfo, EnumC20228214Cy.RECORD, str, z);
            }
        };
    }
}
