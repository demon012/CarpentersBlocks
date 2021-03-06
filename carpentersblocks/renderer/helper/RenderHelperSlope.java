package carpentersblocks.renderer.helper;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.util.Icon;
import carpentersblocks.data.Slope;

public class RenderHelperSlope extends VertexHelper {

	/**
	 * Renders the given texture to the bottom face of the block. Args: slope, x, y, z, texture
	 */
	public static void renderFaceYNeg(RenderBlocks renderBlocks, int slope, double x, double y, double z, Icon icon)
	{
		double uMin = icon.getInterpolatedU(renderBlocks.renderMinX * 16.0D);
		double uMax = icon.getInterpolatedU(renderBlocks.renderMaxX * 16.0D);
		double vMin = icon.getInterpolatedV(renderBlocks.renderMinZ * 16.0D);
		double vMax = icon.getInterpolatedV(renderBlocks.renderMaxZ * 16.0D);

        double xMin = x + renderBlocks.renderMinX;
        double xMax = x + renderBlocks.renderMaxX;
        double yMin = y + renderBlocks.renderMinY;
        double yMax = y + renderBlocks.renderMaxY;
        double zMin = z + renderBlocks.renderMinZ;
        double zMax = z + renderBlocks.renderMaxZ;
		
		switch (slope) {
			case Slope.NEG_EAST:
				setupVertex(renderBlocks, xMin, yMin, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMax, vMin, 1);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMin, vMax, 3);
				break;
			case Slope.NEG_WEST:
				setupVertex(renderBlocks, xMin, y + 1.0, zMax, uMin, vMin, 0);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, vMax, 2);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMin, 3);
				break;
			case Slope.NEG_NORTH:
				setupVertex(renderBlocks, xMin, yMax, zMax, uMax, vMin, 0);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMin, 1);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMin, vMax, 2);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, vMax, 3);
				break;
			case Slope.NEG_SOUTH:
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, vMax, 0);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMax, vMax, 1);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMin, 2);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMin, vMin, 3);
				break;
			case Slope.SIDE_NE:
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, vMax, 0);
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, vMax, 0);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, vMin, 2);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, vMax, 3);
				break;				
			case Slope.SIDE_NW:
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, vMin, 1);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, vMin, 1);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, vMin, 2);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, vMax, 3);
				break;				
			case Slope.SIDE_SE:
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, vMax, 0);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, vMin, 1);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, vMax, 3);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, vMax, 3);
				break;				
			case Slope.SIDE_SW:
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, vMax, 0);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, vMin, 1);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, vMin, 2);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, vMin, 2);
				break;
			default:
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, vMax, 0);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, vMin, 1);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, vMin, 2);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, vMax, 3);
		}
	}

	/**
	 * Renders the given texture to the top face of the block. Args: slope, x, y, z, texture
	 */
	public static void renderFaceYPos(RenderBlocks renderBlocks, int slope, double x, double y, double z, Icon icon)
	{
		double uMin = icon.getInterpolatedU(renderBlocks.renderMinX * 16.0D);
		double uMax = icon.getInterpolatedU(renderBlocks.renderMaxX * 16.0D);
		double vMin = icon.getInterpolatedV(renderBlocks.renderMinZ * 16.0D);
		double vMax = icon.getInterpolatedV(renderBlocks.renderMaxZ * 16.0D);

        double xMin = x + renderBlocks.renderMinX;
        double xMax = x + renderBlocks.renderMaxX;
        double yMin = y + renderBlocks.renderMinY;
        double yMax = y + renderBlocks.renderMaxY;
        double zMin = z + renderBlocks.renderMinZ;
        double zMax = z + renderBlocks.renderMaxZ;
		
		switch (slope) {
			case Slope.POS_EAST:
				setupVertex(renderBlocks, xMax, yMax, zMax, uMin, vMin, 0);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMax, vMax, 2);
				setupVertex(renderBlocks, xMin, yMax, zMax, uMax, vMin, 3);
				break;
			case Slope.POS_WEST:
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMin, 1);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, vMax, 3);
				break;
			case Slope.POS_NORTH:
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMin, 0);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMin, vMin, 1);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, vMax, 2);
				setupVertex(renderBlocks, xMin, yMin, zMax, uMax, vMax, 3);
				break;
			case Slope.POS_SOUTH:
				setupVertex(renderBlocks, xMax, yMin, zMax, uMin, vMax, 0);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, vMax, 1);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMax, vMin, 2);
				setupVertex(renderBlocks, xMin, yMax, zMax, uMin, vMin, 3);
				break;
			case Slope.SIDE_NE:
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMin, 1);
				setupVertex(renderBlocks, xMin, yMax, zMax, uMin, vMax, 3);
				setupVertex(renderBlocks, xMin, yMax, zMax, uMin, vMax, 3);
				break;				
			case Slope.SIDE_NW:
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMin, 1);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMin, 2);
				break;				
			case Slope.SIDE_SE:
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMin, yMax, zMax, uMin, vMax, 3);
				break;				
			case Slope.SIDE_SW:
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMin, 1);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMin, 1);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMin, yMax, zMax, uMin, vMax, 3);
				break;
			default:
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMin, 1);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMin, yMax, zMax, uMin, vMax, 3);
		}
	}

	/**
	 * Renders the given texture to the east (z-negative) face of the block.  Args: slope, x, y, z, texture
	 */
	public static void renderFaceZNeg(RenderBlocks renderBlocks, int slope, double x, double y, double z, Icon icon)
	{
		double uMin = icon.getInterpolatedU(renderBlocks.renderMinX * 16.0D);
		double uMax = icon.getInterpolatedU(renderBlocks.renderMaxX * 16.0D);
		double vMax = icon.getInterpolatedV(16.0D - renderBlocks.renderMaxY * 16.0D);
		double vMin = icon.getInterpolatedV(16.0D - renderBlocks.renderMinY * 16.0D);

        double xMin = x + renderBlocks.renderMinX;
        double xMax = x + renderBlocks.renderMaxX;
        double yMin = y + renderBlocks.renderMinY;
        double yMax = y + renderBlocks.renderMaxY;
        double zMin = z + renderBlocks.renderMinZ;
        double zMax = z + renderBlocks.renderMaxZ;
		
		switch (slope) {
			case Slope.POS_NORTH:
				setupVertex(renderBlocks, xMin, yMin, zMin, uMax, iconHasFloatingHeight(icon) ? vMax : vMin, 3);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMax, iconHasFloatingHeight(icon) ? vMax : vMin, 3);
				break;
			case Slope.POS_SOUTH:
				setupVertex(renderBlocks, xMin, yMax, zMin, uMax, vMax, 0);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMin, iconHasFloatingHeight(icon) ? vMax : vMin, 2);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMin, iconHasFloatingHeight(icon) ? vMax : vMin, 2);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMax, vMin, 3);
				break;
			case Slope.NEG_NORTH:
				setupVertex(renderBlocks, xMin, yMax, zMin, uMax, vMax, 0);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMax, vMax, 0);
				break;
			case Slope.NEG_SOUTH:
				setupVertex(renderBlocks, xMin, yMax, zMin, uMax, vMax, 0);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMax, vMin, 3);
				break;
			default:
				setupVertex(renderBlocks, xMin, yMax, zMin, uMax, vMax, 0);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMax, vMin, 3);
		}
	}

	/**
	 * Renders the given texture to the west (z-positive) face of the block.  Args: slope, x, y, z, texture
	 */
	public static void renderFaceZPos(RenderBlocks renderBlocks, int slope, double x, double y, double z, Icon icon)
	{
		double uMin = icon.getInterpolatedU(renderBlocks.renderMinX * 16.0D);
		double uMax = icon.getInterpolatedU(renderBlocks.renderMaxX * 16.0D);
		double vMax = icon.getInterpolatedV(16.0D - renderBlocks.renderMaxY * 16.0D);
		double vMin = icon.getInterpolatedV(16.0D - renderBlocks.renderMinY * 16.0D);

        double xMin = x + renderBlocks.renderMinX;
        double xMax = x + renderBlocks.renderMaxX;
        double yMin = y + renderBlocks.renderMinY;
        double yMax = y + renderBlocks.renderMaxY;
        double zMin = z + renderBlocks.renderMinZ;
        double zMax = z + renderBlocks.renderMaxZ;
		
		switch (slope) {
			case Slope.POS_NORTH:
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, iconHasFloatingHeight(icon) ? vMax : vMin, 1);
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, iconHasFloatingHeight(icon) ? vMax : vMin, 1);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, vMin, 2);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMax, 3);
				break;
			case Slope.POS_SOUTH:
				setupVertex(renderBlocks, xMin, yMax, zMax, uMin, vMax, 0);
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, vMin, 1);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, iconHasFloatingHeight(icon) ? vMax : vMin, 2);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, iconHasFloatingHeight(icon) ? vMax : vMin, 2);
				break;
			case Slope.NEG_NORTH:
				setupVertex(renderBlocks, xMin, yMax, zMax, uMin, vMax, 0);
				setupVertex(renderBlocks, xMin, yMax, zMax, uMin, vMax, 0);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, vMin, 2);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMax, 3);
				break;
			case Slope.NEG_SOUTH:
				setupVertex(renderBlocks, xMin, yMax, zMax, uMin, vMax, 0);
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, vMin, 1);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMax, 3);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMax, 3);
				break;
			default:
				setupVertex(renderBlocks, xMin, yMax, zMax, uMin, vMax, 0);
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, vMin, 1);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, vMin, 2);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMax, 3);
		}
	}

	/**
	 * Renders the given texture to the north (x-negative) face of the block.  Args: slope, x, y, z, texture
	 */
	public static void renderFaceXNeg(RenderBlocks renderBlocks, int slope, double x, double y, double z, Icon icon)
	{
		double uMin = icon.getInterpolatedU(renderBlocks.renderMinZ * 16.0D);
		double uMax = icon.getInterpolatedU(renderBlocks.renderMaxZ * 16.0D);
		double vMax = icon.getInterpolatedV(16.0D - renderBlocks.renderMaxY * 16.0D);
		double vMin = icon.getInterpolatedV(16.0D - renderBlocks.renderMinY * 16.0D);

        double xMin = x + renderBlocks.renderMinX;
        double xMax = x + renderBlocks.renderMaxX;
        double yMin = y + renderBlocks.renderMinY;
        double yMax = y + renderBlocks.renderMaxY;
        double zMin = z + renderBlocks.renderMinZ;
        double zMax = z + renderBlocks.renderMaxZ;
		
		switch (slope) {
			case Slope.POS_EAST:
				setupVertex(renderBlocks, xMin, yMax, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, iconHasFloatingHeight(icon) ? vMax : vMin, 2);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, iconHasFloatingHeight(icon) ? vMax : vMin, 2);
				setupVertex(renderBlocks, xMin, yMin, zMax, uMax, vMin, 3);
				break;
			case Slope.POS_WEST:
				setupVertex(renderBlocks, xMin, yMin, zMax, uMax, iconHasFloatingHeight(icon) ? vMax : vMin, 3);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMin, yMin, zMax, uMax, iconHasFloatingHeight(icon) ? vMax : vMin, 3);
				break;
			case Slope.NEG_EAST:
				setupVertex(renderBlocks, xMin, yMax, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMin, yMin, zMax, uMax, vMin, 3);
				break;
			case Slope.NEG_WEST:
				setupVertex(renderBlocks, xMin, yMax, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMin, yMax, zMax, uMax, vMax, 0);
				break;
			case Slope.SIDE_NE:
				setupVertex(renderBlocks, xMin, yMax, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMin, yMin, zMax, uMax, vMin, 3);
				break;				
			case Slope.SIDE_NW:
				setupVertex(renderBlocks, xMax, yMax, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMax, vMin, 3);
				break;
			default:
				setupVertex(renderBlocks, xMin, yMax, zMax, uMax, vMax, 0);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMin, vMax, 1);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMin, vMin, 2);
				setupVertex(renderBlocks, xMin, yMin, zMax, uMax, vMin, 3);
		}
	}

	/**
	 * Renders the given texture to the south (x-positive) face of the block.  Args: slope, x, y, z, texture
	 */
	public static void renderFaceXPos(RenderBlocks renderBlocks, int slope, double x, double y, double z, Icon icon)
	{
		double uMin = icon.getInterpolatedU(renderBlocks.renderMinZ * 16.0D);
		double uMax = icon.getInterpolatedU(renderBlocks.renderMaxZ * 16.0D);
		double vMax = icon.getInterpolatedV(16.0D - renderBlocks.renderMaxY * 16.0D);
		double vMin = icon.getInterpolatedV(16.0D - renderBlocks.renderMinY * 16.0D);

        double xMin = x + renderBlocks.renderMinX;
        double xMax = x + renderBlocks.renderMaxX;
        double yMin = y + renderBlocks.renderMinY;
        double yMax = y + renderBlocks.renderMaxY;
        double zMin = z + renderBlocks.renderMinZ;
        double zMax = z + renderBlocks.renderMaxZ;
		
		switch (slope) {
			case Slope.POS_EAST:
				setupVertex(renderBlocks, xMax, yMin, zMax, uMin, vMin, 0);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, iconHasFloatingHeight(icon) ? vMax : vMin, 1);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, iconHasFloatingHeight(icon) ? vMax : vMin, 1);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMin, vMax, 3);
				break;
			case Slope.POS_WEST:
				setupVertex(renderBlocks, xMax, yMin, zMax, uMin, iconHasFloatingHeight(icon) ? vMax : vMin, 0);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, vMin, 1);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMax, 2);
				setupVertex(renderBlocks, xMax, yMin, zMax, uMin, iconHasFloatingHeight(icon) ? vMax : vMin, 0);
				break;
			case Slope.NEG_EAST:
				setupVertex(renderBlocks, xMax, yMin, zMax, uMin, vMin, 0);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMax, 2);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMax, 2);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMin, vMax, 3);
				break;
			case Slope.NEG_WEST:
				setupVertex(renderBlocks, xMax, yMax, zMax, uMin, vMax, 3);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, vMin, 1);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMax, 2);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMin, vMax, 3);
				break;	
			case Slope.SIDE_SE:
				setupVertex(renderBlocks, xMax, yMin, zMax, uMin, vMin, 0);
				setupVertex(renderBlocks, xMin, yMin, zMin, uMax, vMin, 1);
				setupVertex(renderBlocks, xMin, yMax, zMin, uMax, vMax, 2);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMin, vMax, 3);
				break;
			case Slope.SIDE_SW:
				setupVertex(renderBlocks, xMin, yMin, zMax, uMin, vMin, 0);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, vMin, 1);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMax, 2);
				setupVertex(renderBlocks, xMin, yMax, zMax, uMin, vMax, 3);
				break;
			default:
				setupVertex(renderBlocks, xMax, yMin, zMax, uMin, vMin, 0);
				setupVertex(renderBlocks, xMax, yMin, zMin, uMax, vMin, 1);
				setupVertex(renderBlocks, xMax, yMax, zMin, uMax, vMax, 2);
				setupVertex(renderBlocks, xMax, yMax, zMax, uMin, vMax, 3);
		}
	}
}