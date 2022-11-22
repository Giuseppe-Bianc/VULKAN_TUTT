package it.unibas.vulkanttt;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.NULL;

public class APP {
    private static final Logger LOGGER = LogManager.getLogger(APP.class);
    private static final APP instance = new APP();
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;


    private long window;


    public static APP getInstance() {
        return APP.instance;
    }

    public void run() {
        initWindow();
        initVulkan();
        mainLoop();
        cleanup();
    }

    private void initWindow() {

        if (!glfwInit()) {
            throw new VKException("Cannot initialize GLFW");
        }


        glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_FALSE);

        window = glfwCreateWindow(WIDTH, HEIGHT, "Vulkan", NULL, NULL);

    }

    private void initVulkan() {
        //
    }

    private void mainLoop() {

        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();
        }

    }

    private void cleanup() {

        glfwDestroyWindow(window);

        glfwTerminate();
    }

}
