package net.eddy.tutorialmod;

import net.minecraft.client.option.SimpleOption;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector3f;
import org.lwjgl.glfw.GLFW;
import net.minecraft.client.MinecraftClient;

public class Camera {

    public static final MinecraftClient client = MinecraftClient.getInstance();

    //SimpleOption<Vector3f> mouseSensitivitySetting = client.getCameraEntity().getClientCameraPosVec(tickDelta);

    Vec3d cameraPos = client.cameraEntity.getPos();

    double cameraX = cameraPos.x;

    double cameraY = cameraPos.y;

    double cameraZ = cameraPos.z;




}
